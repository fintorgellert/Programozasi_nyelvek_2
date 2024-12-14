# Programozási nyelvek 2

Üdvözöllek a Programozási nyelvek 2 laborórák kódgyűjteményében! Itt találhatók a laborórák során készített kódok, valamint részletes magyarázatok, amelyek segítenek az anyag könnyebb megértésében és elsajátításában.

## Tartalom

- **Kódok**: Minden laborórán megírt kód példákkal és magyarázatokkal.
- **Magyarázatok**: Részletes leírások és kommentárok a kódokban, amelyek segítenek a programozási fogalmak és technikák megértésében.

## Használat

1. **Kódok megtekintése**: Böngéssz a különböző fájlok között, és nézd meg a példakódokat.
2. **Futtatás**: Kövesd a fájlokban található utasításokat a kódok fordításához és futtatásához.
3. **Magyarázatok**: Olvasd el a kommentárokat és magyarázatokat a kódok jobb megértéséhez.

## Cél

A repository célja, hogy segítse a Programozási nyelvek 2 tantárgy anyagának gyakorlását és mélyebb megértését. A kódok és magyarázatok kombinációja révén hatékonyan sajátítható el a tananyag.

## Fordítás és futás

### C programozási nyelv

A C nyelvű programok fordítása és futtatása az alábbi lépések szerint történik:

1. **Fordítás**: Használj `gcc` fordítót a program forráskódjának fordításához:
    ```bash
    gcc <fájl_név>.c -o <kimeneti_fájl>
    ```
2. **Futtatás**: A fordított program futtatása az alábbi parancs használatával történik:
    ```bash
    ./<kimeneti_fájl>
    ```

### Java programozási nyelv

A Java nyelvű programok fordítása és futtatása az alábbi lépések szerint történik:

1. **Fordítás**: Használj `javac` fordítót a program forráskódjának fordításához:
    ```bash
    javac <fájl_név>.java
    ```
2. **Futtatás**: A fordított program futtatása az alábbi parancs használatával történik:
    ```bash
    java <osztály_név>
    ```

**Fontos**: A Java osztály nevének meg kell egyeznie a fájl nevével, és az `.java` fájlt a fordítás után a `.class` fájl fogja tartalmazni a bytecode-ot, amelyet a `java` parancs segítségével futtathatsz.

### C# programozási nyelv

A C# nyelvű programok fordítása és futtatása az alábbi lépések szerint történik:

1. **Fordítás**: Használj `dotnet` parancsot a program forráskódjának fordításához. Először is győződj meg róla, hogy a .NET SDK telepítve van, majd navigálj a projekt mappájába és futtassa:
    ```bash
    dotnet build
    ```

2. **Futtatás**: A fordított program futtatása az alábbi parancs használatával történik:
    ```bash
    dotnet run
    ```

**Fontos**: A C# projektnek rendelkeznie kell egy `.csproj` fájlal, amely tartalmazza a projekt beállításait. A `dotnet build` parancs a forráskódot lefordítja, a `dotnet run` pedig futtatja a programot.
