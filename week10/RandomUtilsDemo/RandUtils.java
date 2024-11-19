import java.util.List;
import java.util.Random;

/**
 * A RandUtils osztály hasznos statikus metódusokat tartalmaz a véletlenszám-generáláshoz.
 * Ez az osztály három alapvető metódust kínál a véletlenszerű számok előállítására:
 * - randint() egy adott intervallumban
 * - randrange() egy intervallumban adott lépésközzel
 * - choice() véletlenszerűen kiválaszt egy elemet egy listából
 */
public class RandUtils {
    private static final Random RANDOM = new Random();

    /**
     * Privát konstruktor, hogy az osztály csak statikusan legyen használható,
     * tehát nem szükséges példányosítani.
     */
    private RandUtils() {
        // A konstruktor üres, mivel az osztály összes metódusa statikus.
    }

    /**
     * Véletlenszerű egész számot generál egy adott [min, max] intervallumban.
     *
     * @param min Az intervallum alsó határa (beleértve).
     * @param max Az intervallum felső határa (beleértve).
     * @return Véletlenszerű egész szám a [min, max] tartományból.
     */
    public static int randint(int min, int max) {
        /** 
         * A RANDOM.nextInt() metódus segítségével generálunk egy véletlenszámot a kívánt intervallumban.
         * Az (max - min + 1) értéket alkalmazzuk, hogy biztosítsuk a kívánt intervallum zártságát, 
         * tehát a generált szám tartalmazza a max értéket is.
         * A min értékhez hozzáadjuk a generált számot, hogy a tartomány a kívánt [min, max] közé essen.
         */
        return min + RANDOM.nextInt(max - min + 1);
    }

    /**
     * Véletlenszerű egész számot generál egy adott [start, stop) intervallumban adott lépésközzel.
     *
     * @param start Az intervallum kezdőértéke (beleértve).
     * @param stop Az intervallum felső határa (kizárva).
     * @param step A lépésköz értéke.
     * @return Véletlenszerű szám a megadott intervallumból lépésköz figyelembevételével.
     */
    public static int randrange(int start, int stop, int step) {
        /** 
         * Először meghatározzuk az intervallumban található lépések számát.
         * Az intervallum hosszát (stop - start) elosztjuk a lépésközzel (step).
         * A szorzás eredményeként a lépések számát kapjuk, amelyből egy véletlenszerű számot választunk.
         * Az (stop - start + step - 1) formula alkalmazásával biztosítjuk, hogy a lépésköz figyelembevételével
         * az intervallum legfelső határa előtt is helyesen generálódjanak a számok.
         */
        int rangeSize = (stop - start + step - 1) / step;   // Felkerekítés a step értékre.
        return start + (RANDOM.nextInt(rangeSize) * step);  // Véletlenszerű szám generálása lépéseként.
    }

    /**
     * Véletlenszerűen kiválaszt egy elemet egy adott listából.
     *
     * @param items A lista, amelyből a véletlenszerű elemet választjuk.
     * @param <T> A lista elemeinek típusa.
     * @return Véletlenszerűen kiválasztott elem a listából.
     */
    public static <T> T choice(List<T> items) {
        /** 
         * Az items lista méretét használva generálunk egy véletlen indexet a lista elemének kiválasztásához.
         * A RANDOM.nextInt() segítségével véletlenszerűen kiválasztjuk az indexet.
         * Az index a lista méretéhez van igazítva, tehát biztosítjuk, hogy az index ne haladja meg a lista határait.
         * Ha a lista üres, az IllegalArgumentException kivételt dobunk, mivel nem lehetséges elem választása.
         */
        if (items.isEmpty()) {
            throw new IllegalArgumentException("A lista nem lehet üres.");
        }
        int randomIndex = RANDOM.nextInt(items.size());  // Véletlen index generálása.
        return items.get(randomIndex);                  // A véletlenszerűen kiválasztott elem visszaadása.
    }
}
