# Negyedik labor

## Tartalomjegyzék
- [Bevezetés](#bevezetés)
- [Fájlok áttekintése](#fájlok-áttekintése)
- [Követelmények](#követelmények)
- [Futtatás](#futtatás)

## Bevezetés
A negyedik labor során a Java programozás különböző aspektusait tárgyaltuk, beleértve a tömbök használatát, metódus túlterhelést, dinamikus tömböket és a `foreach` ciklus alkalmazását. Külön figyelmet szentelünk a tömbműveletek, például másolás, és a programok belépési pontjainak megértésére.

## Fájlok áttekintése
A projekt könyvtára a következő fájlokat tartalmazza:

- **ArrayCopyExample** könyvtár:
  - `Main.java`: Példa tömbök másolására.

- **ArrayOperations** könyvtár:
  - `Main.java`: Tömbökkel kapcsolatos alapvető műveletek manuális megírása, mint `equals`, `fill`, `isSorted`, `getMinValue`, `getMaxValue` és `felhőkarcoló` feladat megoldása.

- **DynamicArrayExample** könyvtár:
  - `Main.java`: Dinamikus tömbök példája, ahol a tömb mérete futásidőben növekedhet. Bemutatásra kerül hogyan hozunk létre egy dinamikus tömböt, az `add`, `sort` és `reverse` metódusok. 

- **EntryPointExamples** könyvtár:
  - **InstanceEntryPoint**:
    - `StartExample.java`: Egy belépési pont példája, ahol az osztály példányosításakor indul el a program.
  - **TraditionalEntryPoint**:
    - `Hello.java`: Hagyományos belépési pont példa a `main()` metódussal.

- **FinalArrayExample** könyvtár:
  - `Main.java`: Példa a `final` kulcsszóval deklarált tömbök használatára.

- **ForeachExample** könyvtár:
  - `Main.java`: A `foreach` ciklus használatának bemutatása tömbökkel.

- **MethodOverloadExample** könyvtár:
  - `Adder.java`: Metódus túlterhelés (method overloading) példája, ahol különböző típusú paraméterekkel hívhatók meg metódusok.
  - `Main.java`: A `Adder` osztály használatát bemutató fő program.

- **MultipleReturnValuesExample** könyvtár:
  - `Main.java`: Példa arra, hogyan lehet több értéket visszaadni egy metódusból Java-ban.

## Követelmények
- Java Development Kit (JDK)

## Futtatás
A programok futtatásához kövesse az alábbi lépéseket:

1. **Navigáljon a megfelelő könyvtárba** (pl. `ArrayCopyExample`):
   ```bash
   cd ArrayCopyExample
   ```
2. **Fordítsa le a Java fájlt:**
    ```bash
    javac Main.java
    ```
3. **Futtassa a programot:**
     ```bsh
    java Main
    ```
