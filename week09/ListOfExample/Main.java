package Programozasi_nyelvek_2.week09.ListOfExample;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Az immutábilis lista létrehozása:
         * A `List.of` metódus egy új, változtathatatlan (immutable) listát hoz létre.
         * Ez azt jelenti, hogy a lista tartalmát nem lehet módosítani:
         * - Nem adhatunk hozzá új elemeket.
         * - Nem törölhetünk belőle elemeket.
         * - Nem módosíthatjuk a meglévő elemek értékét.
         */
        List<Integer> li = List.of(3, 8, 1, 6);     // immutable lista létrehozása.
        System.out.println(li.toString());          // A lista tartalmának kiírása.

        // Az alábbi műveletek hibát okoznának, mert az `li` lista immutábilis:
        // li.add(4);      // Hiba: Nem adhatunk hozzá új elemet.
        // li.set(0, 99);  // Hiba: Nem módosíthatjuk a lista elemeit.

        /**
         * Módosítható lista létrehozása:
         * Az `ArrayList` konstruktor segítségével egy módosítható listát hozunk létre,
         * amely az `List.of` által létrehozott lista elemeit tartalmazza.
         * 
         * Most már végezhetünk a listán olyan műveleteket, mint:
         * - Új elemek hozzáadása (`add`).
         * - Elemek módosítása (`set`).
         * - Elemek törlése (`remove`).
         */
        List<Integer> li2 = new ArrayList<>(List.of(3, 6, 9));  // Módosítható lista létrehozása.
        System.out.println(li2.toString());                     // A módosítható lista tartalmának kiírása.

        // Új elem hozzáadása a listához.
        li2.add(5);         // A lista végére hozzáadjuk az 5-ös elemet.

        // Az első elem módosítása.
        li2.set(0, 44);     // Az első elem értékét 44-re változtatjuk.

        // A módosított lista kiírása.
        System.out.println(li2.toString()); // Az új lista tartalma: [44, 6, 9, 5].
    }
}
