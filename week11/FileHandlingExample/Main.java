import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ez a program bemutatja a fájlba írást és fájlból olvasást Java nyelven.
 * A következő funkciókat tartalmazza:
 * 
 * 1. Fájlba írás (`writeToFile`):
 *    - Használja a `FileWriter` és `BufferedWriter` osztályokat.
 *    - Ír adatokat egy fájlba, és bezárja az erőforrásokat a `try-with-resources` segítségével.
 * 
 * 2. Fájlból olvasás (`readFromFile`):
 *    - Használja a `FileReader` és `BufferedReader` osztályokat.
 *    - Soronként beolvassa és megjeleníti a fájl tartalmát.
 * 
 * 3. Kivételkezelés:
 *    - Megfelelően kezeli az `IOException` és `FileNotFoundException` kivételeket.
 * 
 * @author student
 */
public class Main {

    public static void main(String[] args) {
        // A fájl neve, amelyet a példákhoz használunk
        String fileName = "example.txt";

        // Fájlba írás hívása
        writeToFile(fileName, "This is an example text written to the file!\nThis is the second line.");

        // Fájlból olvasás hívása
        readFromFile(fileName);
    }

    /**
     * Adatok írása fájlba.
     * 
     * @param fileName A fájl neve, amelybe írni szeretnénk.
     * @param content Az írandó szöveg.
     */
    public static void writeToFile(String fileName, String content) {
        /*
         * Fájlba írás folyamata:
         * 
         * - `FileWriter`: Egy osztály, amely lehetővé teszi, hogy karaktereket írjunk egy adott fájlba.
         * - `BufferedWriter`: Egy pufferelt írásra alkalmas osztály, amely növeli az írás hatékonyságát.
         * - A `try-with-resources` szerkezet biztosítja, hogy a fájl automatikusan bezáródik,
         *   még akkor is, ha kivétel keletkezik az írás közben.
         */
        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            // Írjuk a megadott tartalmat a fájlba
            bufferedWriter.write(content);

            // Tájékoztató üzenet a sikeres írásról
            System.out.println("Data has been successfully written to the file: " + fileName);

        } catch (IOException e) {
            /*
             * IOException kezelése:
             * Ha a fájlírás közben hiba történik, például a fájl nem elérhető,
             * akkor itt kezeljük a hibát, és kiírjuk a hibaüzenetet.
             */
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    /**
     * Adatok olvasása egy fájlból.
     * 
     * @param fileName A fájl neve, amelyből olvasni szeretnénk.
     */
    public static void readFromFile(String fileName) {
        /*
         * Fájlból olvasás folyamata:
         * 
         * - `FileReader`: Egy osztály, amely lehetővé teszi karakterek beolvasását egy fájlból.
         * - `BufferedReader`: Egy pufferelt olvasást biztosító osztály, amely hatékonyabbá teszi az olvasást.
         * - A fájl tartalmát soronként olvassuk be a `readLine()` metódus segítségével.
         */
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            // Soronként olvassuk be a fájl tartalmát
            String line;
            System.out.println("File content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            /*
             * FileNotFoundException kezelése:
             * Ez a kivétel akkor keletkezik, ha a megadott fájl nem található.
             * Ezzel a hibakezeléssel tájékoztatást adunk arról, hogy a fájl nem elérhető.
             */
            System.err.println("The file was not found: " + fileName);
        } catch (IOException e) {
            /*
             * IOException kezelése:
             * Ha a fájl olvasása közben általános I/O hiba történik, például lemezhiba,
             * akkor itt kezeljük a hibát, és megjelenítjük a hibaüzenetet.
             */
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
