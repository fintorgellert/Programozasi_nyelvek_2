package Programozasi_nyelvek_2.week04.ArrayCopyExample;
// Mappa neve: ArrayCopyExample

// Main.java
public class Main {

    public static void main(String[] args) {
        // Létrehozunk egy eredeti tömböt 5 egész számmal.
        int[] originalArray = { 1, 2, 3, 4, 5 };

        // A tömb tartalmának kiírása a konzolra, hogy lássuk, mi van az eredeti tömbben.
        System.out.println("Original array:");
        for (int e : originalArray) {
            System.out.print(e + " ");
        }
        System.out.println();  // Új sor hozzáadása a formázáshoz.

        // Másolat készítése a tömbről a clone() metódus segítségével.
        // A clone() metódus egy új tömböt hoz létre, amely pontosan ugyanazokat az elemeket tartalmazza, mint az eredeti.
        int[] copiedArray = originalArray.clone();

        // Módosítjuk az eredeti tömb első elemét, hogy demonstráljuk, a másolat független az eredetitől.
        originalArray[0] = 99;

        // Kiírjuk a másolatot a konzolra, hogy lássuk, mi van a másolt tömbben.
        System.out.println("\nCopied array (unchanged):");
        for (int e : copiedArray) {
            System.out.print(e + " ");
        }
        System.out.println();

        // Kiírjuk az eredeti tömböt is, hogy lássuk, az első elemet megváltoztattuk.
        System.out.println("\nOriginal array (modified):");
        for (int e : originalArray) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
