using System;
using System.Collections.Generic;
using System.Linq;

namespace SolveTask1
{
    class Kutyavasar
    {
        static void Main(string[] args)
        {
            /*
             * Ebben a programban a felhasználó egy szöveg formátumú bemenetet ad meg,
             * ahol minden sor egy évszámot és az ahhoz kapcsolódó városokat tartalmazza, kettősponttal elválasztva.
             * A cél az, hogy a városokhoz tartozó évszámokat tároljuk, majd a városokat
             * és évszámaikat rendezetten jelenítsük meg.
             */

            // Szótár (Dictionary) létrehozása, amelyben minden város neve egy kulcs,
            // és az évszámokat tartalmazó lista az érték.
            Dictionary<string, List<int>> varosok = new Dictionary<string, List<int>>();

            // Sorok feldolgozása a bemenetről.
            string line;
            while (!string.IsNullOrEmpty(line = Console.ReadLine()))    // Addig olvasunk, amíg nem üres a bemenet
            {
                /*
                 * Minden sor két részre van osztva: évszám és városok.
                 * Az évszámot és a városokat kettőspont választja el.
                 */
                string[] parts = line.Split(':');
                int evszam = int.Parse(parts[0]);                       // Az első rész az évszám
                string[] varosNevek = parts[1].Split(',');              // A második rész a városok vesszővel elválasztva

                /*
                 * Most feldolgozzuk az adott sorban lévő városokat,
                 * és hozzáadjuk azokat a szótárhoz, az évszámmal együtt.
                 */
                foreach (string varos in varosNevek)
                {
                    // Ha a város még nem szerepel a szótárban, inicializáljuk egy üres listával
                    if (!varosok.ContainsKey(varos))
                    {
                        varosok[varos] = new List<int>();
                    }
                    // Az adott városhoz hozzáadjuk az évszámot
                    varosok[varos].Add(evszam);
                }
            }

            /*
             * A szótár tartalmát rendezzük a városnevek (kulcsok) alapján lexikografikus sorrendben.
             * Az OrderBy LINQ metódus segítségével a kulcsok (városnevek) szerint növekvő sorrendet állítunk elő.
             */
            var rendezettVarosok = varosok.OrderBy(v => v.Key);

            /*
             * A rendezett városok és évszámok kimenete.
             * Először a városokhoz tartozó évszámokat is rendezzük növekvő sorrendben,
             * majd a városokat a megfelelő formátumban írjuk ki.
             */
            foreach (var varos in rendezettVarosok)
            {
                // Évek rendezése növekvő sorrendben
                varos.Value.Sort();

                /*
                 * A kimeneti formátum: Városnév:év1,év2,év3...
                 * A string.Join metódust használjuk az évszámok összefűzésére, vesszővel elválasztva.
                 */
                Console.WriteLine($"{varos.Key}:{string.Join(",", varos.Value)}");
            }
        }
    }
}
