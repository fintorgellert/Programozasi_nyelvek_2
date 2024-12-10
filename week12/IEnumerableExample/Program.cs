using System;
using System.Collections;
using System.Collections.Generic;

namespace IEnumerableExample
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
             * Az IEnumerable interfész alapvetően arra szolgál, hogy lehetővé tegye egy osztály számára,
             * hogy elemei bejárhatók legyenek, például foreach ciklussal.
             * Ez különösen hasznos olyan esetekben, amikor egyéni gyűjteményeket (custom collections)
             * szeretnénk használni.
             *
             * Az alábbi kód bemutatja, hogyan implementáljuk az IEnumerable interfészt egyedi gyűjteményekkel.
             */

            CustomCollection collection = new CustomCollection();

            Console.WriteLine("Custom collection elements:");
            foreach (var item in collection)
            {
                /*
                 * A foreach ciklus automatikusan hívja az IEnumerator interfész által biztosított metódusokat,
                 * például a MoveNext() és a Current tulajdonságokat.
                 * Ennek segítségével a gyűjtemény minden elemét sorban feldolgozhatjuk.
                 */
                Console.WriteLine(item); // Az aktuális elem kiíratása
            }
        }
    }

    /*
     * A CustomCollection osztály egy egyedi gyűjteményt reprezentál,
     * amely implementálja az IEnumerable interfészt.
     * Ez lehetővé teszi, hogy a gyűjtemény elemei foreach ciklussal bejárhatók legyenek.
     */
    class CustomCollection : IEnumerable<int>
    {
        // Egy belső tömb, amely a gyűjtemény elemeit tárolja.
        private int[] items = { 1, 2, 3, 4, 5 };

        /*
         * Az IEnumerable<T> interfész megköveteli a GetEnumerator metódus implementálását.
         * Ez a metódus visszaad egy IEnumerator<T> példányt,
         * amely az elemek bejárásához szükséges funkciókat biztosítja.
         */
        public IEnumerator<int> GetEnumerator()
        {
            /*
             * A yield kulcsszó egyszerűsíti az Enumerator objektum készítését.
             * Ez a kulcsszó automatikusan generál egy Enumerator osztályt a háttérben,
             * és lehetővé teszi az elemek egymás utáni visszaadását.
             */
            foreach (var item in items)     // A belső tömb bejárása
            {
                yield return item;          // Az aktuális elem visszaadása a bejárás során
            }
        }

        /*
         * Az IEnumerable interfész nem generikus változata szintén megköveteli
         * a GetEnumerator metódus implementálását.
         * Ez a metódus általában egyszerűen a generikus változatra hivatkozik.
         */
        IEnumerator IEnumerable.GetEnumerator()
        {
            /*
             * Itt az általános (generikus) GetEnumerator metódust hívjuk meg.
             * Ez biztosítja az egyszerű és következetes implementációt.
             */
            return GetEnumerator();
        }
    }
}
