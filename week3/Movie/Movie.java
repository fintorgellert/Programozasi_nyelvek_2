class Movie
{
    /* 
        Privát változók a film címének, évének és pontszámának tárolására.
        Ezek az adatok nem közvetlenül érhetők el kívülről, csak getterek/setterek segítségével.
    */
    private String title;   // A film címe
    private int year;       // A film kiadásának éve
    private double score;   // A film pontszáma (0.0 és 10.0 között)

    /* 
        Statikus változó, amely minden példány között megosztott. 
        Ez tárolja a létrehozott filmek számát, és minden egyes új film példány létrehozásakor növeljük.
    */
    public static int movieCount = 0;

    /* 
        Konstruktor, amely inicializálja a film címét, évét és pontszámát.
        A konstruktor egy speciális metódus, amely az objektum létrehozásakor fut le,
        és beállítja az objektum kezdő állapotát.
     */
    public Movie(String title, int year, double score)
    {
        // Az osztály privát adattagjait inicializáljuk a kapott paraméterekkel.
        this.title = title;  
        this.year = year;
        
        /* 
            A pontszámot érvényesítéssel állítjuk be a setScore() metódus segítségével.
            Ez gondoskodik arról, hogy a score érték mindig 0.0 és 10.0 között legyen.
        */
        this.setScore(score);

        // Minden új Movie objektum létrehozásakor növeljük a filmek számát.
        Movie.movieCount++;
    }

    // Getter metódus a film címének lekérdezésére.
    // A getterek olyan metódusok, amelyek hozzáférést biztosítanak a privát változókhoz kívülről.
    public String getTitle() {
        return this.title; // A cím visszaadása
    }

    // Getter metódus a film évének lekérdezésére.
    public int getYear() {
        return this.year; // Az év visszaadása
    }

    // Getter metódus a film pontszámának lekérdezésére.
    public double getScore() {
        return this.score; // A pontszám visszaadása
    }

    // Setter metódus a film címének beállítására.
    // A setterek lehetőséget adnak a privát változók módosítására.
    public void setTitle(String title) {
        this.title = title; // Az új cím beállítása
    }

    // Setter metódus a film évének beállítására.
    public void setYear(int year) {
        this.year = year; // Az új év beállítása
    }

    public void setScore(double newScore) {
        /* 
            A setScore metódus a film pontszámának beállítására szolgál.
            Célja, hogy biztosítsa, hogy a pontszám csak 0.0 és 10.0 közötti értéket vegyen fel.
        */
    
        // Az új pontszámot beállítjuk a privát score változóra.
        this.score = newScore;
    
        // Ha az új pontszám kisebb, mint 0.0, akkor a pontszámot 0.0-ra állítjuk.
        if (newScore < 0.0) {
            this.score = 0.0;           // A pontszám minimum értéke 0.0
        }
        
        // Ha az új pontszám nagyobb, mint 10.0, akkor a pontszámot 10.0-ra állítjuk.
        if (newScore > 10.0) {
            this.score = 10.0;          // A pontszám maximum értéke 10.0
        }
    }

    /* 
        A toString() metódus egy objektum szöveges reprezentációját adja vissza.
        Ez a metódus felülírja az alapértelmezett toString() metódust, amely minden objektumhoz tartozik.
        Hasznos, ha az objektumot ki szeretnénk írni vagy szövegként megjeleníteni.
    */
    @Override
    public String toString()
    {
        // Visszaadjuk a film címét, évét és pontszámát egy szöveges formában.
        return title + ", " + year + ", " + score;
    }
}
