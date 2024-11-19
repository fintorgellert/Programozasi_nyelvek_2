package Programozasi_nyelvek_2.week09.Assert;
public class Main {
    public static void main(String[] args) {
        int x = 6;

        /**
         * Az `assert` kulcsszóval egy feltételt ellenőrzünk.
         * Ha a feltétel hamis, akkor futás közben kivételt dob, ellenkező esetben a program folytatódik.
         * Az alábbi példa ellenőrzi, hogy `x` osztható-e 2-vel, tehát páros szám-e.
         * Mivel `x` értéke 6, ami páros, a feltétel igaz lesz, így nem történik hiba.
         */
        assert x % 2 == 0;

        x = 7;

        /**
         * Itt új értéket adunk az `x` változónak: 7.
         * Az `assert` most azt ellenőrzi, hogy a 7 osztható-e 2-vel.
         * Mivel a 7 nem páros, a feltétel hamis lesz, és az `assert` hibát dob.
         * Az assert hibaüzenetként a kettőspont (`:`) után megadott szöveget is kiírja:
         * "páros szám kell".
         */
        assert x % 2 == 0 : "páros szám kell";
    }
}
