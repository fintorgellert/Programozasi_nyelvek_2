import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* 
            Létrehozunk egy `List`-et a `List.of()` segítségével, amely egy immutable, azaz módosíthatatlan lista.
            Az immutable lista azt jelenti, hogy létrehozása után nem változtathatjuk meg, például nem adhatunk hozzá új elemeket,
            nem törölhetünk elemeket és nem módosíthatjuk meglévő elemeit.
        */
        List<Integer> immutableList = List.of(3, 8, 1, 6);
        
        /*
            Példa arra, hogy mi történik, ha módosítani próbáljuk az immutable listát:

            immutableList.add(10);   // Ez hibát dob: UnsupportedOperationException
            immutableList.remove(0); // Ez is hibát dob: UnsupportedOperationException
            
            A fenti sorok hibát eredményeznek, mert a `List.of()`-al létrehozott lista nem módosítható.
        */
        
        /* 
            A módosíthatóság elérése érdekében létrehozhatunk egy új `ArrayList`-et,
            amelynek inicializáló értékeit a `List.of()` segítségével adhatjuk meg.
            Az `ArrayList` módosítható, vagyis szabadon hozzáadhatunk, törölhetünk vagy módosíthatunk elemeket.
        */
        List<Integer> mutableList = new ArrayList<>(List.of(3, 6, 9));


        // Módosítási példák egy `ArrayList`-tel:
        // Az `ArrayList` lehetővé teszi a következő műveleteket:

        // Hozzáadunk egy új elemet a lista végére:
        mutableList.add(10);
        
        // Törlünk egy elemet a listából a 0. indexnél (az első elem):
        mutableList.remove(0);

        // Módosítjuk egy meglévő elem értékét az 1. indexen:
        mutableList.set(1, 99);

        // Kiírjuk az immutábilis és módosítható listákat a különbség szemléltetése érdekében
        System.out.println("Immutable List (módosítás nélküli): " + immutableList); // Módosítatlanul marad
        System.out.println("Mutable List (módosított): " + mutableList);            // Az elemek módosíthatók

        /*
            Fontos megjegyezni:

            - Az `List.of()` metódussal létrehozott lista immutable, vagyis fix, nem módosítható.
              Ezt a viselkedést a `java.util.ImmutableCollections` biztosítja.
              Ez a megoldás biztonságot nyújt olyan esetekben, amikor garantáltan nem szeretnénk, hogy egy lista változzon,
              például konfigurációs beállítások vagy konstans értékek esetén.

            - Az `ArrayList` használatával dinamikus, módosítható listákat hozhatunk létre, ahol az elemek szabadon
              hozzáadhatók, eltávolíthatók és módosíthatók, ami rugalmasabb, és lehetővé teszi például egy program adatainak kezelését.
        */

    }
}
