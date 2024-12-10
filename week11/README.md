# Tizenegyedik hét

## Tartalomjegyzék
- [Bevezetés](#bevezetés)
- [Fájlok áttekintése](#fájlok-áttekintése)
- [Követelmények](#követelmények)
- [Futtatás](#futtatás)

## Bevezetés
A tizenegyedik hét labor célja a Java programozási nyelv haladóbb koncepcióinak bemutatása, beleértve:
- Gyűjtemények kezelése Java-ban.
- Kivételkezelés alapjai és testreszabott kivételek.
- Fájlkezelési műveletek megértése és implementálása.

Ezen projektek célja, hogy megértsük és alkalmazzuk ezeket a technikákat gyakorlati példákon keresztül.

## Fájlok áttekintése

### CollectionDemo
- **`Main.java`**: Bemutatja a Java gyűjtemények, például `ArrayList`, `HashMap`, és `HashSet` alapvető működését és alkalmazását.

### ExceptionExample
- **`ExceptionHandlingExample.java`**: A kivételkezelés alapjait mutatja be. Témák, mint például `try-catch`, a `finally` blokk használata, valamint a különböző kivétel típusok kezelése.

### ExceptionTask
Ez a mappa egy liftes szimulációt tartalmaz, amely egyedi kivételkezelési feladatokkal kapcsolatos:
- **`Elevator.java`**: A lift működését szimuláló osztály.
- **`InvalidDirectionException.java`**: Egy egyedi kivétel, amely akkor kerül kiváltásra, ha a lift érvénytelen irányba próbálna mozogni.
- **`Moveable.java`**: Egy interfész, amely azokat a metódusokat deklarálja, amelyeket a mozgó objektumoknak meg kell valósítaniuk.
- **`Runner.java` és `Runner2.java`**: A program futtatható osztályai, amelyek bemutatják a lift működését és a kivételkezelési logikát.

### FileHandlingExample
- **`Main.java`**: Fájlkezelési műveleteket mutat be Java-ban, például fájlok olvasását, írását, és a fájlkezelési kivételek kezelését.

## Követelmények
- **Java Development Kit (JDK)** 8 vagy újabb verzió.
- Szövegszerkesztő vagy IDE, például IntelliJ IDEA vagy Eclipse.

## Futtatás
A programok futtatásához kövesse az alábbi lépéseket:

1. Nyissa meg a terminált, és navigáljon az adott projekt könyvtárába. Példa:
   ```bash
   cd CollectionDemo
   ```
2. Fordítsa le a programot:
    ```bash
    javac Main.java
    ```

3. Futtassa a programot:
    ```bash
    java Main
    ```
