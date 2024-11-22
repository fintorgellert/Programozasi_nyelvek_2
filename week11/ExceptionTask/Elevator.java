import java.util.Random;

public class Elevator implements Moveable {
 
    private int floorCount;
    private int currentFloor;
 
    /**
     * Konstruktor, amely beállítja az emeletek számát és az aktuális emeletet egy véletlenszerű értékre.
     * 
     * @param floorCount Az épület emeleteinek száma.
     */
    public Elevator(int floorCount) {
        this.floorCount = floorCount;

        // Véletlenszerű aktuális emeletet állítunk be az emeletek számának megfelelően.
        Random rnd = new Random();
        this.currentFloor = rnd.nextInt(floorCount) + 1;
    }
 
    /**
     * Getter az emeletek számához.
     * 
     * @return Az épület emeleteinek száma.
     */
    public int getFloorCount() {
        return floorCount;
    }

    /**
     * Getter az aktuális emelethez.
     * 
     * @return A lift jelenlegi emelete.
     */
    public int getCurrentFloor() {
        return currentFloor;
    }
 
    /**
     * A lift felfelé mozgatása.
     * 
     * @throws InvalidDirectionException Ha a lift a legfelső emeleten van, és nem tud tovább menni felfelé.
     * @throws Exception Ha a lift meghibásodik.
     */
    @Override
    public void moveUp() throws InvalidDirectionException, Exception {
        Random rnd = new Random();
        int breakdownChance = 99;   // Meghatározza, hogy milyen valószínűséggel romlik el a lift.
        int randomValue = rnd.nextInt(100);

        // Ha a generált szám megegyezik a meghibásodás esélyével, a lift meghibásodik.
        if (randomValue == breakdownChance) {
            throw new Exception("The elevator has broken down.");
        }

        // Ellenőrizzük, hogy van-e még emelet felfelé.
        if (this.currentFloor < this.floorCount) {
            this.currentFloor++;        // Felfelé mozgás
        } else {
            // Ha a lift elérte a legfelső emeletet, InvalidDirectionException dobunk.
            throw new InvalidDirectionException(this.floorCount, "Invalid direction upwards.");
        }
    }

    /**
     * A lift lefelé mozgatása.
     * 
     * @throws InvalidDirectionException Ha a lift az alsó emeleten van, és nem tud tovább menni lefelé.
     * @throws Exception Ha a lift meghibásodik.
     */
    @Override
    public void moveDown() throws InvalidDirectionException, Exception {
        Random rnd = new Random();
        int breakdownChance = 99;   // Meghatározza, hogy milyen valószínűséggel romlik el a lift.
        int randomValue = rnd.nextInt(100);

        // Ha a generált szám megegyezik a meghibásodás esélyével, a lift meghibásodik.
        if (randomValue == breakdownChance) {
            throw new Exception("The elevator has broken down.");
        }

        // Ellenőrizzük, hogy van-e még emelet lefelé.
        if (this.currentFloor > 1) {
            this.currentFloor--;        // Lefelé mozgás
        } else {
            // Ha a lift elérte az alsó emeletet, InvalidDirectionException dobunk.
            throw new InvalidDirectionException(this.floorCount, "Invalid direction downwards.");
        }
    }
 
    /**
     * 
     * A lift állapotát kiíró metódus.
     * @return A lift aktuális állapotát tartalmazó szöveg.
     */
    @Override
    public String toString() {
        return "Elevator{" + "floorCount=" + floorCount + ", currentFloor=" + currentFloor + '}';
    }
 
}
 
/**
 * Ez az osztály egy lift szimulációját valósítja meg, amely különböző irányokba mozoghat.
 * A lift osztály a következő elemeket tartalmazza:
 * 
 * 1. **Adattagok:**
 *    - `floorCount`: Az épület emeleteinek száma.
 *    - `currentFloor`: A lift aktuális emeletét tárolja.
 * 
 * 2. **Konstruktor:**
 *    - Véletlenszerűen kiválasztja az indulási emeletet az emeletek számán belül.
 * 
 * 3. **Metódusok:**
 *    - `moveUp`: A liftet egy emeletet felfelé mozgatja, amennyiben ez lehetséges.
 *      Hibát dob, ha a lift meghibásodik, vagy már a legfelső emeleten van.
 *    - `moveDown`: A liftet egy emeletet lefelé mozgatja, amennyiben ez lehetséges.
 *      Hibát dob, ha a lift meghibásodik, vagy már az alsó emeleten van.
 * 
 * 4. **Kivételkezelés:**
 *    - A program hibákat kezel, például meghibásodott liftet vagy érvénytelen irányt (InvalidDirectionException).
 * 
 * Ez a program jó példa arra, hogyan lehet kivételkezelést és objektumorientált programozást alkalmazni egy valós alkalmazási területen.
 */
 