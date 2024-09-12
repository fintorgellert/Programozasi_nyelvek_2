/* 
    Ez a C forráskód példát ad az eljárások használatára.

    Feladat: Írjunk egy olyan eljárást, amely egy vonalat rajzol a képernyőre.
             a) Az első eljárás egy egész számot kap paraméterként, és annyiszor írja ki a '-' karaktert.
             b) A második eljárás szintén egy egész számot kap, de egy tetszőleges karaktert is,
                amelyből a vonal felépül.

    Fordítás és futtatás terminálban:
    $ gcc lines.c -o lines
    $ ./lines
*/


#include <stdio.h>

/* 
    Ez az eljárás egy adott számú '-' karaktert ír ki a képernyőre.
    Paraméter: 
      - count: egész szám, amely meghatározza, hogy hány '-' karaktert írjon ki.
*/
void print_dash_line(int count)
{
    // For ciklus, amely 'count' alkalommal fut, minden iterációban egy '-' karaktert ír ki.
    for (int i = 0; i < count; i++)
    {
        putchar('-');       // A 'putchar()' függvény egyetlen karakter kiírására használható
    }

    puts("");               // Új sort kezdünk a vonal végén
}

/* 
    Ez az eljárás egy adott számú tetszőleges karaktert ír ki a képernyőre.
    Paraméterek:
      - count: egész szám, amely meghatározza, hogy hányszor írjuk ki a karaktert.
      - character: a karakter, amelyből a vonalat építjük.
*/
void print_custom_line(int count, char character)
{
    // For ciklus, amely 'count' alkalommal fut, minden iterációban egy 'character' karaktert ír ki.
    for (int i = 0; i < count; i++)
    {
        printf("%c", character);    // A 'printf()' segítségével formázott karaktereket írhatunk ki
    }

    puts("");                       // Új sort kezdünk a vonal végén
}


int main()
{
    // Meghívjuk az első eljárást 10-es paraméterrel, így 10 darab '-' karakter jelenik meg.
    print_dash_line(10);

    // Kihívjuk a második eljárást 30-as paraméterrel, '*' karakterrel, így 30 darab '*' karakter jelenik meg.
    print_custom_line(30, '*');

    return 0;
}
