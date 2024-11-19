public class Main {
    public static void main(String[] args) {
        // A MathUtils osztály statikus metódusainak bemutatása.

        int a = 10;
        int b = 5;

        // Két szám összegének kiszámítása
        System.out.println("Összeg: " + MathUtils.add(a, b));

        // Két szám különbségének kiszámítása
        System.out.println("Különbség: " + MathUtils.subtract(a, b));

        // Két szám szorzatának kiszámítása
        System.out.println("Szorzat: " + MathUtils.multiply(a, b));

        // Két szám hányadosának kiszámítása
        try {
            System.out.println("Hányados: " + MathUtils.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
