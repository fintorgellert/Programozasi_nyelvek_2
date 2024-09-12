/* 
    Ez a C forráskód a struktúrák használatára ad példát.

    Feladat:
        a) Hozzunk létre egy 'Point' nevű struktúrát, amely tárolja két pont (A és B) koordinátáit egy 2D síkban.
           - Az A pont koordinátái: (1, 2)
           - A B pont koordinátái: (6, 5)
        b) Írjunk egy függvényt, amely kiszámítja két pont távolságát a koordináta-rendszerben.
    
    Fontos: A távolság kiszámításához a matematikai függvények használata miatt 
            a fordításnál használni kell az '-lm' kapcsolót, ami a matematikai könyvtárat kapcsolja be.

    Fordítás és futtatás terminálban:
    $ gcc points.c -lm -o points
    $ ./points 
*/


#include <stdio.h>
#include <math.h>

// 'Point' struktúra, amely két koordinátát tárol (x és y)
typedef struct
{
    int x;  // X koordináta
    int y;  // Y koordináta
} Point;

/* 
    Ez a függvény kiszámítja két pont (A és B) távolságát a 2D síkon.
    A távolságot a következő képlet alapján számoljuk: sqrt((x2 - x1)^2 + (y2 - y1)^2)
 */
float distance(Point A, Point B)
{
    return sqrt(pow(B.x - A.x, 2) + pow(B.y - A.y, 2));     // Pitagorasz-tétel alkalmazása
}

int main()
{
    // A pont (1, 2) koordinátái
    Point A;
    A.x = 1;
    A.y = 2;

    // B pont (6, 5) koordinátái
    Point B;
    B.x = 6;
    B.y = 5;

    printf("Point A: (%d, %d)\n", A.x, A.y);
    printf("Point B: (%d, %d)\n", B.x, B.y);

    // A két pont közötti távolság kiszámítása
    float result = distance(A, B);
    
    // Az eredmény kiírása két tizedes pontossággal
    printf("Distance between points A and B: %.2f\n", result);

    return 0;
}
