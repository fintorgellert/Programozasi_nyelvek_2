package Programozasi_nyelvek_2.week04.MethodOverloadExample;
// A Main osztály, amely a program belépési pontját jelenti
public class Main
{
    public static void main(String[] args)
    {
        Adder p = new Adder();                      // Létrehozunk egy Proba példányt

        // Az int típusú add metódus hívása
        System.out.println(p.add(5, 8));        // 5 és 8 összege: 13
        System.out.println("-------");

        // A double típusú add metódus hívása
        System.out.println(p.add(5.74, 9.75));  // 5.74 és 9.75 összege: 15.49
    }
}

/*
    Mit jelent a metódus túlterhelés?
    A metódus túlterhelés (method overloading) azt jelenti, hogy ugyanannak a metódusnak több verziója létezik ugyanabban az osztályban, 
    de ezek különböznek egymástól a paraméterek számában, típusában vagy sorrendjében. A Java lehetővé teszi a metódusok túlterhelését, 
    ami azt jelenti, hogy azonos névvel rendelkező metódusokat hozhatunk létre, amelyek különböző paramétereket fogadnak el.

    Hogyan működik?
    A fenti példában a Adder osztályban két add metódus van definiálva:
    - Az első metódus (add(int a, int b)) két int típusú számot fogad el, és visszaadja azok összegét.
    - A második metódus (add(double a, double b)) két double típusú számot fogad el, és visszaadja azok összegét.

    Amikor a main metódusban az add metódust hívjuk, a Java automatikusan észleli, hogy melyik verziót kell használni az argumentumok típusa alapján. 
    Ha int típusú argumentumokat adunk meg, az első metódust hívja meg, ha pedig double típusúakat, a második metódust.

    Előnyök:
    1. Kód tisztasága: A metódusok túlterhelésével a kód olvashatóbbá válik, mivel az azonos nevű metódusok logikailag kapcsolódnak, 
                       és az olvasók számára egyértelműbb, hogy az adott metódus milyen célt szolgál.
    
    2. Rugalmasság: A metódus túlterhelés lehetővé teszi, hogy ugyanazt a logikát több különböző típusra alkalmazzuk, 
                    így a programunk sokkal rugalmasabb és könnyebben karbantartható.

    3. Könnyebb használhatóság: A felhasználók számára egyszerűbb, ha ugyanazzal a metódusnévvel többféle funkcionalitást érhetnek el, 
                                mint ha különböző nevekkel kellene hivatkozniuk rájuk.

    Hátrányok:
    1. Zűrzavar: A túl sok túlterhelt metódus zűrzavart okozhat, különösen, ha a paraméterek csak kismértékben különböznek egymástól. 
                 Ez megnehezíti a megfelelő metódus kiválasztását, és a hibákhoz vezethet.

    2. Teljesítmény: Míg a metódus túlterhelés általában nem okoz jelentős teljesítménybeli problémákat, 
                     a fordítás során a fordító feladata, hogy meghatározza, melyik metódust kell használni, ami némi overheadet okozhat.

    3. Komplexitás: A túlterhelés növelheti a kód komplexitását, különösen, ha a metódusok között nehezen követhető logikai kapcsolatok vannak, 
                    vagy ha az eltérő verziók különböző funkciókat látnak el.

    Fontos Szabályok:
    1. Paraméterek típusa: A metódusoknak eltérő paramétertípusokat kell használniuk a túlterheléshez.
    2. Paraméterek száma: A paraméterek számának eltérése szintén indokolja a metódus túlterhelését.
    3. Visszatérési típus: A metódus visszatérési típusa nem számít a túlterhelésnél, vagyis ha a metódusok azonos nevűek és azonos 
                           paraméterlistájuk van, de eltérő a visszatérési típusuk, az nem elegendő a túlterheléshez.

    Ez a megközelítés segít abban, hogy hatékonyan használhassuk a metódusokat a programozás során, 
    és kihasználhassuk a Java adta lehetőségeket.
*/
