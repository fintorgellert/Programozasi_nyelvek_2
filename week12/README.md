# Tizenkettedik hét

## Tartalomjegyzék
- [Bevezetés](#bevezetés)
- [Fájlok áttekintése](#fájlok-áttekintése)
- [Követelmények](#követelmények)
- [Futtatás](#futtatás)

## Bevezetés
A tizenkettedik hét célja a C# programozás kulcsfontosságú koncepcióinak bemutatása. Ebben a modulban a következő témakörökkel foglalkozunk:
- Egyedi osztályok használata és példányosítása.
- A `foreach` ciklus és az `IEnumerable` interfész használata.
- Listák és gyűjtemények kezelése.
- Nevektereink kibővítése bővítési metódusokkal.
- Sztringek manipulálása, például fordítása.

## Fájlok áttekintése

### CustomClassExample
- **`Program.cs`**: Bemutatja, hogyan hozzunk létre és használjunk egyedi osztályokat C#-ban. Az osztályok és objektumok koncepciójának alapjait tárgyalja.

### ForEachExample
- **`Program.cs`**: A `foreach` ciklus működését demonstrálja. Bemutatja, hogyan lehet végigiterálni különböző gyűjteményeken, például tömbökön és listákon.

### IEnumerableExample
- **`Program.cs`**: Az `IEnumerable` interfész használatát szemlélteti. Megmutatja, hogyan készíthetünk saját iterátorokat és hogyan használhatjuk azokat egyedi gyűjtemények kezelésére.

### ListExample
- **`Program.cs`**: Bemutatja a listák kezelését C#-ban. Témák, mint például elemek hozzáadása, eltávolítása és iteráció listákon keresztül.

### NamespaceAndExtensions
- **`Program.cs`**: A nevektereink (namespace) bővítését és a bővítési metódusok létrehozását tárgyalja. Ezzel a technikával meglévő osztályokat bővíthetünk további metódusokkal anélkül, hogy módosítanánk az eredeti definíciójukat.

### StringReversal
- **`Program.cs`**: Egy egyszerű példa arra, hogyan fordíthatunk meg sztringeket C#-ban. Gyakorlati példát nyújt a karakterek manipulálására és a sztringekkel végzett műveletekre.

## Követelmények
- **Microsoft .NET SDK**: A fejlesztéshez és futtatáshoz szükséges legújabb SDK (pl. .NET 6 vagy újabb).
- Szövegszerkesztő vagy IDE: Javasolt a Visual Studio vagy a Visual Studio Code használata.

## Futtatás
A programok futtatásához kövesse az alábbi lépéseket:

1. Nyissa meg a terminált, és navigáljon az adott projekt könyvtárába.
   Például a `CustomClassExample` esetén:
   ```bash
   cd CustomClassExample
   ```

2. Fordítsa le és futtassa a programot a következő parancsok segítségével:
    ```bash
    dotnet build
    dotnet run
    ```
