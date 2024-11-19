# Tizedik hét

## Tartalomjegyzék
- [Bevezetés](#bevezetés)
- [Fájlok áttekintése](#fájlok-áttekintése)
- [Követelmények](#követelmények)
- [Futtatás](#futtatás)

## Bevezetés
A tizedik hét labor célja a Java programozás különböző aspektusainak bemutatása. A feladatok a csomagok (package) használatát, véletlenszám-generálást és az egység tesztelést ölelik fel. A labor során megtanuljuk, hogyan szervezhetjük a Java programjainkat csomagokba, hogyan generálhatunk véletlenszámokat, valamint hogyan alkalmazhatjuk az egység tesztelést.

## Fájlok áttekintése

### PackageExample
A `PackageExample` könyvtárban egy banki alkalmazás csomagszerkezetét találhatjuk, amely különböző csomagokra van bontva, mint például `account`, `customer`, `main` és `transaction`.

- **com.bank.account** csomag:
  - `Account.java`: Az alap banki számla osztály.
  - `CheckingAccount.java`: A folyószámla osztály, amely kiterjeszti az `Account` osztályt.
  - `SavingsAccount.java`: A megtakarítási számla osztály, amely szintén kiterjeszti az `Account` osztályt.

- **com.bank.customer** csomag:
  - `Customer.java`: Az ügyfél osztály, amely az ügyfél adatait tartalmazza, mint például a név és cím.

- **com.bank.main** csomag:
  - `Main.java`: A fő osztály, amely elindítja a programot, és bemutatja a banki műveletek működését.

- **com.bank.transaction** csomag:
  - `Transaction.java`: A tranzakciókat kezelő osztály, amely a tranzakciós műveletek logikáját tartalmazza.

- **README.md**: Részletes leírás a Java csomagok használatáról.

### RandomUtilsDemo
- **Main.java**: A fő osztály, amely bemutatja a véletlenszám-generáló osztályok alkalmazását Java-ban.
- **RandUtils.java**: Segédosztály, amely különböző véletlenszám-generálási módszereket valósít meg, például `randrange()`, `randint()` és `choice()` metódusok.

### UnitTestExample
A `UnitTestExample` könyvtár bemutatja, hogyan alkalmazhatunk egység tesztelést a Java programokban.

- **Main.java**: A fő osztály, amely a `MathUtils` osztály egyes metódusait teszteli.
- **MathUtils.java**: Egyszerű matematikai segédosztály, amely olyan műveleteket valósít meg, mint az összeadás és szorzás.
- **MathUtilsTest.java**: A tesztosztály, amely egység tesztek (`assert`) segítségével teszteli a `MathUtils` osztály metódusait.

## Követelmények
- **Java Development Kit (JDK)** 8 vagy újabb verzió.

## Futtatás
A programok futtatásához kövesse az alábbi lépéseket:

### 1. **PackageExample** futtatása
A `PackageExample` program futtatásához hajtsa végre az alábbi lépéseket:

1. Navigáljon a `PackageExample` könyvtárba:
   ```bash
   cd PackageExample
   ```
2. Fordítsa le a Java fájlokat a csomagok struktúrájának megfelelően:
    ```bash
    javac com/bank/account/*.java com/bank/customer/*.java com/bank/main/*.java com/bank/transaction/*.java
    ```
3. Futtassa a programot a Main.java osztállyal:
    ```basch
    java com.bank.main.Main
    ```

### 2. RandomUtilsDemo futtatása

A `RandomUtilsDemo` program futtatásához hajtsa végre az alábbi lépéseket:

1. Navigáljon a `RandomUtilsDemo` könyvtárba:
    ```bash
    cd RandomUtilsDemo
    ```

2. Fordítsa le a Java fájlokat:
   ```bash
    javac Main.java RandUtils.java
    ```

3. Futtassa a programot:
    ```bash
    java Main
    ```

### 3. UnitTestExample futtatása

A `UnitTestExample` tesztjeinek futtatásához hajtsa végre az alábbi lépéseket:

1. Navigáljon a UnitTestExample könyvtárba:
    ```bash
    cd UnitTestExample
    ```

2. Fordítsa le a Java fájlokat:
    ```bash
    javac Main.java MathUtils.java MathUtilsTest.java
    ```

3. Futtassa a tesztet JUnit segítségével:
    ```bash
    java -ea MathUtilsTest
    ```