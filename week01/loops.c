/*
    Ez a C forráskód célja, hogy megmutassa a ciklusok különböző fajtáinak működését.

    A feladat: Ötször írassuk ki a nevünket (jelen esetben "Anna") külön sorokba,
    és ezt valósítsuk meg három különböző ciklussal: 'for', 'while' és 'do-while'.

    Fordítás és futtatás terminálban:
    $ gcc loops.c -o loops
    $ ./loops
*/


#include <stdio.h> // A standard input/output függvényekhez szükséges könyvtár

int main()
{
    /*
        'for' ciklus: Ez a ciklus pontosan 5 alkalommal fog futni,
        hiszen a feltétel (i < 5) meghatározza a futások számát.
        A for ciklus három fő része:
        1. Inicializálás: A ciklusváltozó (i) kezdőértéket kap.
        2. Feltétel: A ciklus akkor fut tovább, ha a feltétel (i < 5) igaz.
        3. Inkrementálás: Minden iteráció után az i változó értéke eggyel nő.
    */
    puts("Output of 'for' loop:");

    for (int i = 0; i < 5; i++)     // Kezdeti érték 'i=0'; Futás, amíg 'i < 5'; 'i' növelése
        puts("Anna");               // A puts() függvény kiírja a "Anna" szöveget új sorba

    /*
        'while' ciklus: Ez egy előtesztelős ciklus, vagyis mielőtt a ciklus törzse végrehajtódna,
        ellenőrzi, hogy a feltétel (cnt < 5) igaz-e. Ha igen, a ciklus lefut, ha nem, kilép.
        Ebben az esetben a feltétel: 'cnt' legyen kisebb, mint 5.
    */
    puts("\nOutput of 'while' loop:");

    int cnt = 0;                    // A ciklusváltozó inicializálása 0-ra

    while (cnt < 5)                 // Addig fut a ciklus, amíg 'cnt < 5'
    {
        puts("Anna");               // Kiírja a "Anna" szót
        cnt++;                      // Növeljük a 'cnt' változó értékét minden egyes futás után
    }

    /*
        'do-while' ciklus: Ez egy utótesztelős ciklus, ami azt jelenti, hogy a ciklus törzse
        legalább egyszer mindig lefut, mert a feltételt csak a végén ellenőrzi.
        Ebben az esetben a ciklus törzse akkor is lefutna, ha a feltétel kezdetben hamis lenne.
    */
    puts("\nOutput of 'do-while' loop:");

    cnt = 0;                        // A ciklusváltozó újra inicializálása 0-ra

    do
    {
        puts("Anna");               // A ciklus törzse: kiírja a "Anna" szót
        cnt++;                      // Minden iteráció után növeljük a 'cnt' értékét
    } while (cnt < 5);              // A ciklus addig fut, amíg a feltétel (cnt < 5) igaz

    return 0;                       // A program sikeres befejezése
}
