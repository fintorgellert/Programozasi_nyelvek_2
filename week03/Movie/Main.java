package Programozasi_nyelvek_2.week03.Movie;
public class Main
{
    public static void main(String[] args)
    {
        // Kiírjuk a már létrehozott filmek számát a movieCount statikus változó segítségével.
        // Mivel még nem hoztunk létre filmet, ez 0-t fog mutatni.
        System.out.println(Movie.movieCount);

        // Létrehozunk egy új Movie példányt (m1) a megadott cím, év és pontszám paraméterekkel.
        Movie m1 = new Movie("The Terminator", 1984, 8.1);

        // Kiírjuk a m1 film szöveges reprezentációját (cím, év, pontszám).
        System.out.println(m1);

        // Létrehozunk egy másik Movie példányt (m2) különböző adatokkal.
        Movie m2 = new Movie("Star Wars V", 1980, 8.7);

        // Kiírjuk a m2 film szöveges reprezentációját.
        System.out.println(m2);

        // Kiírjuk a m2 film pontszámát a getScore() metódus segítségével.
        System.out.println(m2.getScore());
        
        // Beállítjuk a m2 film pontszámát 10.4-re, ami érvényesítés után 10.0-ra fog változni.
        m2.setScore(10.4);

        // Kiírjuk a m2 film szöveges reprezentációját, hogy lássuk a módosítást.
        System.out.println(m2);

        // Létrehozunk egy harmadik Movie példányt (m3) egy negatív pontszámmal (-2.0).
        // Ez a pontszám érvényesítés után 0.0-ra fog változni.
        Movie m3 = new Movie("Bloodshot", 2020, -2.0);

        // Kiírjuk a m3 film szöveges reprezentációját, hogy lássuk az érvényesítést.
        System.out.println(m3);

        // Kiírjuk a létrehozott filmek számát, ami most már 3 lesz (m1, m2, m3).
        System.out.println(Movie.movieCount);
        
        /* 
            Ha megpróbálnánk közvetlenül hozzáférni a title változóhoz, például:
            System.out.println(m1.title);   // Ez hibát okozna, mert a title változó privát.
            m1.title = "Star Wars II";      // Ez is hibát okozna, mert a title változó privát.

            A privát változók nem érhetők el közvetlenül az osztályon kívülről, 
            csak a megfelelő getter és setter metódusokon keresztül.

            Például a cím módosításához a setTitle() metódust kellene használnunk:
            m1.setTitle("Star Wars II");
            
            Ez érvényes, mert a setTitle() metódus engedélyezi a cím beállítását.
        */
    }
}
