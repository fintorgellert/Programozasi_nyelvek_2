package Programozasi_nyelvek_2.week02.StringExample;
/* 
    String példák Java nyelven

    Ez a program bemutatja a String típus használatát és a kapcsolódó metódusokat.
    A program különböző String műveleteket hajt végre és az eredményeket kiírja a konzolra.

    Fordítás és futtatás terminálban:
    1. Fordítás: javac StringExample.java
    2. Futtatás: java StringExample 
*/

public class StringExample
{
    public static void main(String[] args)
    {
        /*
            A String osztály Java-ban egy immutable (változtathatatlan) objektum, ami azt jelenti,
            hogy a String objektum létrehozása után annak tartalmát nem lehet módosítani.
            Ha egy String változót módosítunk, akkor valójában egy új String példány jön létre.
            A String a heap memóriában tárolódik, és a String literálok a String pool-ban
            kerülnek tárolásra, hogy optimalizálják a memóriahasználatot.
         */
        
        // String példányok létrehozása
        String s1 = new String("Hello");    // String objektum létrehozása új példányként.
        String s2 = "World";                // String literal, egyszerűbb és hatékonyabb, a String pool-ból.

        /* 
            Stringek indexelése nem közvetlen, a charAt() metódussal érhetünk el egy adott
            karaktert egy adott index alapján. 
            Itt például az 'l' karaktert próbáljuk elérni az index 3 helyén.
        */
        System.out.println(s2.charAt(3));  // Eredmény: 'l'
            
        // Két String összefűzése és kiírása
        // Az összefűzés egy új String objektumot eredményez.
        System.out.println(s1 + s2);        // Eredmény: "HelloWorld"

        System.out.println();
        
        /* 
            substring() metódus használata

            A substring(start) egy adott index-től a végéig adja vissza a String részt.
            A substring(start, end) egy adott index-tartományból ad vissza egy részt, ahol
            az end index nem tartozik bele. 
        */
        System.out.println("unhappy".substring(2));     // Eredmény: "happy" (index 2-től a végéig)
        System.out.println("smile".substring(1, 5));    // Eredmény: "mile" (index 1-től 5-ig, 5 nem tartozik bele)

        System.out.println();

        // String változó és substring() metódus további példái
        String superhero = "batman";
        System.out.println(superhero.substring(0, 3));  // Eredmény: "bat" (index 0-tól 3-ig, 3 nem tartozik bele)
        System.out.println(superhero.substring(3));     // Eredmény: "man" (index 3-tól a végéig)
        System.out.println(superhero.substring(1, 4));  // Eredmény: "atm" (index 1-től 4-ig, 4 nem tartozik bele)

        System.out.println();

        // Még egy substring() példa másik String változóval
        String videoGame = "Fallout: New Vegas";
        System.out.println(videoGame.substring(4, 7));  // Eredmény: "out" (index 4-től 7-ig, 7 nem tartozik bele)
        System.out.println(videoGame.substring(13));    // Eredmény: "Vegas" (index 13-tól a végéig)

        System.out.println();

        /* 
            Láncolt metódushívás (chained method call)

            A toUpperCase() metódus egy új Stringet ad vissza, amely minden karaktert nagybetűsre konvertál.
            A substring() metódus utána a nagybetűs Stringből az első 3 karaktert adja vissza. 
        */
        System.out.println(superhero.toUpperCase().substring(0, 3));    // Eredmény: "BAT" (először nagybetűs, majd az első 3 karakter)

        System.out.println();

        // String metódusok példái, mint length(), toUpperCase(), toLowerCase()
        String languages = "       Java, C, C++, C#, python        ";

        // length() metódus visszaadja a String teljes hosszát, beleértve a szóközöket is.
        System.out.println(languages.length());         // Eredmény: 43 (a teljes hossz, beleértve a szóközöket is)
        
        // toUpperCase() metódus egy új Stringet ad vissza, ahol minden karakter nagybetűs.
        System.out.println(languages.toUpperCase());    // Eredmény: "       JAVA, C, C++, C#, PYTHON        " (minden karakter nagybetűs)
        
        // Az eredeti String nem változik meg, a metódusok új Stringeket adnak vissza.
        System.out.println(languages);

        // toLowerCase() metódus egy új Stringet ad vissza, ahol minden karakter kisbetűs.
        System.out.println(languages.toLowerCase());    // Eredmény: "       java, c, c++, c#, python        " (minden karakter kisbetűs)
        
        System.out.println();

        // indexOf() metódus használata, hogy megtaláljuk a karakterek vagy stringek első előfordulását
        // Az indexOf() visszaadja az első előfordulás indexét vagy -1-et, ha nem található.
        System.out.println(languages.indexOf('a'));     // Eredmény: 7 (az első 'a' indexe)
        System.out.println(languages.indexOf("va"));    // Eredmény: 8 (az első "va" kezdő indexe)
        System.out.println(languages.indexOf('x'));     // Eredmény: -1 (a karakter nem található a stringben)

        System.out.println();

        // trim() metódus, startsWith(), endsWith(), contains() metódusok használata
        // A trim() eltávolítja a szóközöket a String elejéről és végéről.
        String clearLanguages = languages.trim();
        System.out.println(clearLanguages);             // Eredmény: "Java, C, C++, C#, python" (a szóközök eltávolítása az elejéről és végéről)
        
        /* 
            startsWith() ellenőrzi, hogy a String a megadott alstringgal kezdődik.
            endsWith() ellenőrzi, hogy a String a megadott alstringgal végződik.
            contains() ellenőrzi, hogy a String tartalmazza-e a megadott alstringet. 
        */
        System.out.println(clearLanguages.startsWith("Java"));    // Eredmény: true (a string "Java"-val kezdődik)
        System.out.println(clearLanguages.startsWith("C"));       // Eredmény: false (a string nem kezdődik "C"-vel)
        System.out.println(clearLanguages.endsWith("python"));    // Eredmény: true (a string "python"-nal végződik)
        System.out.println(clearLanguages.endsWith("C#"));        // Eredmény: false (a string nem végződik "C#"-nal)
        System.out.println(clearLanguages.contains("++"));        // Eredmény: true (a string tartalmaz "++"-t)
        System.out.println(clearLanguages.contains("Pascal"));    // Eredmény: false (a string nem tartalmaz "Pascal"-t)

        System.out.println();

        /* 
            replace() metódus használata, ami kicserél egy alstringet egy másikra
            
            A replace() metódus egy új Stringet ad vissza, ahol az összes előfordulása a megadott alstringnek
            helyettesítve van a másik alstringgel. 
        */
        System.out.println(clearLanguages);                              // Eredeti string kiírása
        System.out.println(clearLanguages.replace("python", "Python"));  // Eredmény: "Java, C, C++, C#, Python" (a "python" helyett "Python")
    }
}
