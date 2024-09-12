/*
    Ez a program C nyelven kiíratja a képernyőre a "Hello World!" szöveget.

    A C programok forráskódját a 'gcc' (GNU Compiler Collection) segítségével lehet lefordítani.
    A '-o' kapcsoló lehetővé teszi, hogy megnevezzük a létrejövő futtatható fájlt.
    Például az alábbi parancs lefordítja és hello_world' néven létrehozza a programot:

    Futtatás terminálban:
    $ gcc hello_world.c -o hello_world

    Ezután futtathatjuk a következő módon:
    $ ./hello_world
*/


#include <stdio.h>      // Ez a könyvtár szükséges a printf() függvény használatához

int main()
{
    /* 
        A 'printf()' függvény segítségével szöveget írunk ki a képernyőre.
        A "\n" egy speciális karakter, amely új sort jelent.
    */
    printf("Hello world!\n");

    // A 'return 0' azt jelenti, hogy a program sikeresen lefutott.
    return 0;
}