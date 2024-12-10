using System;

namespace NamespaceAndExtensions
{
    /*
     * A névterek (namespace) olyan logikai csoportosítások, amelyek lehetővé teszik,
     * hogy az azonos nevű típusok elkerüljék az ütközést különböző helyeken.
     * Például a `System` névtér tartalmazza az alapvető C# típusokat és osztályokat,
     * mint például a Console, String stb.
     * Ha saját osztályokat vagy metódusokat hozunk létre, azokat egyedi névterekbe tehetjük,
     * hogy strukturáltabb és könnyebben karbantartható kódot hozzunk létre.
     *
     * Miért használjunk névtereket?
     * - Elkerüljük a névütközéseket (különösen nagy projektekben).
     * - Könnyen átlátható, hogy melyik osztály/módszer hova tartozik.
     * - Lehetővé teszi az azonos nevű osztályok különböző funkcióval való használatát,
     *   ha azok különböző névterekben helyezkednek el.
     */

    class Program
    {
        static void Main(string[] args)
        {
            /*
             * A névterek használatával elkerülhetjük az osztálynevek ütközését.
             * Például a `NamespaceAndExtensions.StringExtensions` és egy másik névtérben
             * található `StringExtensions` nem fog ütközni.
             */

            string input = "example";

            Console.WriteLine($"Original: {input}");
            Console.WriteLine($"Capitalized: {input.Capitalize()}");
            /*
             * Itt a `Capitalize` metódust alkalmazzuk, amely egy extension method.
             * Ez azt jelenti, hogy egy meglévő osztályhoz (ebben az esetben a `string` típushoz)
             * új funkcionalitást adunk hozzá anélkül, hogy módosítanánk annak forráskódját.
             */
        }
    }

    /*
     * Kiterjesztési metódusok (Extension Methods)
     * -------------------------------------------
     * Az extension methods lehetővé teszik, hogy a meglévő osztályokat vagy interfészeket
     * új metódusokkal bővítsük anélkül, hogy módosítanánk az eredeti kódot.
     *
     * Hogyan működik?
     * - A metódust egy statikus osztályon belül hozzuk létre.
     * - Az első paraméter egy `this` kulcsszóval ellátott paraméter,
     *   amely jelzi, hogy melyik osztályt szeretnénk kiterjeszteni.
     *
     * Miért hasznos?
     * - Nem kell módosítani a meglévő osztályt (például a `string` típust, amely a .NET részét képezi).
     * - Könnyen újrahasznosítható kódot hozhatunk létre.
     * - Javítja a kód olvashatóságát, mivel úgy néz ki, mintha az osztály része lenne.
     */

    // Extension Method hozzáadása a string osztályhoz
    static class StringExtensions
    {
        /*
         * Az alábbi kiterjesztési metódus a string típushoz ad hozzá egy `Capitalize` nevű funkciót.
         * Ez az első karaktert nagybetűsre állítja, és a többit változatlanul hagyja.
         */
        public static string Capitalize(this string input)
        {
            /*
             * Ellenőrizzük, hogy az input érvényes-e:
             * Ha az input null vagy üres, azonnal visszatérünk az eredeti értékkel.
             */
            if (string.IsNullOrEmpty(input)) 
                return input;

            /*
             * A ToUpper metódussal az első karaktert nagybetűssé alakítjuk,
             * majd a maradék szöveget változatlanul csatoljuk hozzá.
             */
            return char.ToUpper(input[0]) + input.Substring(1);
        }
    }
}
