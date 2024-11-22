import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Ez az osztály egy programot valósít meg, amely lifteket kezel.
 * 
 * A program:
 * - Bemeneti fájlból olvassa be a liftek adatait és mozgási utasításokat.
 * - Kezeli a hibás bemeneteket és mozgásokat (pl. hibás irány, nem megfelelő adatformátum).
 * - A lift állapotát egy kimeneti fájlba írja.
 */
public class Runner2 {

    public static void main(String[] args) {

        // A lifteket egy listában tároljuk.
        List<Elevator> elevators = new ArrayList<>();

        /**
         * A try-with-resources blokk gondoskodik arról, hogy a fájlok automatikusan bezáródjanak.
         * 
         * - `args[0]`: A bemeneti fájl neve, amely tartalmazza a liftek adatait és utasításokat.
         * - `args[1]`: A kimeneti fájl neve, ahova a feldolgozott liftállapotokat írjuk.
         */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(args[1])))) {

            // A bemeneti fájl olvasása.
            BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));

            // Az első sor tartalmazza a liftek számát.
            int numberOfElevators = Integer.parseInt(reader.readLine());

            // Liftek inicializálása a bemeneti fájl alapján.
            for (int i = 0; i < numberOfElevators; i++) {
                try {
                    // Minden sor egy lift maximális emeletszámát adja meg.
                    elevators.add(new Elevator(Integer.parseInt(reader.readLine())));
                } catch (Exception e) {
                    /**
                     * Ha a bemeneti fájlban hibás adat található, alapértelmezett (10 emeletes) liftet hozunk létre.
                     */
                    System.out.println(e.getMessage());
                    elevators.add(new Elevator(10));
                }
            }

            // A fennmaradó sorok a liftek mozgási utasításait tartalmazzák.
            String line;
            while ((line = reader.readLine()) != null) {

                // A sorokat ";" mentén feldaraboljuk.
                String[] parts = line.split(";");
                try {
                    /**
                     * Az első rész a lift indexét adja meg (1-alapú), amelyet 0-alapúvá alakítunk.
                     */
                    int elevatorIndex = Integer.parseInt(parts[0]) - 1;

                    // A második rész a mozgás irányát adja meg: "fel" vagy "le".
                    if (parts[1].equals("fel")) {
                        elevators.get(elevatorIndex).moveUp();
                    } else {
                        elevators.get(elevatorIndex).moveDown();
                    }

                    // Az aktuális lift állapotát kiírjuk a konzolra.
                    System.out.println(elevators.get(elevatorIndex));

                    /**
                     * Az aktuális lift állapotát a kimeneti fájlba is rögzítjük.
                     */
                    writer.write(elevators.get(elevatorIndex).toString());
                    writer.newLine();

                } catch (NumberFormatException e) {
                    /**
                     * Ha egy sor formátuma hibás, azt jelezzük.
                     */
                    System.out.println("Incorrect row!");
                }
            }

        } catch (InvalidDirectionException e) {
            /**
             * Hibás mozgási irány kezelése, például ha a lift már a legfelső vagy legalsó emeleten van.
             */
            System.out.println(e.getMessage() + " Error code: " + e.getErrorCode());

        } catch (Exception e) {
            /**
             * Egyéb kivételek, például fájlműveletekkel kapcsolatos hibák kezelése.
             */
            System.out.println(e.getMessage());
        }
    }
}
