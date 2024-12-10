using System;
using System.Collections.Generic;

namespace CustomClassExample
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
             * Az alábbi példa bemutatja egy Movie osztály részletes felépítését.
             * Az osztály reprezentálja a filmek alapvető tulajdonságait, és különböző funkciókat valósít meg.
             */

            // Példa egy Movie objektum létrehozására az alap konstruktorral
            Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010);
            Console.WriteLine(movie1.GetDescription());

            // Példa egy Movie objektum létrehozására a bővített konstruktorral
            Movie movie2 = new Movie("The Dark Knight", "Christopher Nolan", 2008, "Action, Crime, Drama");
            Console.WriteLine(movie2.GetDescription());

            // Tulajdonságok elérése
            Console.WriteLine($"Title: {movie2.Title}, Director: {movie2.Director}, Genre: {movie2.Genre}");

            // Példa az ToString metódus használatára
            Console.WriteLine("\nUsing ToString method:");
            Console.WriteLine(movie1);

            // Lista létrehozása Movie objektumokkal
            List<Movie> movies = new List<Movie>
            {
                movie1,
                movie2,
                new Movie("Interstellar", "Christopher Nolan", 2014, "Sci-Fi, Adventure"),
                new Movie("Memento", "Christopher Nolan", 2000, "Thriller")
            };

            // Filmek rendezése év szerint
            movies.Sort();
            Console.WriteLine("\nMovies sorted by year:");
            foreach (var movie in movies)
            {
                Console.WriteLine(movie);
            }
        }
    }

    /*
     * A Movie osztály reprezentálja a filmeket.
     * Ez az osztály bemutatja a getterek és setterek, különböző konstruktorok,
     * metódusok és rendezési képességek használatát.
     */
    class Movie : IComparable<Movie>
    {
        // Tulajdonságok
        public string Title { get; private set; } // Csak olvasható kívülről, belülről módosítható
        public string Director { get; private set; }
        public int Year { get; private set; }
        public string Genre { get; private set; } = "Unknown"; // Alapértelmezett érték

        /*
         * Alap konstruktor, amely minimális adatot vár el.
         * Az alapértelmezett Genre értéke "Unknown".
         */
        public Movie(string title, string director, int year)
        {
            Title = title;
            Director = director;
            Year = year;
        }

        /*
         * Túlterhelt konstruktor, amely a Genre (műfaj) értékét is megadja.
         */
        public Movie(string title, string director, int year, string genre) : this(title, director, year)
        {
            Genre = genre;
        }

        /*
         * Getterek és setterek példája. 
         * Bár a tulajdonságok read-only kívülről, belső metódusok módosíthatják őket.
         */
        public void UpdateGenre(string newGenre)
        {
            /*
             * Ez a metódus lehetővé teszi, hogy a műfajt belsőleg módosítsuk.
             * Hasznos, ha az osztály tulajdonságait csak ellenőrzött módon szeretnénk változtatni.
             */
            Genre = newGenre;
        }

        /*
         * ToString metódus felülírása, hogy egy film objektum szöveges reprezentációját adjuk vissza.
         */
        public override string ToString()
        {
            return $"{Title} ({Year}) - Directed by {Director}, Genre: {Genre}";
        }

        /*
         * GetDescription metódus egy formázott szöveget ad vissza a filmről.
         */
        public string GetDescription()
        {
            return $"{Title}, directed by {Director}, released in {Year}. Genre: {Genre}";
        }

        /*
         * IComparable interfész implementálása a Movie osztályhoz.
         * Ez lehetővé teszi a rendezést év szerint (növekvő sorrendben).
         */
        public int CompareTo(Movie other)
        {
            if (other == null) return 1; // Null értékek mindig a lista végére kerülnek
            return Year.CompareTo(other.Year);
        }

        /*
         * Különböző ellenőrzések vagy műveletek megvalósítására használható metódusok példája.
         */
        public bool IsClassic()
        {
            /*
             * Egy film klasszikusnak tekinthető, ha 20 évnél régebben készült.
             */
            return DateTime.Now.Year - Year > 20;
        }
    }
}

/*
 * Tulajdonságok (Properties): A Title, Director, Year és Genre tulajdonságok használata lehetővé teszi az adatok szabályozott elérését és módosítását. 
                               A Genre alapértelmezett értéket is kap.
 * Konstruktorok (Constructors): Az alapértelmezett és a bővített konstruktorok rugalmasságot biztosítanak az osztály példányosításához.
 * Getterek és Setterek: A tulajdonságok értékét privát módon tudjuk módosítani, a publikus metódusok pedig ellenőrzött hozzáférést biztosítanak.
 * Metódusok:
 *  - ToString biztosítja az objektum szöveges reprezentációját.
 *  - GetDescription egy formázott leírást ad vissza.
 *  - IsClassic egy logikai ellenőrzést végez.
 * Rendezés (Sorting): Az IComparable interfész implementálása lehetővé teszi az objektumok rendezését év szerint.
 */