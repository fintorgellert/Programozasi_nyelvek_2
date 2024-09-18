/* 
    Boolean példa Java nyelven

    Ez a program bemutatja a boolean típus használatát, illetve logikai kifejezéseket
    A program különböző boolean értékeket tárol változókban, majd ezeket kiírja a konzolra

    Fordítás és futtatás terminálban:
    1. Fordítás: javac BooleanExample.java
    2. Futtatás: java BooleanExample
*/

public class BooleanExample
{
    public static void main(String[] args) {
        // Különböző boolean értékek létrehozása
        
        boolean b1 = true;          // Logikai igaz érték
        boolean b2 = false;         // Logikai hamis érték
        boolean b3 = 2 < 3;         // Igaz lesz, mert 2 kisebb mint 3
        boolean b4 = 2 > 3;         // Hamis lesz, mert 2 nem nagyobb mint 3

        // A boolean értékek kiírása a konzolra
        System.out.println(b1);     // Igaz érték kiírása (true)
        System.out.println(b2);     // Hamis érték kiírása (false)
        System.out.println(b3);     // Igaz, mert 2 kisebb mint 3 (true)
        System.out.println(b4);     // Hamis, mert 2 nem nagyobb mint 3 (false)
    }
}
