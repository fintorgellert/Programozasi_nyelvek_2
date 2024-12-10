using System;

namespace ForeachExample
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
             * A foreach ciklust akkor használjuk, ha egy gyűjtemény elemeit szeretnénk végigjárni.
             * Ez egy egyszerű és biztonságos módja a bejárásnak, mivel nem kell indexelést kezelnünk.
             */

            string[] fruits = { "Apple", "Banana", "Cherry" };

            Console.WriteLine("List of fruits:");
            foreach (var fruit in fruits)
            {
                Console.WriteLine(fruit);
            }

            /*
             * Fontos megjegyezni, hogy a foreach ciklus csak olvasásra használható,
             * az elemek módosítását nem támogatja közvetlenül.
             */
        }
    }
}
