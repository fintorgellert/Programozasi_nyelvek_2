import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // List példa (ArrayList használata)
        /*
         * A List interfész egy elemekből álló gyűjteményt reprezentál,
         * ahol az elemek sorrendje számít, és duplikált elemek is megengedettek.
         * Az ArrayList az egyik legnépszerűbb implementáció, amely dinamikusan növekvő tömböt használ.
         */
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");                                                            // Duplikátum megengedett
        System.out.println("List: " + fruits);

        // Gyakran használt metódusok a List-ben
        System.out.println("First item: " + fruits.get(0));                             // Elem lekérése index alapján
        System.out.println("List contains 'Orange'? " + fruits.contains("Orange"));     // Elem keresése
        fruits.remove(1);                                                               // Elem eltávolítása index alapján
        System.out.println("After removing Banana: " + fruits);
        Collections.sort(fruits);                                                       // Lista rendezése
        System.out.println("Sorted List: " + fruits);

        
        // Set példa (HashSet használata)
        /*
         * A Set interfész egy halmazt reprezentál, ahol az elemek egyediek.
         * A HashSet egy olyan implementáció, amely hash-alapú tárolást használ.
         * Az elemek sorrendje nem garantált.
         */
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Orange");
        uniqueFruits.add("Apple");                                                      // Duplikátum NEM megengedett
        System.out.println("Set: " + uniqueFruits);

        // Halmaz műveletek bemutatása
        /*
         * A halmazműveletek - mint unió, metszet és különbség - gyakoriak
         * matematikai vagy adatfeldolgozási problémák megoldásakor.
         */
        Set<String> uniqueFruits1 = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        Set<String> uniqueFruits2 = new HashSet<>(Arrays.asList("Banana", "Grapes", "Orange"));

        System.out.println("Set 1: " + uniqueFruits1);
        System.out.println("Set 2: " + uniqueFruits2);

        // Unió (Union) - mindkét halmaz elemei
        Set<String> union = new HashSet<>(uniqueFruits1);
        union.addAll(uniqueFruits2);                                                    // Az addAll hozzáad minden elemet a másik halmazból.
        System.out.println("Union: " + union);

        // Metszet (Intersection) - csak közös elemek
        Set<String> intersection = new HashSet<>(uniqueFruits1);
        intersection.retainAll(uniqueFruits2);                                          // retainAll csak a közös elemeket tartja meg.
        System.out.println("Intersection: " + intersection);

        // Különbség (Difference) - csak az első halmaz egyedi elemei
        Set<String> difference = new HashSet<>(uniqueFruits1);
        difference.removeAll(uniqueFruits2);                                            // removeAll eltávolítja az átfedő elemeket.
        System.out.println("Difference: " + difference);


        // TreeSet példa (elemek rendezett sorrendben)
        /*
         * A TreeSet rendezett halmazt biztosít, ahol az elemek természetes sorrendben
         * vagy egyedi Comparator alapján rendezve vannak.
         */
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(7);
        System.out.println("TreeSet: " + numbers);

        // Gyakran használt metódusok a TreeSet-ben
        System.out.println("First (lowest) element: " + numbers.first());
        System.out.println("Last (highest) element: " + numbers.last());
        System.out.println("Subset (3 to 7): " + numbers.subSet(3, 8));                 // Intervallum kiválasztása
        System.out.println("Higher than 5: " + numbers.higher(5));                      // Következő nagyobb elem
        System.out.println("Lower than 5: " + numbers.lower(5));                        // Következő kisebb elem


        // Map példa (HashMap használata)
        /*
         * A Map kulcs-érték párokat tartalmazó gyűjtemény.
         * A HashMap a kulcsokat hash-alapú tárolóban tartja, gyors hozzáférést biztosítva.
         */
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 80);
        fruitPrices.put("Orange", 90);
        System.out.println("Map: " + fruitPrices);

        // Gyakran használt metódusok a Map-ben
        System.out.println("Price of Apple: " + fruitPrices.get("Apple"));                  // Kulcs alapján érték lekérése
        System.out.println("Map contains 'Banana'? " + fruitPrices.containsKey("Banana"));  // Kulcs keresése
        fruitPrices.remove("Orange");                                                       // Elem eltávolítása kulcs alapján
        System.out.println("After removing Orange: " + fruitPrices);
        fruitPrices.putIfAbsent("Grapes", 120);                                             // Elem hozzáadása csak akkor, ha még nincs ilyen kulcs
        System.out.println("Map after putIfAbsent: " + fruitPrices);

        // További Map műveletek:
        /*
         * A Map adatszerkezet kulcs-érték párokat tartalmaz, ahol a kulcsok egyediek,
         * de az értékek ismétlődhetnek. Az egyik leggyakoribb implementáció a HashMap,
         * amely gyors hozzáférést biztosít az értékekhez a kulcsok segítségével.
         * Az egyik előnye, hogy nem kell biztosítani, hogy a kulcsok sorrendje megmaradjon.
         */
        // Iterálás Map-en keresztül
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Price: " + entry.getValue());
        }

        // Map-et frissíthetünk a replace metódussal
        fruitPrices.replace("Banana", 85);
        System.out.println("After updating Banana price: " + fruitPrices);

        
        // TreeMap példa (kulcsok rendezett sorrendben)
        /*
        * A TreeMap a Map rendezett változata, ahol a kulcsok természetes sorrendben
        * vagy egyedi Comparator alapján vannak rendezve.
        */
        TreeMap<String, Integer> sortedFruitPrices = new TreeMap<>();
        sortedFruitPrices.putAll(fruitPrices);
        System.out.println("TreeMap (sorted): " + sortedFruitPrices);
        
        // Gyakran használt metódusok a TreeMap-ben
        System.out.println("First entry: " + sortedFruitPrices.firstEntry());
        System.out.println("Last entry: " + sortedFruitPrices.lastEntry());
        System.out.println("SubMap (Apple to Grapes): " + sortedFruitPrices.subMap("Apple", "Grapes"));
        System.out.println("Ceiling entry for 'Avocado': " + sortedFruitPrices.ceilingEntry("Avocado"));    // Legközelebbi nagyobb kulcs
        System.out.println("Floor entry for 'Banana': " + sortedFruitPrices.floorEntry("Banana"));          // Legközelebbi kisebb kulcs
        
        // HashMap és TreeMap közötti különbség
        /*
         * A HashMap nem tartja meg a kulcsok sorrendjét, míg a TreeMap rendezi őket.
         * A HashMap gyors hozzáférést biztosít a kulcsok alapján, de nem garantálja
         * a kulcsok sorrendjét. A TreeMap viszont mindig rendezett kulcsokkal rendelkezik.
         */
    }
}
