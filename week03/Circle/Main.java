package Programozasi_nyelvek_2.week03.Circle;
public class Main
{
    public static void main(String[] args)
    {
        // Létrehozunk egy új Circle példányt (c1) a megadott sugárral (5.1).
        Circle c1 = new Circle(5.1);

        // A toString() metódus hívódik meg, amikor egy Circle objektumot kiírunk.
        System.out.println(c1);
        
        // Kiírjuk a c1 kör kerületét és területét a perimeter() és area() metódusok segítségével.
        System.out.println("Circle perimeter: " + c1.perimeter());
        System.out.println("Circle area: " + c1.area());

        // Létrehozunk további két Circle példányt, c2-t és c3-at különböző sugarakkal.
        Circle c2 = new Circle(4.78);
        Circle c3 = new Circle(5.74);

        /* 
            Objektumok közötti összehasonlítás:
            Az if-else szerkezet segítségével ellenőrizzük, hogy c1 kisebb-e, mint c2 az isSmallerThan() metódus használatával.
            Itt nem használhatunk közvetlenül olyan operátorokat, mint a `<`, mert az objektumok, mint például a Circle osztály példányai, 
            nem hasonlíthatók össze primitív típusokhoz hasonlóan.

            Miért nem lehet használni a c1 < c2 kifejezést?

            - A < operátor csak primitív típusok (mint az int, double) összehasonlítására szolgál.
            - c1 és c2 Circle objektumok, és az objektumok összehasonlítását nem határozza meg alapértelmezetten a Java.
            - Ha megpróbálnánk a c1 < c2 kifejezést, a fordító hibát adna, mert nem tudná, hogyan hasonlítsa össze az objektumokat.
            
            Ezért hozunk létre egy külön metódust (isSmallerThan()), amely lehetővé teszi, hogy két kör sugarát összehasonlítsuk.
            Az isSmallerThan() metódus a két kör sugarát hasonlítja össze, és visszaadja, hogy az egyik kisebb-e a másiknál.
        */
        if (c1.isSmallerThan(c2))
            System.out.println("Smaller");
        else
            System.out.println("Not smaller");

        // Megjelenítjük a c1 kör sugarát a getter metódussal (getR()).
        System.out.println("Circle radius: " + c1.getR());

        // Megváltoztatjuk a c1 kör sugarát a setter metódussal (setR()).
        c1.setR(12.5);
        
        // Újra megjelenítjük a c1 kör sugarát a módosítás után a getter metódussal.
        System.out.println("Circle radius: " + c1.getR());
    }
}
