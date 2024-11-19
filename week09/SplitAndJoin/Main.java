package Programozasi_nyelvek_2.week09.SplitAndJoin;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Split egy egyszerű karakterrel
        String s = "aa:bb:cc:dd";

        /* 
         * A split() metódus egy adott karakter vagy reguláris kifejezés mentén szétválasztja a sztringet.
         * Itt a ':' karakter a választó. Az eredmény egy String tömb, amely tartalmazza a szétválasztott elemeket. 
         */
        String[] result = s.split(":");                 // String[4] { "aa", "bb", "cc", "dd" }

        // Az eredményt kiírjuk, ami az elemeket egy tömb formájában jeleníti meg.
        System.out.println(Arrays.toString(result));    // Eredmény: [aa, bb, cc, dd]


        // 2. Split szóközökkel
        s = "    aa     44               g5       ";

        /* 
         * Itt a split() metódust szóközökkel hívjuk meg, tehát minden szóköznél szétválasztja a sztringet.
         * Az eredmény egy String tömb lesz, amely minden egyes szavunkat külön elemként tartalmazza.
         */
        String[] result2 = s.split(" ");

        // Az eredmény tartalmazni fogja az üres karaktereket is a szélén, mivel a szóközöket egyszerű karakterként kezeljük.
        System.out.println(Arrays.toString(result2)); // Eredmény: [, , , , aa, , , , , 44, , , , , , , , , , , , , , , g5]


        // 3. Split több szóköz esetén
        /* 
        * Itt a reguláris kifejezést "\\s+" használjuk, amely a következőket jelenti:
        * - "\\s+" - egy vagy több egymást követő whitespace karakter (szóköz, tabulátor stb.).
        * Ez lehetővé teszi, hogy a szöveget a whitespace karakterek csoportos előfordulásai mentén daraboljuk fel.
        * Fontos: Ha a szöveg elején vannak whitespace karakterek, akkor a `split()` az első elemként 
        * egy üres karakterláncot (String) fog visszaadni.
        */
        String[] result3 = s.split("\\s+");

        // Az eredmény egy tömb lesz, amely a szöveg elemeit tartalmazza, figyelmen kívül hagyva 
        // a többszörös szóközöket, de az elején lévő üres karakterlánc továbbra is megjelenhet.
        System.out.println(Arrays.toString(result3)); // Eredmény: [, aa, 44, g5]



        // 4. Split és trim
        /*
         * A trim() metódus eltávolítja a felesleges szóközöket a sztring elejéről és végéről,
         * majd a split("\\s+") továbbra is eltávolítja a középső extra szóközöket.
         */
        String[] result4 = s.trim().split("\\s+");

        // Az eredmény már nem tartalmaz előtte és utána felesleges szóközöket.
        System.out.println(Arrays.toString(result4)); // Eredmény: [aa, 44, g5]


        // 5. Stringek összekapcsolása
        /*  
         * A String.join() metódus segítségével egy adott karakterrel összekapcsolhatjuk a tömb elemeit.
         * Itt a ":" karakter lesz a választó, és az elems tömb elemei között megjelenik.
         */
        String[] elems = { "aa", "bb", "cc" };

        String result5 = String.join(":", elems);   // "aa:bb:cc"
        System.out.println(result5);                // Eredmény: aa:bb:cc
    }
}
