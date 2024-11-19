public class Main
{
    // Metódus, amely ellenőrzi, hogy két tömb egyenlő-e
    // A két tömb akkor egyenlő, ha azonos a hosszúságuk és minden elemük egyenlő
    public static boolean equals(int[] array1, int[] array2) {
        // Ellenőrizzük, hogy a két tömb hosszúsága megegyezik-e
        if (array1.length == array2.length) {
            // Végigiterálunk az egyik tömbön, és összehasonlítjuk a megfelelő indexű elemeket
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) 
                    return false;   // Ha egy elem különbözik, akkor a tömbök nem egyenlőek
            }
        } else {
            return false;           // Ha a hosszúságok nem egyeznek, biztosan nem egyenlők
        }
        return true;                // Ha minden elem megegyezik, akkor a tömbök egyenlőek
    }


    // Metódus, amely feltölti a tömb minden elemét a megadott értékkel
    public static void fill(int[] array, int value) {
        // Iterálunk a tömb összes elemén, és mindegyiket beállítjuk a megadott értékre
        for (int index = 0; index < array.length; index++) {
            array[index] = value;
        }
    }


    // Metódus, amely ellenőrzi, hogy a tömb rendezett-e (növekvő sorrendben)
    public static boolean isSorted(int[] array) {
        // Végigiterálunk a tömbön az utolsó előtti elemig
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) 
                return false;       // Ha egy elem nagyobb a következőnél, akkor a tömb nem rendezett
        }
        return true;                // Ha minden elem a következőnél kisebb vagy egyenlő, akkor a tömb rendezett
    }


    // Metódus, amely visszaadja a tömb legkisebb elemét
    public static int getMinValue(int[] array) {
        int minValue = array[0];            // Feltételezzük, hogy az első elem a legkisebb

        // Végigiterálunk a tömbön, hogy megtaláljuk a legkisebb értéket
        for (int index = 1; index < array.length; index++) {
            if (minValue > array[index])
                minValue = array[index];    // Ha találunk kisebb értéket, frissítjük a minValue változót
        }

        return minValue;                    // Visszaadjuk a legkisebb értéket
    }


    // Metódus, amely visszaadja a tömb legnagyobb elemét
    public static int getMaxValue(int[] array) {
        int maxValue = array[0];            // Feltételezzük, hogy az első elem a legnagyobb

        // Végigiterálunk a tömbön, hogy megtaláljuk a legnagyobb értéket
        for (int index = 1; index < array.length; index++) {
            if (maxValue < array[index])
                maxValue = array[index];    // Ha találunk nagyobb értéket, frissítjük a maxValue változót
        }

        return maxValue;                    // Visszaadjuk a legnagyobb értéket
    }


    // Metódus, amely visszaadja a szomszédos elemek közötti magasságkülönbségek összegét
    public static int sumOfHeightDifferences(int[] array) {
        int sum = 0;                                // Összeg tárolására
        int lastValue = array[0];                   // Az első elem kezdő értékként szolgál

        // Végigiterálunk a tömb elemein
        for (int value : array) {
            sum += Math.abs(value - lastValue);     // Hozzáadjuk az abszolút különbséget a szomszédos elemek között
            lastValue = value;                      // Frissítjük az utolsó elemet a következő iterációra
        }

        return sum;                                 // Visszaadjuk a magasságkülönbségek összegét
    }


    public static void main(String[] args)
    {
        // Teszt tömbök létrehozása különböző metódusok teszteléséhez
        int[] array1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] array2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] array3 = { 21, 435, 325, 3, 4, 6, 32 };

        // equals metódus tesztelése - Ellenőrizzük, hogy az array1 és array2 megegyezik-e
        System.out.println("Are Array1 and Array2 equal? " + equals(array1, array2));   // true
        System.out.println("Are Array1 and Array3 equal? " + equals(array1, array3));   // false

        System.out.println();
        
        // isSorted metódus tesztelése - Ellenőrizzük, hogy a tömbök rendezettek-e
        System.out.println("Is Array1 sorted? " + isSorted(array1));    // true
        System.out.println("Is Array3 sorted? " + isSorted(array3));    // false
        
        System.out.println();
        
        // getMinValue és getMaxValue metódusok tesztelése
        System.out.println("Smallest element in Array3: " + getMinValue(array3));   // A tömb legkisebb eleme: 100
        System.out.println("Largest element in Array3: " + getMaxValue(array3));    // A tömb legnagyobb eleme: 100
        
        System.out.println();

        // fill metódus tesztelése - Feltöltjük array3 elemeit a 100-as értékkel
        fill(array3, 100);
        System.out.println("Array3 filled with 100: " + java.util.Arrays.toString(array3));     // [100, 100, 100, 100, 100, 100, 100]

        System.out.println();
        
        // Példa a magasságkülönbségek összegére
        // Létrehozunk egy tömböt, amely különböző épületek magasságait reprezentálja
        int[] skyscrapersHeight = { 1, 7, 9, 7, 6, 9, 3, 1, 3, 4, 8, 6, 2, 7, 3, 4, 3, 1, 0, 7, 2, 9, 4 };

        // Meghívjuk a sumOfHeightDifferences metódust, amely kiszámolja az egymást követő magasságok közötti
        // abszolút különbségek összegét. Ez a különbség egy épület és a szomszédos épület közötti magasságváltozást jelenti.
        System.out.println("Sum of height differences: " + sumOfHeightDifferences(skyscrapersHeight));

    }
}