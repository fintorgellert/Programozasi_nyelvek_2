/*
    Ez a C forráskód példát ad a függvények használatára.
    
    Feladat: Két különböző függvényt készítünk, amelyek eldöntik egy szám párosságát.
    a) Az első függvény 0-t vagy 1-et ad vissza a szám párosságának megfelelően.
    b) A második függvény 'true' vagy 'false' értéket ad vissza.

    Fordítás és futtatás terminálban:
    $ gcc odd_even.c -o odd_even
    $ ./odd_even
*/


#include <stdio.h>
#include <stdbool.h>  // A bool típus és true/false használatához

/* 
    Ez a függvény eldönti, hogy a paraméterként kapott szám páros-e.
    Ha a szám páros, 1 értéket ad vissza, különben 0-t.
*/
int is_even_binary(int number)
{
    // Ellenőrizzük, hogy a szám páros-e (a 2-vel való osztás maradéka nulla)
    return number % 2 == 0 ? 1 : 0;  // Visszaadjuk 1-et, ha páros, különben 0-t
}

/* 
    Ez a függvény eldönti, hogy a paraméterként kapott szám páros-e.
    Ha a szám páros, 'true' értéket ad vissza, különben 'false'-t.
*/
bool is_even_bool(int number)
{
    // Ellenőrizzük, hogy a szám páros-e (a 2-vel való osztás maradéka nulla)
    return number % 2 == 0;  // Visszaadjuk true-t, ha páros, különben false-t
}


int main()
{
    int a = 856;                                    // Példaérték a vizsgálathoz

    // Meghívjuk az 'is_even_binary' függvényt és kiírjuk az eredményt
    int result1 = is_even_binary(a);                           
    printf("%d is %d (binary)\n", a, result1);      // Kiírjuk, hogy a szám páros (1) vagy páratlan (0)

    int b = 741;                                    // Másik példaérték a vizsgálathoz

    // Meghívjuk az 'is_even_bool' függvényt és kiírjuk az eredményt
    bool result2 = is_even_bool(b);                           
    printf("%d is %s (bool)\n", b, result2 ? "even" : "odd");  // Kiírjuk, hogy a szám páros ('even') vagy páratlan ('odd')

    return 0;
}
