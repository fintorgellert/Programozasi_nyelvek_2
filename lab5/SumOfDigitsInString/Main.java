public class Main {
    
    // Metódus, amely kiszámítja a Stringben található számjegyek összegét
    static int sumOfDigits(String s) {
        // Az összeg tárolására szolgáló változó
        int sum = 0;
        
        // A String karaktereinek átalakítása egy karaktertömbbé, hogy egyenként dolgozhassunk velük
        char[] charArray = s.toCharArray();

        // For-each ciklus a karaktertömb összes elemén
        for (char c : charArray) {
            // Karakterek számjegyértékének megszerzése és hozzáadása az összeghez
            sum += Character.getNumericValue(c);
        }

        // Az összeg visszatérése a metódushívás helyére
        return sum;
    }

    public static void main(String[] args) {
        // Egy String bemenet inicializálása, amely számjegyeket tartalmaz
        String s = "90146852";

        // Meghívjuk a sumOfDigits metódust a Stringen, és az eredményt a sum változóban tároljuk
        int sum  = sumOfDigits(s);

        // Az összeg kiíratása a konzolra
        System.out.println(sum);  // Eredmény: 35, mert 9 + 0 + 1 + 4 + 6 + 8 + 5 + 2 = 35
    }
}
