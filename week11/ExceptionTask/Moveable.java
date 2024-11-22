/**
 * This interface defines a contract for movable objects.
 * Objects implementing this interface should define how they move up and down.
 */
public interface Moveable {

    /**
     * A metódus, amely a felfelé mozgást valósítja meg.
     *
     * @throws InvalidDirectionException Ha a mozgás iránya érvénytelen (pl. már a legfelső szinten van).
     * @throws Exception Ha valamilyen más hiba történik, például egy meghibásodás.
     */
    void moveUp() throws InvalidDirectionException, Exception;

    /**
     * A metódus, amely a lefelé mozgást valósítja meg.
     *
     * @throws InvalidDirectionException Ha a mozgás iránya érvénytelen (pl. már az alsó szinten van).
     * @throws Exception Ha valamilyen más hiba történik, például egy meghibásodás.
     */
    void moveDown() throws InvalidDirectionException, Exception;
}

/**
 * Ez az interfész a mozgás (felfelé és lefelé) általános logikáját határozza meg.
 * Az interfész segítségével biztosíthatjuk, hogy minden osztály, amely implementálja,
 * rendelkezzen a `moveUp` és `moveDown` metódusokkal.
 * 
 * 1. **Miért hasznos az interfész?**
 *    - Lehetővé teszi az egységes viselkedést az implementáló osztályok között.
 *    - Az interfész a tervezés során segít elválasztani a metódusokat az implementációktól,
 *      így az implementáló osztályok szabadon valósíthatják meg a konkrét logikát.
 * 
 * 2. **Hogyan használjuk?**
 *    - Bármilyen osztály, amely szeretne felfelé és lefelé mozogni, implementálja ezt az interfészt.
 *    - Az osztály felelőssége, hogy a `moveUp` és `moveDown` logikáját definiálja.
 * 
 * 3. **Kivételkezelés:**
 *    - Az interfész deklarálja, hogy a két metódus milyen kivételeket dobhat:
 *      - `InvalidDirectionException`: Ha az irány érvénytelen, például a határértékeket túllépve próbálunk mozogni.
 *      - `Exception`: Ha általános meghibásodás történik, például egy véletlenszerű hiba miatt.
 * 
 * Ez a design jól használható szimulációs vagy valós idejű rendszerekben, ahol a mozgás
 * irányítása és a hibafigyelés kritikus fontosságú.
 */
