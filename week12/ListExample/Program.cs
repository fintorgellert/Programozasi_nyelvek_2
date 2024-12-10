using System;
using System.Collections.Generic;

namespace ListExample
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
             * A List<T> egy általános (generikus) gyűjteménytípus, amelyet dinamikus méretű tömbként használhatunk.
             * Ez azt jelenti, hogy a méretét nem kell előre meghatározni, bármikor hozzáadhatunk vagy eltávolíthatunk elemeket.
             * A List osztály metódusai és tulajdonságai lehetővé teszik az elemek hatékony kezelését.
             */

            // Létrehozunk egy listát név szerint
            List<string> names = new List<string> { "Alice", "Bob", "Charlie" };

            // Új elem hozzáadása a lista végéhez
            names.Add("Diana");
            /*
             * A Add() metódus hozzáad egy új elemet a lista végéhez.
             * Ez dinamikusan bővíti a lista méretét.
             */

            // Elem beszúrása egy adott helyre
            names.Insert(1, "Eve");
            /*
             * A Insert() metódus lehetővé teszi egy elem hozzáadását egy adott indexre.
             * Az alábbi példában az "Eve" nevet az 1-es indexre (a második helyre) helyezzük be.
             */

            // Elem eltávolítása név alapján
            names.Remove("Bob");
            /*
             * A Remove() metódus az első előfordulását távolítja el az adott elemnek.
             * Ha az elem nem található, nem történik változás.
             */

            // Elem eltávolítása index alapján
            names.RemoveAt(0);
            /*
             * A RemoveAt() metódus az adott indexű elemet távolítja el.
             * Ebben az esetben az első elemet távolítjuk el, amely az "Alice" név.
             */

            // A lista összes elemének eltávolítása
            // names.Clear();
            /*
             * A Clear() metódus eltávolítja az összes elemet a listából,
             * így a lista teljesen üres lesz.
             */

            // A lista elemeinek kiíratása
            Console.WriteLine("Current names in the list:");
            foreach (var name in names)
            {
                Console.WriteLine(name);
            }

            // A lista elemeinek rendezése
            names.Sort();
            /*
             * A Sort() metódus növekvő sorrendbe rendezi a lista elemeit.
             * Alfanumerikus sorrendet használ (számok vagy betűk sorrendje).
             */

            Console.WriteLine("\nSorted names:");
            foreach (var name in names)
            {
                Console.WriteLine(name);
            }

            // Egy elem keresése
            bool containsCharlie = names.Contains("Charlie");
            /*
             * A Contains() metódus visszaad egy logikai értéket attól függően,
             * hogy az adott elem szerepel-e a listában.
             */

            Console.WriteLine($"\nDoes the list contain 'Charlie'? {containsCharlie}");

            // Egy adott feltétel alapján keresés
            string foundName = names.Find(name => name.StartsWith("D"));
            /*
             * A Find() metódus az első elemet adja vissza, amely megfelel a megadott feltételnek.
             * A feltételt egy lambda kifejezéssel adhatjuk meg.
             * Az alábbi példában az első olyan nevet keressük, amely 'D' betűvel kezdődik.
             */
            Console.WriteLine($"First name starting with 'D': {foundName}");

            // Lista hosszának lekérdezése
            Console.WriteLine($"Number of names in the list: {names.Count}");
            /*
             * A Count tulajdonság a lista elemeinek aktuális számát adja vissza.
             */

            // Részlista létrehozása
            List<string> sublist = names.GetRange(0, 2);
            /*
             * A GetRange() metódus egy részlistát ad vissza a megadott kezdőindexből
             * és a megadott hosszúságig.
             * Az alábbi példában az első két elemet kapjuk meg.
             */
            Console.WriteLine("\nSublist:");
            foreach (var name in sublist)
            {
                Console.WriteLine(name);
            }

            // Lista elemeinek megfordítása
            names.Reverse();
            /*
             * A Reverse() metódus megfordítja a lista elemeinek sorrendjét.
             */
            Console.WriteLine("\nReversed list:");
            foreach (var name in names)
            {
                Console.WriteLine(name);
            }
        }
    }
}
