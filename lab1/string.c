/* 
    Ez a C forráskód a typedef-re hoz egy példát.

    Fordítás és futtatás terminálban:
    $ gcc string.c -o string
    $ ./string
*/


#include <stdio.h>

// A typedef segítségével a 'char *' típusú pointert 'string'-ként aliasoljuk
typedef char * string;

int main()
{
    // Létrehozunk egy 'string' típusú változót és inicializáljuk egy szöveggel
    string text = "Geza kek az eg";

    // Kiírjuk a szöveget a képernyőre
    puts(text);

    return 0;
}
