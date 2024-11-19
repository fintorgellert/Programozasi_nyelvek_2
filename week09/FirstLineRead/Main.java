package Programozasi_nyelvek_2.week09.FirstLineRead;
import java.util.List;

public class Main {

    /**
     * Ez a metódus körkörösen vizsgálja a számjegyek listáját, és kiszámítja azok összegét,
     * amelyek egymást követően megegyeznek. A körkörösséget úgy oldjuk meg, hogy az első elemet
     * a lista végéhez adjuk.
     * 
     * Példa:
     * Ha a lista: [1, 1, 2, 2], akkor az eredmény: 1 + 2 = 3.
     * Ha a lista: [9, 1, 1, 9], akkor az eredmény: 9.
     * 
     * @param digits A számjegyeket tartalmazó lista.
     * @return Az egymást követően megegyező számjegyek összege.
     */
    public static int summa(List<Integer> digits) {
        // Az első elem hozzáadása a lista végére.
        // Ez biztosítja a körkörösség kezelését, azaz az utolsó és az első elem is összehasonlítható.
        digits.add(digits.get(0));
        int sum = 0;

        // A lista elemein végigiterálunk, az utolsó elem kivételével.
        for (int i = 0; i < digits.size() - 1; i++) {
            // Az egymást követő elemek összehasonlítása.
            // Az equals metódus használatával biztosítjuk a helyes összehasonlítást.
            if (digits.get(i).equals(digits.get(i + 1))) {
                // Ha a két elem megegyezik, az aktuális értéket hozzáadjuk az összeghez.
                sum += digits.get(i);
            }
        }

        // Az eredmény visszaadása.
        return sum;
    }

    public static void main(String[] args) {
        /**
         * Különböző fájlneveket határozunk meg:
         * - `fname` : egy szövegfájl neve, amely tartalmazhat sorokat.
         * - `fname2`: egy fájl neve, amely számjegyeket tartalmaz.
         * - `fname3`: egy opcionális példa fájl neve (jelenleg kikommentelve).
         */
        String fname = "szoveg.txt";
        String fname2 = "day01.txt";
        // String fname3 = "pelda.txt";

        /**
         * A fájlból beolvasott sorok listájának kiírása:
         * A `FileUtils.readLines` metódus segítségével a fájl minden sorát listaként olvassuk be.
         * Minden egyes sor egy-egy listaelem.
         */
        List<String> sorok = FileUtils.readLines(fname);
        System.out.println(sorok);          // A fájl tartalmának kiírása sorokként.

        /**
         * Az első sor beolvasása:
         * A `FileUtils.readFirstLine` metódus csak az első sort olvassa be,
         * és azt szövegként adja vissza.
         */
        String first_line = FileUtils.readFirstLine(fname);
        System.out.println(first_line);     // Az első sor kiírása a konzolra.

        /**
         * A fájl első sorának számjegyeit listaként olvassuk be:
         * A `FileUtils.readFirstLineAsListOfDigits` metódus segítségével a fájl első sorában található
         * számjegyeket egy listává alakítjuk.
         * 
         * Példa:
         * Ha a fájl első sora "1122", akkor a lista: [1, 1, 2, 2].
         */
        List<Integer> digits = FileUtils.readFirstLineAsListOfDigits(fname2);

        /**
         * A számjegyek összegének kiszámítása:
         * A `summa` metódust meghívjuk a `digits` listával.
         * Ez visszaadja az egymást követő azonos számjegyek összegét.
         */
        int result = summa(digits);

        // Az összeg kiírása a konzolra.
        System.out.println(result);
    }
}
