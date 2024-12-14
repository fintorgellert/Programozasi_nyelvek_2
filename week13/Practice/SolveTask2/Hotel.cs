using System;
using System.Collections.Generic;


namespace SolveTask2
{
    /*
     * Ez a Hotel osztály reprezentál egy szállodát, amely tartalmaz szobainformációkat,
     * vendégeket és szobafoglalási funkciókat.
     * Az osztály különféle tulajdonságokat, metódusokat és egyedi logikát használ a szálloda működésének modellezésére.
     */

    class Hotel
    {
        // Automatikus tulajdonság: csak olvasható, kívülről nem módosítható (private set).
        public string HotelName { get; private set; }

        // Az összes szoba száma. Csak olvasható.
        public int Rooms { get; private set; }

        // Az elérhető szobák száma, amely folyamatosan frissül a foglalásokkal.
        public int AvailableRooms { get; private set; }

        /*
         * Számított tulajdonság (property):
         * Ez egy csak olvasható tulajdonság, amely a foglalt szobák számát adja vissza.
         * A szintaxis: => egy kifejezés rövidített visszaadását jelenti (expression-bodied property).
         */
        public int BookedRooms => Rooms - AvailableRooms;

        /*
         * Vendégek listája:
         * Ez egy dinamikus lista, amely tárolja a szállodában lévő vendégek neveit.
         * A List<T> gyűjtemény lehetővé teszi elemek hozzáadását, eltávolítását és egyéb műveletek elvégzését.
         */
        public List<string> Guests { get; private set; }

        // Konstruktor: az osztály inicializálásáért felelős.
        public Hotel(string hotelName, int rooms)
        {
            /*
             * A konstruktor beállítja az osztály tulajdonságait a létrehozáskor kapott paraméterek alapján.
             * A `HotelName` a szálloda neve, `Rooms` az összes szoba száma,
             * `AvailableRooms` az elérhető szobák száma, kezdetben az összes szobával megegyező.
             */
            HotelName = hotelName;
            Rooms = rooms;
            AvailableRooms = rooms;

            /*
             * Az Guests lista inicializálása egy üres listával.
             * Ez biztosítja, hogy mindig működőképes lista álljon rendelkezésre.
             */
            Guests = new List<string>();
        }

        /*
         * Szobafoglalás metódus.
         * Egy vendég számára foglal egy szobát, ha van elérhető szoba.
         */
        public void BookRoom(string guestName)
        {
            /*
             * Foglalás esetén:
             * 1. Ellenőrizzük, hogy van-e még elérhető szoba (`AvailableRooms > 0`).
             * 2. Ha van, a vendég nevét hozzáadjuk a `Guests` listához.
             * 3. Csökkentjük az `AvailableRooms` értékét, mivel egy szoba foglalt lett.
             * 4. A `BookedRooms` értéke automatikusan frissül a számított tulajdonság alapján.
             */
            if (AvailableRooms > 0)
            {
                Guests.Add(guestName);
                AvailableRooms--;
                Console.WriteLine($"{guestName} sikeresen foglalt egy szobát.");
            }
            else
            {
                // Ha nincs elérhető szoba, hibaüzenetet jelenítünk meg.
                Console.WriteLine("Hiba: Nincs több elérhető szoba!");
            }
        }

        /*
         * Kijelentkezési metódus.
         * Egy vendég kijelentkezését kezeli, és növeli az elérhető szobák számát.
         */
        public void CheckoutRoom(string guestName)
        {
            /*
             * Kijelentkezés esetén:
             * 1. Ellenőrizzük, hogy a vendég neve szerepel-e a `Guests` listában.
             * 2. Ha igen, eltávolítjuk a nevét a listából.
             * 3. Növeljük az `AvailableRooms` értékét, mivel a szoba újra elérhetővé vált.
             * 4. A `BookedRooms` értéke automatikusan frissül, mivel a számított tulajdonság az `AvailableRooms` alapján működik.
             */
            if (Guests.Contains(guestName))
            {
                Guests.Remove(guestName);
                AvailableRooms++;
                Console.WriteLine($"{guestName} sikeresen kijelentkezett.");
            }
            else
            {
                // Ha a vendég neve nem található a listában, hibaüzenetet adunk.
                Console.WriteLine($"Hiba: {guestName} nem szerepel a vendéglistában!");
            }
        }

        /*
         * Szobák elérhetőségének ellenőrzése.
         * Ez a metódus logikai értékkel tér vissza: true, ha van elérhető szoba, különben false.
         */
        public bool IsRoomAvailable()
        {
            return AvailableRooms > 0;
        }

        /*
         * Az osztály formázott szöveggé alakítása.
         * Az override kulcsszóval újradefiniáljuk az Object.ToString metódust.
         */
        public override string ToString()
        {
            /*
             * Az Guests listát rendezzük lexikografikus sorrendben, hogy a kimenet mindig rendezett legyen.
             * A string.Join metódus segítségével a vendégek nevét vesszővel elválasztva fűzzük össze.
             */
            Guests.Sort();

            return $"Szálloda neve: {HotelName}\n" +
                   $"Összes szoba: {Rooms}\n" +
                   $"Elérhető szobák: {AvailableRooms}\n" +
                   $"Foglalva: {BookedRooms}\n" +
                   $"Vendégek: {string.Join(", ", Guests)}";
        }
    }
}