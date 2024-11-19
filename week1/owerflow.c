/* 
    Ez a C forráskód egy túlcsordulásra (overflow) ad példát.

    A túlcsordulás akkor következik be, amikor egy változó meghaladja a tárolható maximális értéket, 
    és a következő szám az alsó határra "visszapattan". 
    Például egy signed int típusú változó 32 biten van tárolva, így annak értéke korlátozott
    (-2^31 és 2^31-1 között).

    Fordítás és futtatás terminálban:
    $ gcc overflow.c -o overflow
    $ ./overflow
*/


#include <stdio.h>
#include <stdbool.h>

int main()
{
    int i = 1;                              // Kezdeti érték: 1
    
    // Végtelen ciklus, amely megduplázza 'i' értékét minden iterációban
    while (true) {
        i *= 2;                             // Minden ciklusban 'i' értéke kétszereződik

        // Amikor 'i' negatívvá válik, az azt jelzi, hogy túlcsordulás történt
        if (i < 0) {
            puts("Oops! An overflow has occurred!");
            printf("i = %d\n", i);          // Kiírjuk 'i' értékét, ami már hibás a túlcsordulás miatt
            break;                          // Kilépünk a ciklusból
        }
    }

    return 0;
}
