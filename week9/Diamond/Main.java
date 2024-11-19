import java.util.Scanner;

public class Main {

    /**
     * Ez a metódus egy szöveges promptot ír ki a felhasználónak, majd beolvassa a felhasználó által megadott bemenetet.
     * @param prompt A szöveg, amelyet a felhasználónak kiír a metódus.
     * @return A felhasználó által megadott szöveg.
     */
    static String input(String prompt) {
        Scanner scanner = new Scanner(System.in); // Scanner objektum létrehozása a bemenet kezeléséhez.
        System.out.print(prompt);                 // A prompt kiírása.
        String name = scanner.nextLine();         // Bemenet beolvasása a felhasználótól.
        scanner.close();                          // A Scanner lezárása, hogy felszabadítsa az erőforrásokat.
        return name;                              // A beolvasott szöveg visszaadása.
    }

    /**
     * Ez a metódus egy adott szélességű szöveget igazít középre.
     * @param width Az igazítandó szöveg szélessége.
     * @param s A szöveg, amelyet középre kell helyezni.
     * @return A középre igazított szöveg.
     */
    public static String centerString(int width, String s) {
        // Külső és belső formázás a középre helyezés érdekében.
        return String.format("%-" + width + "s", 
                String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
    }

    /**
     * Ez a metódus adott számú csillagot ír ki középre igazítva.
     * @param i A kiírandó csillagok száma.
     * @param n Az összesen rendelkezésre álló szélesség (a rombusz szélessége).
     */
    public static void printAsterisk(int i, int n) {
        StringBuilder asterisk = new StringBuilder(); // Dinamikus szövegépítés.

        for (int j = 0; j < i; j++) {                       // `i` számú csillagot ad a StringBuilder-hez.
            asterisk.append("*");
        }

        String out = centerString(n, asterisk.toString()); // A csillagok középre igazítása.
        System.out.println(out);                           // Az eredmény kiírása.
    }

    /**
     * Ez a metódus egy rombusz alakzatot rajzol a csillagokkal.
     * @param n A rombusz teljes szélessége/magassága (páratlan szám).
     */
    public static void diamond(int n) {
        // Felfelé épülő rész (növekvő csillagok száma).
        for (int i = 1; i < n + 1; i = i + 2) {
            printAsterisk(i, n);   // Minden sorhoz hívja a print_asterisk metódust.
        }

        // Lefelé csökkenő rész (csökkenő csillagok száma).
        for (int i = n - 2; i > 0; i = i - 2) {
            printAsterisk(i, n);   // Minden sorhoz hívja a print_asterisk metódust.
        }
    }

    public static void main(String[] args) {
        /**
         * A felhasználótól bekéri a rombusz magasságát.
         * Ezután ellenőrzi, hogy a magasság páratlan szám-e, mert a rombusz formázása így működik.
         */
        int heigth = Integer.parseInt(input("Adja meg a magasságot! "));    // Magasság bekérése és átalakítása számmá.

        // Assert állítás: biztosítja, hogy a magasság páratlan szám legyen.
        assert heigth % 2 != 0 : "páratlan szám kell";

        // A rombusz kirajzolása a megadott magassággal.
        diamond(heigth);
    }
}
