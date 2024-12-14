using System;

namespace StaticVariableExample
{
    class Counter
    {
        // Statikus változó, amely minden példány számára közös
        public static int Count = 0;

        public Counter()
        {
            Count++;  // Minden új példány növeli a Count változót
        }
    }

    class Program
    {
        public static void Main(string[] args)
        {
            // Két példány létrehozása
            new Counter();
            new Counter();

            Console.WriteLine($"Példányok száma: {Counter.Count}");
        }
    }
}

/*     
 * Statikus változó: A static kulcsszóval jelölt változó osztályváltozó, tehát minden egyes példány számára közös. 
 *                   Az osztály bármely példányának módosítása hatással van az összes többi példányra.
 * Ebben a példában a Count változó számolja a Counter osztály példányait. 
 */