/* 
    Ez a C forráskód példát hoz a heap memória használatára és a stack overflow-ra.
    
    A kód bemutatja:
    a) Hogyan lehet heap memóriát foglalni és felszabadítani a malloc és free függvényekkel.
    b) Hogyan okozhatunk stack overflow-t rekurzív függvényhívásokkal.
    
    Fontos megjegyezni, hogy a heap memória olyan memória területet jelent, amelyet futásidőben foglalunk le
    és amelyet a program futása során dinamikusan használhatunk és szabadíthatunk fel. Ezzel szemben
    a stack memória a függvényhívások és lokális változók tárolására szolgál, és stack overflow akkor történik,
    amikor a stack memória területe kimerül, például túl sok rekurzív függvényhívás esetén.
    
    Fordítás és futtatás terminálban:
    $ gcc stack_heap.c -o stack_heap
    $ ./stack_heap
*/


#include <stdio.h>
#include <stdlib.h>  // A malloc és free függvényekhez szükséges

// Rekurzív függvény, amely végtelen ciklusban hívja önmagát
void function(void) {
    function();     // Rekurzív hívás
}

int main()
{
    int *ptr;                       // Pointer a heap memóriában lefoglalt tömbhöz
    int n = 10;                     // Tömb mérete
    int i;

    // Heap memória foglalása a 'n' hosszúságú int tömb számára
    ptr = (int*)malloc(n * sizeof(int));
    
    // Ellenőrizzük, hogy a malloc sikeresen lefoglalt-e memóriát
    if (ptr == NULL) {
        fprintf(stderr, "Memory allocation failed\n");
        return 1;                   // Ha a malloc nem tud memóriát foglalni, kilépünk
    }

    // A tömb feltöltése értékekkel
    for (i = 0; i < n; ++i) {
        ptr[i] = i * 10;
    }

    // A tömb elemeinek kiíratása
    printf("The elements of the array are: ");
    for (i = 0; i < n - 1; ++i) {
        printf("%d, ", ptr[i]);
    }
    printf("%d\n", ptr[n - 1]);     // Az utolsó elem kiírása külön

    // Heap memória felszabadítása
    free(ptr);

    /* 
        A stack overflow bemutatása
        FIGYELEM: Az alábbi sor a programot valószínűleg le fogja állítani a stack overflow miatt!
    */
    function();

    return 0;
}