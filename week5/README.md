# Ötödik hét

## Tartalomjegyzék
- [Bevezetés](#bevezetés)
- [Fájlok áttekintése](#fájlok-áttekintése)
- [Követelmények](#követelmények)
- [Futtatás](#futtatás)

## Bevezetés
Az ötödik hét során a Java programozás különböző aspektusait tárgyaltuk, beleértve a karakter típusok kezelését, parancssori argumentumok használatát, metódusok túlterhelését, sztringek és primitív típusok közötti konverziót, valamint a sztringek számjegyeinek összegzését. Külön figyelmet szentelünk a Java gyűjtemények használatának, különös tekintettel a listákra.

## Fájlok áttekintése
A projekt könyvtára a következő fájlokat tartalmazza:

- **CharacterTypeMethodExample** könyvtár:
  - `Main.java`: Példa a karakter típusokkal való munka során alkalmazható módszerek bemutatására.

- **CommandLineArgument** könyvtár:
  - `Main.java`: Bemutatja, hogyan lehet parancssori argumentumokat átadni a Java programnak, és hogyan lehet azokat feldolgozni.

- **InputMethodOverloading** könyvtár:
  - `Main.java`: Metódusok túlterhelésének példája, különböző bemeneti paraméterekkel.
  - `PyUtils.java`: Segédosztály, amely Python-szerű funkciókat valósít meg - *input()*.

- **ListOfExample** könyvtár:
  - `Main.java`: Példa a Java List osztály használatára, bemutatva az alapvető műveleteket, mint például az elemek hozzáadása, eltávolítása és keresése.

- **StringToPrimitiveConverter** könyvtár:
  - `Main.java`: Példa arra, hogyan lehet konvertálni sztringeket primitív típusokra, mint például int és double.

- **SumOfDigitsInString** könyvtár:
  - `Main.java`: A program, amely számolja a sztringben található számjegyek összegét.

- **SumOfTwoNumbers** könyvtár:
  - `Main.java`: Egyszerű program, amely két szám összegét számolja ki a felhasználótól kapott bemenet alapján.

## Követelmények
- Java Development Kit (JDK)

## Futtatás
A programok futtatásához kövesse az alábbi lépéseket:

1. **Navigáljon a megfelelő könyvtárba** (pl. `CharacterTypeMethodExample`):
   ```bash
   cd CharacterTypeMethodExample
   ```
2. **Fordítsa le a Java fájlt:**
    ```bash
    javac Main.java
    ```
3. **Futtassa a programot:**
    ```bsh
    java Main
    ```
