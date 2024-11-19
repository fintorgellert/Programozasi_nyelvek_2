/* 
    Ez a C forráskód a `continue` és `break` utasítások használatára ad példát.
    
    A `continue` utasítás hatására a ciklus hátralévő része kihagyásra kerül, 
    és a következő iterációval folytatódik.
    A `break` utasítás kiléptet a ciklusból.

    Fordítás és futtatás terminálban:
    $ gcc continue_break.c -o continue_break
    $ ./continue_break
*/


#include <stdio.h>

int main()
{
    /* 
        Ebben a for ciklusban 1-től 20-ig fogunk iterálni. 
        A ciklus minden egyes iterációban ellenőrzi az aktuális számot:
        - Ha a szám 10-nek a többszöröse, akkor a `break` utasítással kilépünk a ciklusból.
        - Ha a szám páros, a `continue` utasítás segítségével átugorjuk a ciklus hátralévő részét, 
          és a következő iterációval folytatjuk.
        - Ha a szám páratlan és nem többszöröse 10-nek, akkor kiírjuk a számot.
    */
    for (int i = 1; i <= 20; ++i)
    {
        // Ha a szám 10-nek a többszöröse (azaz i % 10 == 0), kilépünk a ciklusból.
        if (i % 10 == 0)
            break;              // A `break` utasítás kilép a ciklusból, azonnal befejezve azt.

        // Ha a szám páros (azaz i % 2 == 0), ugorjuk át az aktuális iterációt.
        if (i % 2 == 0)
            continue;           // A `continue` utasítás kihagyja az aktuális iteráció további részét.

        // Kiírjuk az aktuális számot, ha nem páros, és nem léptünk ki a ciklusból.
        printf("%d ", i);
    }

    puts("");

    return 0;
}
