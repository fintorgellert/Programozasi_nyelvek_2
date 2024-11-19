public class Hello {

    /*  
      A main() metódus a Java program belépési pontja.
      Ez az a metódus, amit a JVM (Java Virtual Machine) automatikusan meghív, amikor a programot futtatjuk.
      Meghívása, így néz ki: Hello.main()
      Fontos, hogy ez a metódus public és static legyen, különben a JVM nem fogja tudni meghívni.
   */
   public static void main(String[] args) {
        // A main() metóduson belül a program végrehajtása elkezdődik.
        // Az alábbi sor egy egyszerű kiíratás a konzolra:
        System.out.println("Hello!");

        // Mivel a main() metódus static, a Hello osztály másik metódusát csak akkor tudjuk meghívni, ha az is static.
        printMessage();    // Meghívjuk a statikus printMessage() metódust
    }

    // A printMessage() metódus is static, mert közvetlenül a main() metódusból hívjuk meg, ami szintén static.
    public static void printMessage() {
        System.out.println("This is a message from a static method.");
    }

   /*
      1. A main() metódus szerepe:
         - A Java programok mindig a main() metódussal kezdődnek, ami a belépési pont a program futtatásához.
         - Amikor a java Hello parancsot kiadjuk, a Java Virtual Machine (JVM) megkeresi a Hello osztályban a public static void main(String[] args) szignatúrájú metódust, és elindítja a programot - Hello.main().
         
      2. Miért fontos, hogy a main() metódus public és static legyen?:
         - public: A main() metódusnak elérhetőnek kell lennie a JVM számára, függetlenül attól, hogy milyen csomagból érkezik a meghívás, tehát nyilvános kell, hogy legyen.
         - static: A main() metódusnak statikusnak kell lennie, mert a JVM példányosítás nélkül is meg kell, hogy hívhassa. A JVM nem hoz létre példányt az osztályból, mielőtt meghívja a main()-t, ezért az osztály szintjén kell, hogy létezzen.
         
      3. Statikus metódusok:
         - A main() metódusban közvetlenül meghívhatunk más statikus metódusokat, mivel a statikus metódusok az osztály szintjén léteznek, nem kell példányosítani őket.
         - Ha egy nem statikus metódust szeretnénk meghívni, akkor létre kell hozni egy példányt az osztályból.
   */
}

