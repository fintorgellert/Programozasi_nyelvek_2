using System;

namespace ArraysAndMatrices
{
    class Program
    {
        public static void Main(string[] args)
        {
            // Egy dimenziós tömb
            int[] numbers = { 1, 2, 3, 4, 5 };

            // Két dimenziós mátrix
            int[,] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
            };

            // Tömb kiírása
            Console.WriteLine("Tömb:");
            foreach (var number in numbers)
            {
                Console.Write(number + " ");
            }

            // Mátrix kiírása
            Console.WriteLine("\nMátrix:");
            for (int i = 0; i < matrix.GetLength(0); i++)
            {
                for (int j = 0; j < matrix.GetLength(1); j++)
                {
                    Console.Write(matrix[i, j] + " ");
                }
                Console.WriteLine();
            }
        }
    }
}

/* 
 * Tömbök és mátrixok: A tömb egy egyszerű, egydimenziós adatstruktúra, amely azonos típusú elemeket tárol.
 *      A mátrix (kétdimenziós tömb) az elemeket sorok és oszlopok szerint rendezi el, és egy kétdimenziós tömböt használunk a reprezentálására.
 *      A GetLength metódussal lekérdezhetjük a tömb adott dimenziójának hosszát.
 */