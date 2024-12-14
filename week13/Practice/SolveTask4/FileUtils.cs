using System;
using System.IO;                    // A fájlkezeléshez szükséges névtér
using System.Collections.Generic;   // A List típus használatához szükséges névtér

namespace SolveTask4
{
    static class FileUtils
    {
        /*
         * A ReadLines metódus egy fájlt olvas be soronként és egy List<string>-et ad vissza, 
         * amely tartalmazza a fájl összes sorát.
         * 
         * Bemenet: 
         *      - fileName: A megnyitandó fájl neve, amelyet olvasni szeretnénk.
         * Kimenet:
         *      - Egy List<string> típusú lista, amely a fájl sorait tartalmazza.
         */
        public static List<string> ReadLines(string fileName)
        {
            var lines = new List<string>();     // Egy üres lista létrehozása, amelyben tárolni fogjuk a fájl sorait.

            // A StreamReader segítségével megnyitjuk a fájlt és olvassuk soronként.
            using (var f = new StreamReader(fileName))
            {
                string? line;                   // A fájl aktuális sorának tárolására szolgáló változó.
                
                // A ReadLine metódus segítségével olvassuk a fájl sorait addig, amíg el nem érjük a fájl végét (null).
                while ((line = f.ReadLine()) != null)
                {
                    lines.Add(line);            // A beolvasott sor hozzáadása a lista végéhez.
                }
            }

            // A fájl összes sorát tartalmazó lista visszaadása.
            return lines;
        }
    }
}
