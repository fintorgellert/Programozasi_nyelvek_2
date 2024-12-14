using System;

namespace ExceptionHandling
{
    class Program
    {
        public static void Main(string[] args)
        {
            try
            {
                // Próbáljuk meg elosztani a számot nullával
                int result = 10 / 0;
                Console.WriteLine(result);
            }
            catch (DivideByZeroException ex)
            {
                // Ha nullával osztunk, ezt az üzenetet kapjuk
                Console.WriteLine("Hiba: Nullával nem lehet osztani!");
                Console.WriteLine($"Részletes hiba: {ex.Message}");
            }
            finally
            {
                // A végrehajtás mindig ide kerül, akár volt hiba, akár nem
                Console.WriteLine("A kivételkezelés befejeződött.");
            }
        }
    }
}
