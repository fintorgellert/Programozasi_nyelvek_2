public class ExceptionHandlingExample {

    /**
     * Ez a metódus bemutatja, hogyan kell egy kivételt dobni és azt kezelni.
     * A metódus egy egyszerű számtani műveletet végez, és egy nem nulla osztót vár.
     * Ha a felhasználó 0-t ad meg osztóként, akkor egy ArithmeticException kivételt dobunk.
     * 
     * @param numerator osztandó érték
     * @param denominator osztó érték
     */
    public static void divideNumbers(int numerator, int denominator) {
        try {
            // A szokásos osztás, amely kivételt eredményezhet, ha a nevező nulla
            int result = numerator / denominator;
            System.out.println("Eredmény: " + result);
        } catch (ArithmeticException e) {
            // Kivétel kezelés: ha osztunk nullával, akkor kivételt kapunk
            System.out.println("Hiba! Nem oszthatunk nullával.");
        }
    }

    /**
     * Ez a metódus bemutatja, hogyan lehet a kivételeket többféle módon kezelni.
     * A metódus megpróbálja beolvasni egy fájl tartalmát, ha hiba történik a fájl megnyitásakor
     * vagy az olvasásakor, akkor kétféle kivételt kezelünk.
     * 
     * @param fileName A beolvasni kívánt fájl neve
     */
    public static void readFile(String fileName) {
        try {
            // Itt egy fájl megnyitását szimuláljuk, amely hibát dob
            throw new java.io.FileNotFoundException("Fájl nem található.");
        } catch (java.io.FileNotFoundException e) {
            // Ez a blokk kezeli, ha a fájl nem található
            System.out.println("Hiba! A fájl nem található: " + e.getMessage());
        } catch (java.io.IOException e) {
            // Ez a blokk kezeli a be- és kimeneti hibákat
            System.out.println("Bemeneti/Hibás fájl olvasási hiba: " + e.getMessage());
        }
    }

    /**
     * Ez a metódus bemutatja, hogyan kell egy általános kivételt kezelni.
     * A try-catch blokk segítségével minden nem várt hibát el tudunk kapni,
     * amelyek nem a fenti specifikus kivételekhez tartoznak.
     */
    public static void handleGeneralException() {
        try {
            // Itt egy szándékosan hibás kódot hozunk létre, amely kivételt fog dobni
            int[] arr = new int[2];
            arr[5] = 10;  // Ez IndexOutOfBoundsException kivételt fog dobni
        } catch (Exception e) {
            // Ez a blokk kezeli az összes kivételt
            System.out.println("Hiba történt: " + e.getMessage());
            e.printStackTrace(); // A hiba részletes nyomtatása
        }
    }

    /**
     * A `finally` blokk arra szolgál, hogy biztosítsa a szükséges takarítást
     * akkor is, ha kivétel történt. A `finally` blokk végrehajtódik, függetlenül attól,
     * hogy történt-e kivétel vagy sem.
     * 
     * Itt a fájlkezelésnél például biztosítjuk, hogy a fájl bezáródjon,
     * akkor is, ha hiba történt.
     */
    public static void finallyBlockExample() {
        try {
            // Itt egy fájl műveletet végzünk, például fájl írás
            System.out.println("Fájl művelet folyamatban...");
        } catch (Exception e) {
            // Kivételt kezelünk, ha hiba történt
            System.out.println("Hiba történt a fájl művelet során.");
        } finally {
            // A finally blokk akkor is végrehajtódik, ha kivétel történt
            System.out.println("A fájl bezárása vagy egyéb tisztítási művelet...");
        }
    }

    /**
     * A fő metódus a program indítási pontja.
     * Itt hívjuk meg a különböző példákat, amelyek bemutatják a kivételkezelést.
     */
    public static void main(String[] args) {
        // Osztás nulla osztóval, kivételkezeléssel
        System.out.println("1. Kivételkezelés: Osztás nullával");
        divideNumbers(10, 0);

        // Fájl olvasás, különböző kivételek kezelésével
        System.out.println("\n2. Kivételkezelés: Fájl olvasás");
        readFile("nem_letezo_fajl.txt");

        // Általános kivétel kezelése
        System.out.println("\n3. Általános kivételkezelés");
        handleGeneralException();

        // A finally blokk bemutatása
        System.out.println("\n4. Finally blokk bemutatása");
        finallyBlockExample();
    }
}
