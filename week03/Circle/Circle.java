package Programozasi_nyelvek_2.week03.Circle;
public class Circle
{
    /* 
        Az r változó a kör sugara, amely privát, így csak az osztályon belül érhető el.
        Az osztály többi részében getter és egyéb metódusok biztosítják az adathoz való hozzáférést és manipulációt.
        A privát láthatóság azt jelenti, hogy a r változó kívülről nem érhető el közvetlenül, ezzel biztosítjuk az adatok védelmét.
     */
    private double r;

    // Konstruktor, amely inicializálja a kör sugarát a megadott paraméterrel (someR).
    public Circle(double someR)
    {
        // A "this" kulcsszó az aktuális objektumot jelöli, és itt a példányváltozó r-t állítjuk be.
        this.r = someR;
    }

    // A perimeter() metódus kiszámítja a kör kerületét: 2 * r * PI.
    public double perimeter()
    {
        return 2 * this.r * Math.PI;
    }

    // Az area() metódus kiszámítja a kör területét: r^2 * PI.
    public double area()
    {
        return this.r * this.r * Math.PI;
    }

    // Az isSmallerThan() metódus összehasonlítja két kör sugarát, és visszaadja, hogy az aktuális kör kisebb-e, mint a megadott kör (other).
    public boolean isSmallerThan(Circle other)
    {
        return this.r < other.r;
    }

    // A getR() metódus visszaadja a kör sugarát (getter metódus).
    /*
        Getter metódus:
        A getter egy olyan metódus, amely visszaadja egy privát változó értékét.
        Ebben az esetben a getR() metódus visszaadja a privát r változó értékét,
        lehetővé téve az osztályon kívüli hozzáférést az r értékéhez anélkül, hogy közvetlenül manipulálnánk azt.
    */
    public double getR() {
        return this.r;
    }
    
    // A setR() metódus beállítja a kör sugarát (setter metódus).
    /*
        Setter metódus:
        A setter egy olyan metódus, amely lehetővé teszi egy privát változó módosítását.
        A setR() metódus segítségével kívülről megváltoztathatjuk a r értékét.
        A setter és getter metódusok használata jó gyakorlat, mert ezáltal szabályozhatjuk az adatbevitelt és adatlekérést.
    */
    public void setR(double r) {
        this.r = r;
    }

    // A toString() metódus az objektum sztring reprezentációját adja vissza. Jelen esetben csak a sugár értékét adja meg.
    /*
        toString() metódus:
        A toString() metódus az objektum szöveges reprezentációját adja vissza, amit például akkor használunk,
        amikor ki szeretnénk írni egy objektumot a konzolra. Az @Override annotáció azt jelenti, hogy
        felülírjuk az Object osztály alapértelmezett toString() metódusát, amely minden Java osztálynak alapesetben része.
    */
    @Override
    public String toString()
    {
        return "" + r;
    }
}
