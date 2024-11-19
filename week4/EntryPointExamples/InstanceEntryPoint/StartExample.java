public class StartExample {

    // Ez a main() metódus, amelyet a JVM meghív, amikor a program indul.
    // Itt példányosítjuk az osztályt, és meghívjuk a start() metódust.
    public static void main(String[] args) {
        // Példányosítjuk a StartExample osztályt
        StartExample example = new StartExample();
        
        // Meghívjuk a start() metódust az osztály példányán keresztül.
        example.start();
    }

    // A start() metódus lesz az, amit ténylegesen a program belépési pontjaként használunk.
    // Ez már nem statikus, mivel egy osztály példányán keresztül hívjuk meg.
    public void start() {
        System.out.println("This is the start method, which is now the entry point.");
        printMessage();
    }

    // Egy másik metódus, ami nem statikus, és amelyet szintén a start() metóduson keresztül hívunk meg.
    public void printMessage() {
        System.out.println("This message is from a non-static method.");
    }
    
    /*
        1. Példányosított belépési pont létrehozása:
            - Ahelyett, hogy a main() metódusba helyeznénk az összes logikát, példányosítunk egy osztályt, és az osztály start() metódusát tesszük a program belépési pontjává.
            - Ez lehetővé teszi, hogy a programunk objektum-orientáltabb legyen, mivel a start() metódus nem statikus, és az osztály példányán keresztül hívható meg.
        
        2. Miért használunk példányt a start() hívásához?:
            - A start() metódus már nem statikus, ezért az osztály egy példányára van szükség a meghívásához. A main() metódus csak azért marad statikus, hogy a JVM hívni tudja, de a tényleges programlogika egy példányosított metódusban található.
        
        3. Előnyök:
            - A nem statikus metódusok hozzáférhetnek az osztály példányváltozóihoz, és jobban integrálhatók egy objektum-orientált tervezésbe.
            - Továbbá, ezzel a módszerrel elkerülhetjük, hogy minden metódust statikussá kelljen tenni, ami korlátozhatná a program rugalmasságát.
        
        4. Fontos megjegyzés:
            - A main() metódus továbbra is szükséges, hiszen a JVM mindig a main() metódust keresi elsőként, de az itt lévő logika csak arra szolgál, hogy példányosítsuk az osztályt és meghívjuk a start() metódust.
    */
}
