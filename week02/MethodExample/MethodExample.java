package Programozasi_nyelvek_2.week02.MethodExample;
/*
    Metódusok példája Java nyelven

    Ez a program különböző metódusokat mutat be Java-ban, amelyek visszatérési értékkel rendelkeznek.
    1. Egy egyszerű metódus egész szám duplázására
    2. Két különböző mód a kimenet formázott kiírására (egyszerű string concatenation és printf formázás).

    Fordítás és futtatás terminálban:
    1. Fordítás: javac MethodExample.java
    2. Futtatás: java MethodExample
*/

public class MethodExample {

    // Ez a metódus duplázza a paraméterként átadott számot és visszaadja az eredményt.
    static int doubleNumber(int n) {
        return 2 * n;
    }

    // Ez a metódus egy üdvözlő szöveget ad vissza a megadott névvel.
    static String greeting(String name) {
        return "Hello " + name + "!";  
    }

    // Ez a metódus formázott szöveget ad vissza a megadott névvel a printf stílusú formázással.
    static String formattedGreeting(String name) {
        return String.format("Hello %s!", name);  
    }

    public static void main(String[] args)
    {
        // Első feladat: egy szám duplázása
        int n = 253;
        int result = doubleNumber(n);       // Meghívjuk a doubleNumber() metódust, ami visszaadja a szám kétszeresét

        // A duplázott szám kiíratása formázott kiírással (printf)
        System.out.printf("2 * %d = %d\n", n, result);

        // Elválasztó vonalak kiírása
        System.out.println("-------");
        System.out.println("-".repeat(5));  // Alternatív módszer a vonalak megjelenítésére

        // Második feladat: Üdvözlés két különböző módszerrel
        // 1. Egyszerű string összefűzés
        String text = greeting("Anna");
        System.out.println(text);           // Az üdvözlő szöveg kiírása

        // 2. Formázott string kiírás (String.format metódus használatával)
        String text2 = formattedGreeting("Anna");
        System.out.println(text2);          // A formázott üdvözlés kiírása
    }
}
