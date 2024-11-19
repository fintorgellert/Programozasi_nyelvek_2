/* 
    Ez a C forráskód a tömbök kezelésére hoz példát.

    Feladat: Foglaljunk tárterületet egy tíz elemű tömbnek, majd töltsük fel őket egész számokkal.
             Írjunk egy függvényt, amely megkapja a tömb hosszát, a tömböt és egy egész számot, és
             ha benne van a tömbben a megadott szám, visszatér a tömbben lévő indexével, különben -1.
             Írjunk egy eljárást, amely kiiratja a tömb értékeit a képernyőre.

    Fordítás és futtatás terminálban:
    $ gcc array.c -o array
    $ ./array
*/


#include <stdio.h>

/* 
    Ez a függvény megkapja a tömb hosszát, a tömböt és egy keresett értéket.
    Ha a keresett érték szerepel a tömbben, visszatér a tömb indexével, különben -1-et ad vissza.
 */
int find(int length, int *array, int value)
{
    // Végigiterálunk a tömbön
    for (int i = 0; i < length; i++) {
        // Ha megtaláljuk a keresett értéket, visszatérünk az indexével
        if (array[i] == value)
            return i;
    }
    return -1;          // Ha nem találjuk a keresett értéket, -1-et adunk vissza
}

/* 
    Ez az eljárás megkapja a tömb hosszát és magát a tömböt, majd kiírja annak elemeit.
 */
void print_array(int length, int *array)
{
    // A tömb összes elemének kiíratása egymás alá
    for (int i = 0; i < length; ++i)
        printf("%d\n", array[i]);
}


int main()
{
    int length = 10;                        // A tömb hossza
    int array[length];                      // A 10 elemű tömb deklarálása

    // A tömb feltöltése 0-tól 9-ig terjedő értékekkel
    for (int i = 0; i < length; ++i)
        array[i] = i;

    // Keresés a tömbben
    int result = find(length, array, 8);    // A '8' érték keresése a tömbben

    // Az eredmény kiíratása
    printf("Index of the value found in the array: %d\n", result);

    puts("The contents of the array are:");
    // A tömb kiíratása
    print_array(length, array);

    return 0;
}
