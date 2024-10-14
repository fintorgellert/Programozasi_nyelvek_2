import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /* 
            A program bekéri két szám bevitelét a felhasználótól és összegzi azokat.
            Az input metódust használva olvassuk be a bemeneteket, amelyeket a parseInt() 
            segítségével int típussá alakítunk.
        */

        int x = Integer.parseInt(input("First number: "));  // Az első szám beolvasása és int-é konvertálása
        int y = Integer.parseInt(input("Second number: ")); // A második szám beolvasása és int-é konvertálása

        // A két szám összeadása
        int result = x + y;

        // Az eredmény kiírása a konzolra
        System.out.println(result);
    }

    // A metódus megjeleníti a prompt szöveget, majd beolvassa a felhasználó válaszát.
    // Visszaadja a beolvasott szöveget Stringként.
    static String input(String prompt)
    {
        // Scanner példányosítása, ami lehetővé teszi a konzolról való adatbevitelt.
        Scanner scanner = new Scanner(System.in);

        // A prompt szöveg megjelenítése a felhasználónak
        System.out.print(prompt);

        // A felhasználótól beolvasott sor tárolása a text változóban
        String text = scanner.nextLine();

        // Visszaadja a beolvasott Stringet, amely a felhasználó által megadott bemeneti adatot tartalmazza
        return text;

        // Fontos: A Scanner nem záródik be automatikusan, ezért hosszabb kódok esetén
        // érdemes megfontolni a scanner.close() használatát.
    }
}
