package Programozasi_nyelvek_2.week04.ForeachExample;
public class Main
{
    public static void main(String[] args)
    {
        // Létrehozunk egy egész számokat tartalmazó tömböt (array)
        int[] array = { 1, 7, 3, 9, 6 };

        /*
            A foreach (vagy "enhanced for") ciklus használata a tömb elemeinek bejárására.
            A ciklus minden egyes iterációban az aktuális elemet a 'value' változóba helyezi.
            Ezután kiírjuk a 'value' változó értékét, ami a tömb minden egyes elemét reprezentálja.


            A foreach ciklus leegyszerűsíti a tömbök és kollekciók bejárását, 
            mert nem kell indexelni, mint a hagyományos for ciklusban. 
            A foreach ciklus felépítése:
            
            for (típus változó : kollekció_vagy_tömb) {
                // kód, ami végrehajtódik minden elemre
            }

            Itt a 'value' változó veszi fel az 'array' tömb összes elemét sorban, 
            és minden iteráció során a ciklusban végrehajtott kód az aktuális elemre vonatkozik.

            Ez nagyon hasznos, amikor az összes elemet módosítás nélkül akarjuk feldolgozni, 
            például kiíratni vagy valamilyen számítást végezni rajtuk.
        */
        for (int value : array) {
            System.out.println(value);   // Kiírjuk az array aktuális elemét (value).
        }
    }
}
