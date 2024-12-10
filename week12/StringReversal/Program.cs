using System;

namespace StringReversal
{
    /*
     * A StringReversal névtér célja, hogy bemutasson egy módszert sztringek megfordítására.
     * A sztring megfordítása hasznos lehet különböző alkalmazásokban, például palindromok ellenőrzése,
     * titkosítási algoritmusok, vagy akár egyszerű szöveges manipulációk során.
     */

    class Program
    {
        static void Main(string[] args)
        {
            /*
             * Az alábbi program bemutatja, hogyan lehet egy sztringet megfordítani.
             * Az input egy egyszerű szöveg, amelyet karaktertömbbé alakítunk, majd megfordítunk.
             * Ezután az eredményt visszaalakítjuk sztringgé, és kiírjuk a konzolra.
             */

            // Bemeneti sztring inicializálása
            string input = "Hello, World!";
            /*
             * A fenti változóban tároljuk az eredeti szöveget, amit meg akarunk fordítani.
             * Ebben az esetben: "Hello, World!".
             */

            // Megfordított sztring kiszámítása a ReverseString metódussal
            string reversed = ReverseString(input);

            // Az eredeti és megfordított sztring kiírása a konzolra
            Console.WriteLine($"Original: {input}");
            Console.WriteLine($"Reversed: {reversed}");
        }

        /*
         * ReverseString Metódus
         * ----------------------
         * Ez a metódus egy sztringet kap bemenetként, és egy megfordított sztringet ad vissza.
         * A megvalósítás:
         * 1. A sztringet karaktertömbbé alakítjuk a ToCharArray metódussal.
         * 2. A tömb elemeit az Array.Reverse metódussal megfordítjuk.
         * 3. Az eredményül kapott karaktertömbből egy új sztringet készítünk, amelyet visszaadunk.
         */

        static string ReverseString(string input)
        {
            /*
             * Ellenőrzés: Ha a bemenet null vagy üres, az eredmény szintén ugyanaz.
             * Ez a lépés elkerüli az esetleges hibákat és fölösleges feldolgozást.
             */
            if (string.IsNullOrEmpty(input))
            {
                return input;
            }

            // A sztringet karaktertömbbé alakítjuk
            char[] chars = input.ToCharArray();
            /*
             * A ToCharArray metódus minden karaktert kiemel a sztringből,
             * és ezeket egy karaktertömbbe helyezi.
             * Példa: "Hello" -> ['H', 'e', 'l', 'l', 'o']
             */

            // A karaktertömb elemeinek megfordítása
            Array.Reverse(chars);
            /*
             * Az Array.Reverse metódus megfordítja a tömb elemeinek sorrendjét.
             * Példa: ['H', 'e', 'l', 'l', 'o'] -> ['o', 'l', 'l', 'e', 'H']
             */

            // A megfordított karaktertömbből sztringet készítünk
            return new string(chars);
            /*
             * A new string konstruktor visszaalakítja a karaktertömböt sztringgé.
             * Az eredmény: "olleH".
             */
        }
    }
}
