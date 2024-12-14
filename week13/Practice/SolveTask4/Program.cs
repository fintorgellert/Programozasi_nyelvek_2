using System;
using static System.Console;
using System.Linq;
using System.IO;
using System.Collections;
using System.Collections.Generic;

namespace SolveTask4
{
    class Program
    {
        public static void Main(string[] args)
        {
            // Beolvassuk az in1.txt fájl sorait, a sorokat átalakítjuk double típusúvá,
            // és eltávolítjuk az esetleges felesleges szóközöket a sorok elejéről és végéről.
            var in1 = FileUtils.ReadLines("doc/in1.txt").Select(s => double.Parse(s.Trim())).ToList();
            // Beolvassuk az in2.txt fájl sorait, és ugyanezt a műveletet végezzük el a sorokon.
            var in2 = FileUtils.ReadLines("doc/in2.txt").Select(s => double.Parse(s.Trim())).ToList();

            var counter = 0;                                        // A sikeres kísérletek számának nyomon követése.

            // A StreamWriter segítségével megnyitjuk a "doc/out.txt" fájlt írásra.
            using (var g = new StreamWriter("doc/out.txt"))
            {
                // Végigiterálunk az in1 és in2 listák elemein, az indexek összevetésével.
                for (var i = 0; i < in1.Count(); i++)
                {
                    // Ha az in1[i] és in2[i] összege nagyobb, mint 1.0, akkor növeljük a counter-t,
                    // és kiírjuk az aktuális indexet (1-től kezdve) az out.txt fájlba.
                    if (in1[i] + in2[i] > 1.0)
                    {
                        counter++;                                  // Növeljük a sikeres kísérletek számát
                        g.WriteLine(i + 1);                         // Kiírjuk a 1-alapú indexet az output fájlba.
                    }
                }
            }

            // A program a következő üzeneteket írja ki a konzolra:
            WriteLine("-> out.txt létrehozva");                     // Tájékoztatás a fájl létrejöttéről
            WriteLine($"-> sikeres kísérletek száma: {counter}");   // A sikeres kísérletek számának kiírása
        }
    }
}
