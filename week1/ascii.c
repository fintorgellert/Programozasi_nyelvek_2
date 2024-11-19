/* 
    Ez a C forráskód példát hoz az ASCII karakterek kiiratására.

    Feladat: Írassuk ki az ASCII karaktereket 32-től 127-ig.
             Kiiratás formátuma:
             32     (space)       ASCII kód, mellette a betű
             33 ...
             .
             .
             .
             127 ...

    Fordítás és futtatás terminálban:
    $ gcc ascii.c -o ascii
    $ ./ascii
*/


#include <stdio.h>

int main()
{
    // A ciklus a 32 és 127 közötti ASCII karaktereket írja ki (nyomtatható karakterek)
    for (unsigned char i = 32; i <= 127; ++i)
        printf("%d %c\n", i, i);   // Kiírja a szám értékét és a hozzá tartozó karaktert

    return 0;
}
