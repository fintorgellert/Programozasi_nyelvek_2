package Programozasi_nyelvek_2.week05.InputMethodOverloading;
// PyUtils osztály, amely segédfüggvényeket biztosít a felhasználói bemenetek kezelésére
import java.util.Scanner;

public class PyUtils {
    public PyUtils() {
        /* 
            Konstruktor, amely nem tartalmaz műveleteket, de lehetővé teszi az osztály példányosítását 
            (itt nem szükséges, mivel minden metódus statikus).
         */
    }

    // input() metódus, amely a felhasználói bemenetet prompt nélkül olvassa be
    public static String input() {
        Scanner scanner = new Scanner(System.in);

        // Beolvassa a teljes bemeneti sort a felhasználótól.
        String name = scanner.nextLine();
        return name;
    }

    // input(String prompt) metódus, amely egy prompt szöveget is kiír, majd beolvassa a felhasználói bemenetet
    public static String input(String prompt) {
        // Kiírja a prompt szöveget, majd beolvassa a bemeneti sort.
        System.out.print(prompt);

        // Az input() metódus meghívásával kéri be a felhasználói bemenetet.
        String name = input();
        return name;
    }
}
