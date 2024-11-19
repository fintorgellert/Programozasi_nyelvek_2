import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Random osztály példányosítása
        Random random = new Random();

        /** 
         *  Példák a Random osztály alapvető használatára.
         *  - random.nextInt(): Véletlen egész szám generálása.
         *    Ezzel a metódussal bármilyen véletlen egész számot generálhatunk.
         *  - random.nextDouble(): Véletlen szám generálása a [0.0, 1.0) tartományban.
         *    Ez a metódus egy 0 és 1 közötti lebegőpontos számot ad vissza.
         *  - random.nextBoolean(): Véletlenszerű logikai érték (true/false) generálása.
         *    Ez segít, ha valamilyen feltételt véletlenszerűen akarunk igaz/hamis értékekkel kiválasztani.
         */

        // Véletlen egész szám generálása
        System.out.println("Véletlenszerű egész szám (bármilyen érték): " + random.nextInt());
        
        // Véletlen lebegőpontos szám generálása a [0.0, 1.0) tartományban
        System.out.println("Véletlenszerű lebegőpontos szám [0.0, 1.0): " + random.nextDouble());
        
        // Véletlen logikai érték generálása (true vagy false)
        System.out.println("Véletlenszerű logikai érték: " + random.nextBoolean());

        // A RandUtils osztály metódusainak bemutatása
        // Véletlenszerű egész szám generálása [10, 50] tartományban
        int randomIntInRange = RandUtils.randint(10, 50);
        System.out.println("Véletlenszerű egész szám [10, 50]: " + randomIntInRange);

        // Véletlenszerű szám generálása [5, 20] intervallumban 3-as lépésközzel
        int randomIntStep = RandUtils.randrange(5, 20, 3);
        System.out.println("Véletlenszerű szám [5, 20] intervallumban 3-as lépésközzel: " + randomIntStep);

        // Véletlenszerű elem kiválasztása egy listából
        String randomChoice = RandUtils.choice(List.of("alma", "körte", "szilva", "barack"));
        System.out.println("Véletlenszerű választás egy listából: " + randomChoice);
    }
}
