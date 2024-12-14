using System;
using System.Collections.Generic;

namespace SolveTask2
{
    class Program
    {
        static void Main()
        {
            /*
             * A Main metódus a program belépési pontja.
             * Itt teszteljük a Hotel osztály funkcionalitását különböző műveletekkel.
             */

            // Szálloda példányosítása egy "Sunny Hotel" nevű szállodával, amelynek 5 szobája van.
            var hotel = new Hotel("Sunny Hotel", 5);

            // A szálloda aktuális állapotának kiírása.
            Console.WriteLine(hotel);
            Console.WriteLine();

            // Szobák foglalása három vendég számára.
            hotel.BookRoom("Kovács Béla");
            hotel.BookRoom("Nagy Anna");
            hotel.BookRoom("Szabó Péter");
            Console.WriteLine();

            // A vendégek listájának és az aktuális szálloda állapotának kiírása.
            Console.WriteLine(hotel);
            Console.WriteLine();

            // Egy vendég kijelentkezése a szállodából.
            hotel.CheckoutRoom("Nagy Anna");
            Console.WriteLine();

            // Ellenőrzés, hogy van-e elérhető szoba.
            if (hotel.IsRoomAvailable())
            {
                Console.WriteLine("Van még elérhető szoba!");
            }
            else
            {
                Console.WriteLine("Nincs több elérhető szoba!");
            }

            // Hibaüzenet generálása egy nem létező vendég kijelentkezésekor.
            hotel.CheckoutRoom("Valaki Másik");
            Console.WriteLine();

            // Az aktuális állapot végső kiírása.
            Console.WriteLine(hotel);
        }
    }
}
