package Programozasi_nyelvek_2.week09.Random;
public class Main {
    public static void main(String[] args) {
        // 1. Alapvető példák
        System.out.println("Alapvető példák:");
        System.out.println(Math.random());               // [0.0, 1.0)
        System.out.println(Math.random() * 100);         // [0.0, 100.0)
        System.out.println((int) (Math.random() * 100)); // [0, 100)

        // 2. Véletlenszám egy adott tartományban (példa: [50, 150))
        int min = 50;
        int max = 150;
        int randomInRange = (int) (Math.random() * (max - min)) + min;
        System.out.println("\nVéletlenszám tartományban [50, 150):");
        System.out.println(randomInRange);

        // 3. Dobókocka szimuláció (1-6 közötti véletlenszám)
        int diceRoll = (int) (Math.random() * 6) + 1;
        System.out.println("\nDobókocka szimuláció (1-6):");
        System.out.println(diceRoll);

        // 4. Véletlenszám generálása negatív tartományban (példa: [-50, 50))
        min = -50;
        max = 50;
        randomInRange = (int) (Math.random() * (max - min)) + min;
        System.out.println("\nVéletlenszám tartományban [-50, 50):");
        System.out.println(randomInRange);

        // 5. Tíz véletlenszám generálása egy adott tartományban (példa: [10, 20))
        System.out.println("\nTíz véletlenszám [10, 20):");
        min = 10;
        max = 20;
        for (int i = 0; i < 10; i++) {
            int randomNum = (int) (Math.random() * (max - min)) + min;
            System.out.print(randomNum + " ");
        }
        System.out.println();

        // 6. Véletlenszám generálása lebegőpontos érték formájában (pl.: [0.5, 1.5))
        double doubleMin = 0.5;
        double doubleMax = 1.5;
        double randomDouble = Math.random() * (doubleMax - doubleMin) + doubleMin;
        System.out.println("\nLebegőpontos véletlenszám tartományban [0.5, 1.5):");
        System.out.println(randomDouble);

        // 7. Véletlenszám kerekítése
        double randomRounded = Math.round(Math.random() * 100) / 10.0;
        System.out.println("\nKerekített véletlenszám (pl. egy tizedesjegyig):");
        System.out.println(randomRounded);
    }
}
