using System;

namespace RandomNumberExample
{
    class Program
    {
        public static void Main(string[] args)
        {
            /* 
             * Véletlenszámok: A Random osztály segítségével véletlenszámokat generálhatunk.
             * A Next metódus két paramétert fogad: az alsó és felső határt, és egy véletlenszámot generál ezen tartományon belül. 
             */
             
            Random rand = new Random();

            // Véletlenszám generálása 1 és 100 között
            int randomNumber = rand.Next(1, 101);

            Console.WriteLine($"A generált véletlenszám: {randomNumber}");
        }
    }
}
