# Tizenharmasik hét

## Tartalomjegyzék
- [Bevezetés](#bevezetés)
- [Fájlok áttekintése](#fájlok-áttekintése)
- [Követelmények](#követelmények)
- [Futtatás](#futtatás)

## Bevezetés
A tizenharmadik hét labor célja a C# programozás különböző aspektusainak bemutatása, beleértve az alábbiakat:
- Tömbök és mátrixok használata C#-ban.
- Parancssori argumentumok kezelése.
- Kivételkezelés és hibakezelés C#-ban.
- LINQ módszerek alkalmazása.
- Gyakorlati feladatok megoldása, amelyek különböző programozási technikákat kombinálnak.

A feladatok során elsajátítjuk ezeket az alapvető C#-os technikákat, és alkalmazzuk őket különböző példákon keresztül.

## Fájlok áttekintése

### ArraysAndMatrices
- **`Program.cs`**: Bemutatja a C#-ban használt tömbök és mátrixok kezelését, például egy kétdimenziós tömb létrehozását és az értékeinek kiíratását.

### CommandLineArguments
- **`Program.cs`**: A parancssori argumentumok kezelését mutatja be, amely lehetővé teszi a felhasználó számára, hogy a programot argumentumokkal indítsa el, így dinamikusan alakítható a program viselkedése.

### ExceptionHandling
- **`Program.cs`**: A kivételkezelés alapjait ismerteti, például a `try-catch-finally` blokk használatát.

### LINQMethods
- **`Program.cs`**: A LINQ (Language Integrated Query) alapjait mutatja be, beleértve a `Select`, `Where` és `Aggregate` módszereket, amelyek lehetővé teszik az adatok gyors és hatékony lekérdezését.

### Practice
A `Practice` könyvtár különböző gyakorlati feladatokat tartalmaz, amelyek célja a C# különböző aspektusainak alkalmazása:

- **`doc/data.txt`**: Adatfájl, amely bemeneti adatokat tartalmaz a feladatokhoz.
- **`SolveTask1/Program.cs`**: Az első feladat megoldása (összetett feladat).
- **`SolveTask2/Hotel.cs` és `SolveTask2/Program.cs`**: A második feladat megoldása (osztályos feladat).
- **`SolveTask3/Program.cs`**: A harmadik feladat megoldása (LINQ feladatok).
- **`SolveTask4/Program.cs` és `SolveTask4/FileUtils.cs`**: A negyedik feladat megoldása (fájlkezelés - írás/olvasás).

### RandomNumberExample
- **`Program.cs`**: Véletlenszám-generálás C#-ban. A program bemutatja a véletlenszámok előállítását.

### StaticVariableExample
- **`Program.cs`**: A statikus változók használatát mutatja be C#-ban. A statikus változók az osztály szintjén vannak tárolva, nem pedig az objektumok szintjén.

### StringBuilderExample
- **`Program.cs`**: A `StringBuilder` osztály használatát mutatja be, amely hatékonyabb módot biztosít a karakterláncok kezelésére és módosítására, mint a hagyományos stringek.

## Követelmények
- **.NET SDK** 5.0 vagy újabb verzió.
- Szövegszerkesztő vagy IDE, például Visual Studio vagy Visual Studio Code.

## Futtatás
A programok futtatásához kövesse az alábbi lépéseket:

1. Nyissa meg a terminált, és navigáljon az adott projekt könyvtárába. Példa:
    ```bash
    cd ArraysAndMatrices
    ```

2. A projekt fordítása és futtatása:
    ```bash
    dotnet run
    ```
