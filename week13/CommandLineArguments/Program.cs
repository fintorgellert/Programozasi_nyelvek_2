using System;

namespace CommandLineArguments
{
    class Program
    {
        public static void Main(string[] args)
        {
            // Parancssori argumentumok kezelése
            // Az args tömb tartalmazza azokat az argumentumokat, amelyeket a program futtatásakor átadnak.
            
            // Ellenőrizzük, hogy kaptunk-e argumentumokat, ha nincs átadott, akkor üzenetet írunk ki.
            if (args.Length == 0)
            {
                Console.WriteLine("Nincs átadott argumentum!");
            }
            else
            {
                // Kiírjuk az argumentumokat
                Console.WriteLine("Átadott argumentumok:");
                foreach (var arg in args)
                {
                    Console.WriteLine(arg);
                }
            }
        }
    }
}
