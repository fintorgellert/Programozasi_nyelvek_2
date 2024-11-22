import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

/**
 * Ez az osztály egy programot valósít meg, amely lifteket kezel.
 * 
 * A program:
 * - Inicializálja a liftek listáját egy bemeneti fájl alapján.
 * - Kezeli a liftek mozgását (felfelé és lefelé).
 * - Kezeli a hibákat, például érvénytelen mozgási utasításokat.
 * - Naplózza a lift aktuális állapotát egy kimeneti fájlba.
 */
public class Runner {

    public static void main(String[] args) {

        // A liftek listáját tároljuk egy ArrayList-ben.
        List<Elevator> elevators = new ArrayList<>();

        /**
         * A try-with-resources blokk biztosítja, hogy a fájlokat megfelelően bezárjuk a program végeztével.
         * - `args[0]`: A bemeneti fájl neve, amely tartalmazza a liftek inicializálási adatait és utasításokat.
         * - `args[1]`: A kimeneti fájl neve, ahova az eredményeket írjuk.
         */
        try (Formatter outputFile = new Formatter(new File(args[1])); 
             Scanner inputFile = new Scanner(new File(args[0]))) {

            // Az első sor tartalmazza a liftek számát.
            int numberOfElevators = Integer.parseInt(inputFile.nextLine());

            // Liftek inicializálása a fájl alapján.
            for (int i = 0; i < numberOfElevators; i++) {
                try {
                    // Minden sor egy lift maximális emeletszámát adja meg.
                    elevators.add(new Elevator(Integer.parseInt(inputFile.nextLine())));
                } catch (Exception e) {
                    /**
                     * Ha a bemeneti fájlban hibás adat van, alapértelmezett (10 emeletes) liftet hozunk létre.
                     */
                    System.out.println(e.getMessage());
                    elevators.add(new Elevator(10));
                }
            }

            // A fennmaradó sorok a liftek mozgását adják meg.
            while (inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                String[] parts = line.split(";");

                try {
                    /**
                     * Az első rész a lift indexét adja meg (1-től kezdődően).
                     * Az indexet 0-alapúvá alakítjuk.
                     */
                    int elevatorIndex = Integer.parseInt(parts[0]) - 1;

                    // A második rész a mozgás irányát határozza meg: "fel" vagy "le".
                    if (parts[1].equals("fel")) {
                        elevators.get(elevatorIndex).moveUp();
                    } else {
                        elevators.get(elevatorIndex).moveDown();
                    }

                    /**
                     * Az aktuális lift állapotát kiírjuk a konzolra.
                     */
                    System.out.println(elevators.get(elevatorIndex));

                    /**
                     * Az aktuális lift állapotát a kimeneti fájlba is naplózzuk.
                     */
                    outputFile.format("Elevator: %s Current floor: %d\n", 
                            elevators.get(elevatorIndex).toString(), 
                            elevators.get(elevatorIndex).getCurrentFloor());

                } catch (NumberFormatException e) {
                    /**
                     * Ha a sor nem megfelelő formátumú, azt jelezzük.
                     */
                    System.out.println("Incorrect row!");
                }
            }

        } catch (InvalidDirectionException e) {
            /**
             * Kezeli a hibás mozgási irányokat, például ha a lift már az alsó vagy felső szinten van.
             */
            System.out.println(e.getMessage() + " Error code: " + e.getErrorCode());

        } catch (Exception e) {
            /**
             * Kezeli az összes egyéb kivételt, például fájlműveletekkel vagy más nem várt hibákkal kapcsolatosakat.
             */
            System.out.println(e.getMessage());
        }
    }
}
