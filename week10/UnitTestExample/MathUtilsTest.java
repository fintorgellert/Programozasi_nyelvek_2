public class MathUtilsTest {
    /**
     * A fő metódus, amely elindítja a teszteket.
     * Itt meghívjuk az összes teszt metódust, hogy ellenőrizzük a MathUtils osztály metódusait.
     */
    public static void main(String[] args) {
        // Teszteljük az add() metódust
        testAdd();

        // Teszteljük a subtract() metódust
        testSubtract();

        // Teszteljük a multiply() metódust
        testMultiply();

        // Teszteljük a divide() metódust
        testDivide();
    }

    /**
     * Az add() metódus tesztelése.
     * Ellenőrizzük, hogy a MathUtils.add() metódus helyes összeadást végez-e.
     * Három különböző tesztesetet futtatunk, különböző számokkal.
     */
    public static void testAdd() {
        // A teszt során ellenőrizzük az összeadás helyességét
        System.out.println("add() metódus tesztelése:");

        /** 
         * Az első teszt: 10 + 5 = 15
         * Az assert az elvárt eredmény és a tényleges eredmény összehasonlítását végzi el.
         * Ha az eredmények nem egyeznek meg, akkor a program hibát dob.
         */
        assert MathUtils.add(10, 5) ==  15  : "Hiba: 10 + 5 nem 15";

        /** 
         * A második teszt: 5 + (-5) = 0
         * Itt egy pozitív és egy negatív szám összeadását teszteljük.
         * Az eredmény várt értéke: 0.
         */
        assert MathUtils.add(5, -5)   ==   0  : "Hiba: 5 + (-5) nem 0";

        /** 
         * A harmadik teszt: -5 + (-5) = -10
         * Itt két negatív számot adunk össze, ami egy negatív eredményt ad vissza.
         */
        assert MathUtils.add(-5, -5)    ==  -10 : "Hiba: -5 + (-5) nem -10";

        // Ha az összes teszt sikeresen lefutott, kiírjuk, hogy a teszt sikeres volt
        System.out.println("add() teszt sikeres!\n");
    }

    /**
     * A subtract() metódus tesztelése.
     * Ellenőrizzük, hogy a MathUtils.subtract() metódus helyesen végzi-e el a kivonást.
     */
    public static void testSubtract() {
        // A teszt során ellenőrizzük a kivonás helyességét
        System.out.println("subtract() metódus tesztelése:");

        /** 
         * Az első teszt: 10 - 5 = 5
         * Itt két pozitív szám különbségét vonjuk le. Az eredmény 5.
         */
        assert MathUtils.subtract(10, 5)  ==   5 : "Hiba: 10 - 5 nem 5";

        /** 
         * A második teszt: 5 - (-5) = 10
         * Itt egy pozitív számot vonunk ki egy negatív számból. A kivonás egyenértéke: 5 + 5 = 10.
         */
        assert MathUtils.subtract(5, -5)    ==  10 : "Hiba: 5 - (-5) nem 10";

        /** 
         * A harmadik teszt: -5 - (-5) = 0
         * Két negatív szám különbségét vonjuk ki, az eredmény 0 kell hogy legyen, mivel azonos számokat vonunk ki.
         */
        assert MathUtils.subtract(-5, -5)     ==   0 : "Hiba: -5 - (-5) nem 0";

        // Ha az összes teszt sikeresen lefutott, kiírjuk, hogy a teszt sikeres volt
        System.out.println("subtract() teszt sikeres!\n");
    }

    /**
     * A multiply() metódus tesztelése.
     * Itt azt ellenőrizzük, hogy a MathUtils.multiply() metódus helyesen végzi-e el a szorzást.
     */
    public static void testMultiply() {
        // A teszt során ellenőrizzük a szorzás helyességét
        System.out.println("multiply() metódus tesztelése:");

        /** 
         * Az első teszt: 10 * 5 = 50
         * Két pozitív szám szorzása, az eredmény 50 kell, hogy legyen.
         */
        assert MathUtils.multiply(10, 5) ==   50 : "Hiba: 10 * 5 nem 50";

        /** 
         * A második teszt: 5 * (-5) = -25
         * Itt egy pozitív számot szorzunk egy negatív számmal, az eredmény negatív lesz (-25).
         */
        assert MathUtils.multiply(5, -5)   ==  -25 : "Hiba: 5 * (-5) nem -25";

        /** 
         * A harmadik teszt: -5 * (-5) = 25
         * Két negatív szám szorzásánál az eredmény pozitív szám (25), mivel két negatív szám szorzata mindig pozitív.
         */
        assert MathUtils.multiply(-5, -5)    ==   25 : "Hiba: -5 * (-5) nem 25";

        // Ha az összes teszt sikeresen lefutott, kiírjuk, hogy a teszt sikeres volt
        System.out.println("multiply() teszt sikeres!\n");
    }

    /**
     * A divide() metódus tesztelése.
     * Itt azt ellenőrizzük, hogy a MathUtils.divide() metódus helyesen végzi-e el az osztást.
     * Külön tesztelni fogjuk a nullával való osztást is.
     */
    public static void testDivide() {
        // A teszt során ellenőrizzük az osztás helyességét
        System.out.println("divide() metódus tesztelése:");

        try {
            /** 
             * Az első teszt: 10 / 5 = 2
             * Két pozitív szám osztása, eredmény 2.
             */
            assert MathUtils.divide(10, 5) ==   2 : "Hiba: 10 / 5 nem 2";

            /** 
             * A második teszt: 5 / (-5) = -1
             * Itt egy pozitív számot osztunk egy negatív számra, az eredmény -1.
             */
            assert MathUtils.divide(5, -5)   ==  -1 : "Hiba: 5 / (-5) nem -1";

            /** 
             * A harmadik teszt: -5 / (-5) = 1
             * Két negatív szám osztásánál az eredmény pozitív szám lesz (1).
             */
            assert MathUtils.divide(-5, -5)    ==   1 : "Hiba: -5 / (-5) nem 1";

            // Ha az osztás sikeres, kiírjuk, hogy a teszt sikeres volt
            System.out.println("divide() teszt sikeres!\n");

        } catch (ArithmeticException e) {
            // Ha bármilyen kivétel történik, azt itt kezeljük és kiírjuk a hibát
            System.out.println(e.getMessage());
        }

        // Teszteljük a nullával való osztást
        try {
            /** 
             * Az osztás nullával való próbálkozása kivételt kell, hogy dobjon,
             * mivel a nullával való osztás nem lehetséges.
             */
            MathUtils.divide(10, 0);
            System.out.println("Hiba: A nullával való osztás nem dobott kivételt!");
        } catch (ArithmeticException e) {
            // A nullával való osztás várt hibaüzenete
            System.out.println("Várt hiba: " + e.getMessage());
        }
    }
}
