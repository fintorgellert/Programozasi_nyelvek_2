import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * Két dimenziós tömb létrehozása:
         * - A `matrix` nevű 3x2-es mátrixot definiáljuk, amely három sorból és két oszlopból áll.
         * - Az összes elem alapértelmezetten 0 értékkel van inicializálva.
         */
        int[][] matrix = new int[3][2]; // 3 sor, 2 oszlop.
        
        // A mátrix első sorának (0. indexű) két elemét feltöltjük értékekkel.
        matrix[0][0] = 2;               // Az első sor első oszlopa értékének beállítása: 2.
        matrix[0][1] = 3;               // Az első sor második oszlopa értékének beállítása: 3.

        /**
         * A mátrix egyszerű kiírása:
         * Az `Arrays.toString` metódus csak a felső szintű tömböt írja ki, azaz
         * a tömbök memóriacímének reprezentációját adja vissza.
         */
        System.out.println(Arrays.toString(matrix));        // Kiírás: [I@..., [I@...]

        /**
         * A mátrix kiírása mélység szerint:
         * Az `Arrays.deepToString` metódus a tömb teljes struktúráját bejárja,
         * és a benne lévő elemek értékét adja vissza olvasható formában.
         */
        System.out.println(Arrays.deepToString(matrix));    // Kiírás: [[2, 3], [0, 0], [0, 0]]

        /**
         * Két dimenziós tömb közvetlen inicializálása:
         * - Az `matrix2` egy 3x2-es mátrix, amelyet közvetlenül feltöltünk értékekkel.
         * - A deklaráció és inicializálás egyszerre történik.
         */
        int[][] matrix2 = {
            { 2, 3 },       // Első sor
            { 5, 8 },       // Második sor
            { 7, 1 }        // Harmadik sor
        };

        /**
         * A `matrix2` kiírása mélység szerint:
         * Az `Arrays.deepToString` használatával kiírjuk a mátrix összes elemét.
         */
        System.out.println(Arrays.deepToString(matrix2)); // Kiírás: [[2, 3], [5, 8], [7, 1]]
    }
}