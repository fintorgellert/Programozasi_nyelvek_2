package Programozasi_nyelvek_2.week04.MultipleReturnValuesExample;
import java.util.Arrays;

/* 
    Egy egyszerű osztály, amely két egész számot (a, b) tárol.
    Ez az osztály arra szolgál, hogy több értéket adjunk vissza egy metódusból.
    Hasznos, ha egy metódusnak több összefüggő adatot kell visszaadnia (pl. minimum és maximum értéket).
 */
class PairIntInt {
    int a; // Az első változó, amely egy egész számot tárol (pl. minimum érték).
    int b; // A második változó, amely egy másik egész számot tárol (pl. maximum érték).
}

public class Main {

    // Ez a metódus egy tömböt ad vissza, amely két értéket tartalmaz: a minimumot és a maximumot.
    // Több értéket úgy adunk vissza, hogy egy tömbben vagy objektumban összefoglaljuk őket.
    public static int[] getMinMax(int[] array) {
        // Létrehozunk egy két elemű tömböt, ahol az első elem lesz a minimum és a második a maximum.
        int[] result = new int[2];

        result[0] = getMinValue(array);     // Beállítjuk a minimum értéket az első helyre.
        result[1] = getMaxValue(array);     // Beállítjuk a maximum értéket a második helyre.
        
        return result;                      // Visszaadjuk a két értéket tartalmazó tömböt.
    }

    // Ez a metódus egy PairIntInt objektumot ad vissza, amely tartalmazza a minimumot és a maximumot.
    // Itt egy objektumot használunk arra, hogy több különböző adatot együtt kezeljünk.
    public static PairIntInt getMinMax2(int[] array) {
        PairIntInt pair = new PairIntInt();     // Létrehozunk egy PairIntInt objektumot.
        
        pair.a = getMinValue(array);            // Az 'a' változóban tároljuk a minimum értéket.
        pair.b = getMaxValue(array);            // A 'b' változóban tároljuk a maximum értéket.
        
        return pair;                            // Visszaadjuk az objektumot, amely tartalmazza mindkét értéket.
    }

    // Például használt segédfüggvények a minimum és maximum érték kiszámításához.
    public static int getMinValue(int[] array) {
        int min = array[0];                 // Kezdetben feltételezzük, hogy az első elem a legkisebb.
        
        for (int value : array) {
            if (value < min) min = value;   // Ha találunk egy kisebb értéket, frissítjük a minimumot.
        }

        return min;                         // Visszaadjuk a legkisebb értéket.
    }

    public static int getMaxValue(int[] array) {
        int max = array[0];                 // Kezdetben feltételezzük, hogy az első elem a legnagyobb.
        
        for (int value : array) {
            if (value > max) max = value;   // Ha találunk egy nagyobb értéket, frissítjük a maximumot.
        }
        
        return max;                         // Visszaadjuk a legnagyobb értéket.
    }

    public static void main(String[] args) {
        int[] array = { 1, 56, 7, 8, 45, 2, 7};

        // Az első metódus használata, ahol egy tömböt kapunk vissza, amely a minimumot és maximumot tartalmazza.
        int[] result = getMinMax(array);
        System.out.println(Arrays.toString(result));        // Kiírjuk a tömb tartalmát (minimum és maximum értékek).

        // A második metódus használata, ahol egy objektumot kapunk vissza, amelyben két különálló értéket tárolunk.
        PairIntInt result2 = getMinMax2(array);
        System.out.println(result2.a + ", " + result2.b);   // Kiírjuk az objektumban tárolt minimum és maximum értékeket.
    }

    /* 
        Elméleti magyarázat:
        A több visszatérítési értékkel rendelkező metódusok lehetővé teszik,
        hogy egy metódus több információt adjon vissza egyetlen hívás során.
        Ez hasznos lehet például a minimum és maximum értékek visszatérésénél.

        Alapvetően két módszerrel érhetjük el a több visszatérítési értéket:
        1. Tömbök használatával: Visszatérhetünk egy tömbbel, amely tartalmazza a különböző értékeket.
            Tömböt csak akkor lehet használni, ha az értékek adattípusa megegyezik.
        2. Objektumok használatával: Használhatunk egy objektumot, amely több értéket tárol, és ezzel
            egy sokkal tisztább és bővíthetőbb megoldást kapunk.

        Fontos megjegyezni, hogy ha túl sok értéket próbálunk visszaadni egy metódusból,
        az kódunk olvashatóságát csökkentheti és bonyolultabbá teheti a karbantartást.
        Érdemes megfontolni, hogy a visszatérítendő értékek logikailag összetartoznak-e.
        Ha nem, akkor lehet, hogy más metódusokat kell használni.
    */
}
