using System;
using System.Linq;

namespace LINQMethods
{
    class Program
    {
        public static void Main(string[] args)
        {
            int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

            // LINQ - Where metódus: Szűrés egy feltétel alapján
            var evenNumbers = numbers.Where(n => n % 2 == 0).ToList();

            // LINQ - Select metódus: Transzformáció, minden számot megszorozunk kettővel
            var doubledNumbers = numbers.Select(n => n * 2).ToList();

            // LINQ - Aggregate metódus: Összesítése egy operátorral
            var sum = numbers.Aggregate((total, next) => total + next);

            Console.WriteLine("Páros számok: " + string.Join(", ", evenNumbers));
            Console.WriteLine("Minden szám kétszerese: " + string.Join(", ", doubledNumbers));
            Console.WriteLine("A számok összege: " + sum);
        }
    }
}

/* 
 * LINQ metódusok:
 *      Where: A Where metódus egy szűrést végez a listán, és visszaadja azokat az elemeket, amelyek megfelelnek egy adott feltételnek.
 *      Select: A Select metódus a lista elemeit egy új formára transzformálja. Ebben a példában minden számot megszorozunk kettővel.
 *      Aggregate: Az Aggregate metódus egy összesítő műveletet végez el a listán, ebben a példában összeadja a számokat.
 */