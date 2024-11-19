// A MathUtils osztály matematikai műveletek elvégzésére szolgáló statikus metódusokat tartalmaz.
public class MathUtils {
    /**
     * Privát konstruktor, hogy az osztály csak statikusan legyen használható,
     * tehát nem szükséges példányosítani.
     */
    private MathUtils() {
         // A konstruktor üres, mivel az osztály összes metódusa statikus.
    }

    /**
     * Két szám összegét adja vissza.
     * @param a Az első szám.
     * @param b A második szám.
     * @return Az a és b összegét.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Két szám különbségét adja vissza.
     * @param a Az első szám.
     * @param b A második szám.
     * @return Az a és b különbsége.
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Két szám szorzatát adja vissza.
     * @param a Az első szám.
     * @param b A második szám.
     * @return Az a és b szorzata.
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Két szám osztását végzi el.
     * @param a Az osztandó szám.
     * @param b Az osztó szám.
     * @return Az a és b hányadosa.
     * @throws ArithmeticException Ha b nulla.
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("A nullával való osztás nem lehetséges.");
        }
        return a / b;
    }
}
