package Programozasi_nyelvek_2.week02.ScannerExample;
/*
    Scanner példák Java nyelven

    Ez a program bemutatja a Scanner osztály használatát a felhasználói bemenetek kezelésére.
    Két feladatot is tartalmaz: 
    1. Két szám összegének bekérése és kiíratása
    2. Egy egyedi metódus létrehozása a string bemenetek kezelésére.

    Fordítás és futtatás terminálban:
    1. Fordítás: javac ScannerExample.java
    2. Futtatás: java ScannerExample
*/

import java.util.Scanner;

public class ScannerExample
{
    /*
        Egyedi metódus, amely egy string bemenetet kér a felhasználótól.
        - A metódus paraméterként kap egy szöveget (prompt), amelyet kiír a konzolra.
        - Ezután bekéri a felhasználó által beírt sort, és visszaadja azt.

        Felhasználás:
        String name = input("Mi a neved?");
    */
    static String input(String prompt)
    {
        // Scanner objektum létrehozása a felhasználói bemenet olvasásához
        Scanner scanner = new Scanner(System.in);
        
        // Kiírjuk a megadott kérdést vagy üzenetet
        System.out.print(prompt);       

        // A felhasználó által beírt teljes sort olvassuk be
        String text = scanner.nextLine();

        // Scanner bezárása (bár nem szükséges, mivel nem hat az eredeti scanner objektumra)
        scanner.close();

        // Visszatérünk a felhasználó által megadott szöveggel
        return text;
    }

    public static void main(String[] args)
    {
        // Új Scanner objektum létrehozása
        Scanner scanner = new Scanner(System.in);

        /*
            Első feladat:
            Kérjünk be egy nevet a felhasználótól, majd üdvözöljük őt!

            A konzolon így fog kinézni:
                Your name: Anna
                Hello Anna!
        */
        System.out.print("Your name: ");
        String nev = scanner.nextLine();    // A felhasználó által megadott sor beolvasása
        
        // Kimenet: Üdvözöljük a felhasználót a nevével
        System.out.println("Hello " + nev + "!");

        System.out.println();

        /*
            Második feladat:
            Kérjünk be két egész számot a felhasználótól, majd számoljuk ki és írjuk ki az összegüket.

            A felhasználó konzolon történő interakciója így fog kinézni:
                First number: 5
                Second number: 10
                5 + 10 = 15
        */

        // Első szám bekérése a felhasználótól
        System.out.print("First number: ");
        int firstNumber = scanner.nextInt();                 // Első szám beolvasása egész számként

        // Második szám bekérése a felhasználótól
        System.out.print("Second number: ");
        int secondNumber = scanner.nextInt();                   // Második szám beolvasása egész számként

        // A két szám összegének kiszámítása és kiíratása
        int sum = firstNumber + secondNumber;
        System.out.printf("Sum of two numbers: %d\n", sum);     // Formázott kiíratás

        System.out.println();

        /*
            Harmadik feladat:
            Írjunk meg egy input() metódust, amely a következőt csinálja:
            1. Kiírja a paraméterként átadott stringet.
            2. Bekér egy stringet a felhasználótól.
            3. Visszatéríti a felhasználó által beírt stringet.

            A metódus használata a következőképpen fog kinézni:
                Neved: Anna
                Hello Anna!
        */

        // Az egyedi input metódus használata a felhasználó nevének bekéréséhez
        String name = input("Neved: ");  // Az input metódus kéri a felhasználó nevét
        System.out.println("Hello " + name + "!");  // Üdvözöljük a felhasználót a megadott névvel

        // Scanner bezárása
        scanner.close();
    }
}
