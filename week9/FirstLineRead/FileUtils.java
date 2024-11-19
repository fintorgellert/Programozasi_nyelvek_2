import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils
{
    /**
     * Ez a metódus egy fájlból soronként olvassa be az adatokat, és azokat egy listában tárolja.
     *
     * @param fileName A fájl neve, amelyből az adatokat be kell olvasni.
     * @return A fájl sorainak listája.
     */
    public static List<String> readLines(String fileName)
    {
        // A sorokat tároló lista inicializálása.
        List<String> lines = new ArrayList<String>();

        try
        {
            String line; // Egy változó az egyes sorok tárolására.

            /**
             * A fájl olvasásához a `BufferedReader`-t használjuk:
             * - A `FileReader` a fájl biteket olvas be.
             * - A `BufferedReader` a biteket sorokká alakítja.
             */
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            // Az összes sor beolvasása a fájlból.
            while ((line = br.readLine()) != null)
            {
                // A beolvasott sor hozzáadása a listához.
                lines.add(line);
            }

            // Az olvasás után a fájlt lezárjuk, hogy erőforrásokat szabadítsunk fel.
            br.close();
        }
        catch (FileNotFoundException e)
        {
            /**
             * Ha a fájl nem található, akkor egy kivételt dobunk:
             * - Ezzel biztosítjuk, hogy a program ne folytassa a működését egy hiányzó fájllal.
             */
            e.printStackTrace();
            System.exit(1); // Kilépés hibaállapottal.
        }
        catch (IOException e)
        {
            /**
             * Ha egyéb bemeneti/kimeneti hiba történik:
             * - Például fájl olvasási problémák.
             */
            e.printStackTrace();
            System.exit(2); // Kilépés másik hibaállapottal.
        }

        return lines; // Az összegyűjtött sorok visszaadása.
    }

    /**
     * Ez a metódus a fájl első sorát adja vissza.
     *
     * @param filename A fájl neve, amelyből az adatokat be kell olvasni.
     * @return A fájl első sora.
     */
    public static String readFirstLine(String filename) {
        // A `readLines` metódus által visszaadott lista első elemét kérjük le.
        return readLines(filename).get(0);
    }

    /**
     * Ez a metódus a fájl első sorát számjegyek listájává alakítja.
     *
     * @param filename A fájl neve, amelyből az adatokat be kell olvasni.
     * @return A fájl első sorának számjegyei listaként.
     */
    public static List<Integer> readFirstLineAsListOfDigits(String filename) {
        // Az első sor beolvasása szövegként.
        String first = readFirstLine(filename);

        // Egy lista inicializálása az egyes számjegyek tárolására.
        List<Integer> result = new ArrayList<>();

        // A szöveg karakterenkénti feldolgozása.
        for (char c : first.toCharArray()) {
            // A karakterek számértékké alakítása és a lista feltöltése.
            result.add(Character.getNumericValue(c));
        }

        return result; // A számjegyek listájának visszaadása.
    }
}
