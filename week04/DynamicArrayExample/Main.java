package Programozasi_nyelvek_2.week04.DynamicArrayExample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Dinamikus tömb (ArrayList) létrehozása Integer típusú elemek tárolására
        // Az ArrayList lehetővé teszi elemek hozzáadását, eltávolítását és egyéb manipulációkat.
        List<Integer> numbers = new ArrayList<Integer>(); 
        System.out.println(numbers);    // Kiírjuk a kezdeti üres tömböt (Ez egy üres ArrayList)

        // Az ArrayList-hez elemeket adunk hozzá az add() metódus segítségével
        // Az add() metódus automatikusan hozzáfűzi az elemeket a lista végéhez
        numbers.add(9);
        numbers.add(5);
        numbers.add(11);
        numbers.add(2);
        System.out.println(numbers);    // Kiírjuk a listát miután néhány elemet hozzáadtunk

        // A Collections.sort() metódus használatával rendezhetjük az elemeket növekvő sorrendbe
        Collections.sort(numbers);
        System.out.println(numbers);    // Kiírjuk a rendezett tömböt

        // A Collections.reverse() metódus megfordítja az elemek sorrendjét a listában
        Collections.reverse(numbers);
        System.out.println(numbers);    // Kiírjuk a megfordított tömböt
    }
    
    /*
        1. ArrayList létrehozása:
        - Az ArrayList egy dinamikus tömb, amely lehetővé teszi, hogy tetszőleges számú elemet tároljunk anélkül, hogy előre meg kellene adni a tömb méretét.
        - Ebben a példában egy List<Integer> típust hoztunk létre. Az ArrayList<Integer> speciális verziója olyan listát jelent, amely csak Integer típusú elemeket tartalmaz.
                List<Integer> numbers = new ArrayList<Integer>();
    
        2. Elemek hozzáadása:
        - Az add() metódussal új elemeket adhatunk hozzá az ArrayList végéhez. Az ArrayList automatikusan növeli a méretét, ha új elemeket adunk hozzá.
        - Példa: 
                numbers.add(9); - hozzáadja a 9-es elemet.
                numbers.add(5); - hozzáadja az 5-öst.
    
        3. Elemek rendezése:
            - Az ArrayList elemei rendezetlenül kerülnek tárolásra. A Collections.sort() metódus segítségével rendezhetjük a listát növekvő sorrendbe.
                Collections.sort(numbers); - rendezi az elemeket.
    
        4. Sorrend megfordítása:
            - A Collections.reverse() metódus megfordítja a lista elemeinek sorrendjét.
                Collections.reverse(numbers); - az eredetileg rendezett lista sorrendjét megfordítja.
    
        5. Hasznos metódusok:
        - add(element): Elem hozzáadása a lista végéhez.
        - addAll(element): Több elemet ad hozzá a listához.
        - get(index): Visszaadja az adott indexű elemet.
        - set(index, element): Frissíti a megadott indexű elemet.
        - remove(index): Törli a megadott indexű elemet.
        - size(): Visszaadja a lista méretét, azaz az elemek számát.
        - isEmpty(): Ellenőrzi, hogy a lista üres-e.
        - contains(element): Ellenőrzi, hogy egy adott elem szerepel-e a listában.
    
        Az ArrayList tehát rugalmas és könnyen kezelhető dinamikus tömböt biztosít, amely nagyszerű választás, ha előre nem ismert méretű adatokkal kell dolgozni.
    */
}
