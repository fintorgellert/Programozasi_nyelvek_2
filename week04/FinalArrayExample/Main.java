package Programozasi_nyelvek_2.week04.FinalArrayExample;
public class Main {

    public static void main(String[] args) {
        // Létrehozunk egy final kulcsszóval ellátott tömböt, amely 5 egész számot tartalmaz.
        // A final kulcsszó garantálja, hogy a tömb referencia (a numbers változó) nem mutathat másik tömbre a későbbiekben.
        final int[] numbers = {1, 2, 3, 4, 5};

        // Kiírjuk az eredeti tömb tartalmát a konzolra, hogy lássuk az alapállapotot.
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Habár a tömb final, az elemek értékeit megváltoztathatjuk.
        // Itt például a tömb első elemét 99-re módosítjuk. 
        // Ez megengedett, mivel a final csak a referencia állandóságát biztosítja, nem az elemek értékeit.
        numbers[0] = 99;

        // Kiírjuk a tömböt a módosítás után, hogy lássuk, az első elem értéke megváltozott.
        System.out.println("\nArray after modifying an element:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Próbálkozás a tömb újrahozzárendelésével egy másik tömbhöz.
        // Ezt a sort ki kell kommentezni, mert fordítási hibát okoz.
        // A final kulcsszó megakadályozza, hogy a numbers változó új tömbre mutasson.
        // numbers = new int[] {6, 7, 8, 9, 10};  // Hiba: A final változót nem lehet újra inicializálni.

        // A final kulcsszó lényege tehát, hogy a tömb referencia nem változhat meg, 
        // de az elemek értéke szabadon módosítható.
    }
}
