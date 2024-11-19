/* 
    Ez a C forráskód a mutatók (pointers) használatára hoz példát.

    Feladat: 
        a) Hozzunk létre egy 'x' nevű változót, amelynek kezdeti értéke 5, majd hozzunk létre egy 'p' mutatót, 
           ami az 'x' változóra mutat.
        b) Módosítsuk az 'x' értékét a 'p' mutatón keresztül.
        c) Hozzunk létre egy 'q' mutatót, ami ugyanoda mutat, mint a 'p'.
    
    Fordítás és futtatás terminálban:
    $ gcc pointers.c -o pointers
    $ ./pointers
*/    


#include <stdio.h>

int main()
{
    // a) Hozzunk létre egy 'x' nevű változót, amelynek kezdeti értéke 5
    int x = 5; 
    
    // Hozzunk létre egy 'p' mutatót, amely az 'x' változóra mutat
    int *p = &x;

    // Kiírjuk az 'x' és a 'p' által mutatott értéket (ami szintén 'x')
    printf("Az x változó értéke: %d\n", x);                 // Eredeti érték
    printf("A p mutató által mutatott érték: %d\n", *p);    // 'p' az 'x' címére mutat, ezért az 'x' értéke jelenik meg
    
    // b) Módosítsuk az 'x' értékét a 'p' mutatón keresztül
    *p = 6;         // Az 'x' értékét 5-ről 6-ra változtatjuk a 'p' mutatón keresztül

    // Kiírjuk az új 'x' értéket, amelyet a 'p' mutatón keresztül módosítottunk
    printf("Az x új értéke: %d\n", x);

    // c) Hozzunk létre egy 'q' mutatót, amely ugyanoda mutat, mint a 'p'
    int *q = p;    // 'q' most ugyanarra a memóriahelyre mutat, mint 'p', tehát az 'x' értékére

    // Kiírjuk a 'q' mutató által mutatott értéket, ami az 'x' értéke lesz
    printf("A q mutató által mutatott érték: %d\n", *q);    // Ez az 'x' új értéke: 6

    return 0;
}
