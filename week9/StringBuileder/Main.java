public class Main {
    public static void main(String[] args) {
        // StringBuilder használata szöveg összeállításához
        StringBuilder sb = new StringBuilder();

        /* 
         * A StringBuilder hatékonyabb módot kínál a szövegek összeállítására,
         * mint a sztringek közvetlen konkatenálása (pl. `+` operátor).
         * Itt hozzáfűzzük a "Hello " és "World!" szövegeket az sb objektumhoz.
         */
        sb.append("Hello ");
        sb.append("World!");

        // Az összeállított StringBuilder objektumot sztringgé alakítjuk.
        String result = sb.toString();
        System.out.println(result);     // Eredmény: Hello World!

        // Egy sztring megfordítása StringBuilder segítségével
        String s = "Java 11";
        StringBuilder sb2 = new StringBuilder();

        /*
         * Az sb2 objektumhoz hozzáadjuk az eredeti sztringet,
         * majd a reverse() metódust használva megfordítjuk annak tartalmát.
         */
        sb2.append(s);
        sb2.reverse();

        // Az sb2-ben lévő tartalmat sztringgé alakítjuk és kiírjuk.
        String result2 = sb2.toString();
        System.out.println(result2);    // Eredmény: 11 avaJ

        /*
         * Az előző folyamat rövidített verziója.
         * Egy új StringBuilder objektumot hozunk létre az eredeti szöveggel,
         * azonnal meghívjuk a reverse() metódust, és a végeredményt kiírjuk.
         */
        System.out.println(new StringBuilder(s).reverse().toString());  // Eredmény: 11 avaJ
    }
}
