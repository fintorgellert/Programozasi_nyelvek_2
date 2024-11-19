# Kilencedik hét

## Tartalomjegyzék
- [Bevezetés](#bevezetés)
- [Fájlok áttekintése](#fájlok-áttekintése)
- [Követelmények](#követelmények)
- [Futtatás](#futtatás)

## Bevezetés
A kilencedik hét során különböző Java technikákat és módszereket tanulmányoztunk, beleértve az állítások (assertion) használatát, fájlkezelést, mátrixműveleteket, valamint szövegekkel és véletlenszámokkal való munkát. Továbbá a sztringek kezelésének haladóbb aspektusait, például a sztringek építését, darabolását és egyesítését is megvizsgáltuk.

## Fájlok áttekintése

### Assert
- **Fájl**: `Main.java`
- **Leírás**: Példa az `assert` kulcsszó használatára hibakeresés és programozási logika ellenőrzése céljából.

### Diamond
- **Fájl**: `Main.java`
- **Leírás**: Program, amely egy gyémánt alakzatot rajzol a konzolra a megadott sorok száma alapján.

### FirstLineRead
- **Fájlok**: 
  - `Main.java`: Fő program, amely fájlok első sorait olvassa be.
  - `FileUtils.java`: Segédosztály a fájlműveletek kezelésére.
  - `day01.txt`, `pelda.txt`, `szoveg.txt`: Minta szövegfájlok a program működésének teszteléséhez.
- **Leírás**: Fájlkezelés példája, amely bemutatja, hogyan lehet fájlok első sorait kiolvasni és feldolgozni.

### ListOfExample
- **Fájl**: `Main.java`
- **Leírás**: A Java `List` osztályának használata, különböző műveletek, például elemek hozzáadása, eltávolítása és keresése.

### Matrix
- **Fájl**: `Main.java`
- **Leírás**: Mátrixműveletek, például mátrix feltöltése és kiíratása.

### Random
- **Fájl**: `Main.java`
- **Leírás**: Véletlenszám-generálási példák, beleértve a véletlenszámok előállítását különböző tartományokban a `Math` osztályban található `random()` metódus használatával.

### SplitAndJoin
- **Fájl**: `Main.java`
- **Leírás**: Sztringek darabolásának (`split`) és összefűzésének (`join`) bemutatása.

### StringBuileder
- **Fájl**: `Main.java`
- **Leírás**: Példa a `StringBuilder` osztály használatára, amely hatékonyabb módja a szövegek manipulálásának.

## Követelmények
- **Java Development Kit (JDK)** 8 vagy újabb verzió.

## Futtatás
A programok futtatásához a következő lépéseket kövesse:

1. **Navigáljon a megfelelő könyvtárba** (például `FirstLineRead`):
    ```bash
    cd FirstLineRead
2. **Fordítsa le a Java fájlt**:
    ```bash
    javac Main.java
3. **Futtassa a programot**:
    ```bash
    java Main
## Megjegyzés

- Mostantól kezdve a `StringBuilder`-t kell használni sztringek bővítésekor!
- Győződjön meg arról, hogy a minta szövegfájlok (`day01.txt`, `pelda.txt`, `szoveg.txt`) elérhetők a `FirstLineRead` könyvtárban.
- Az `assert` használatához engedélyezze azt a futás során az alábbi módon:
    ```bash
    java -ea Main
