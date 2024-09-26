# Harmadik labor

## Tartalomjegyzék
- [Bevezetés](#bevezetés)
- [Fájlok áttekintése](#fájlok-áttekintése)
- [Követelmények](#követelmények)
- [Futtatás](#futtatás)

## Bevezetés
A harmadik labor során az objektumorientált programozás alapelveit alkalmazzuk Java nyelven. A laborban különböző osztályokat és objektumokat hozunk létre, amelyek valós világban is előforduló fogalmakat modelleznek, mint például könyvek, körök és filmek.  
Magyarázásra kerül a `private` és `public` láthatósági szint különbsége, a `this` kulcsszó használata, konstruktorok, getter/setter metódusok, a `toString()` metódus és statikus attribútumok is.


## Fájlok áttekintése
A projekt könyvtára a következő fájlokat tartalmazza:

- **Book** könyvtár:
  - `Book.java`: Az `Book` osztály implementációja, amely a könyv tulajdonságait és metódusait tartalmazza.
  - `Main.java`: A fő program, amely a `Book` osztály használatát demonstrálja.

- **Circle** könyvtár:
  - `Circle.java`: A `Circle` osztály implementációja, amely egy kört és annak metódusait modellezi.
  - `Main.java`: A fő program, amely a `Circle` osztályt példányosítja és teszteli annak funkcióit.

- **Movie** könyvtár:
  - `Movie.java`: A `Movie` osztály implementációja, amely egy filmet modellez különböző attribútumokkal, mint például cím, rendező, és év.
  - `Main.java`: A fő program, amely a `Movie` osztály használatát mutatja be.

## Követelmények
- Java Development Kit (JDK)

## Futtatás
A programok futtatásához kövesd az alábbi lépéseket:

1. **Navigáljon a kívánt mappába** (pl. `Movie`):
   ```bash
   cd Movie
2. **Fordítsa le a Java fájlt:**
    ```bash
    javac Movie.java
3. **Futtassa a fájlt:**
    ```bash
    java Movie
