package Programozasi_nyelvek_2.week05.StringToPrimitiveConverter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // String s változó, amely egy számot tartalmaz szövegként ("14")
        String s = "14";

        /* 
            Az Integer.parseInt(s) metódus használatával a Stringet int típusú számra konvertáljuk.
            A parseInt egy primitív int-et ad vissza, ezért nincs extra költség vagy unboxing.
        */
        int n = Integer.parseInt(s);

        /* 
            Az Integer.valueOf(s) használatával a Stringet Integer objektummá alakítjuk.
            Az Integer.valueOf() egy Integer objektumot ad vissza (autoboxing történik).
         */
        Integer n2 = Integer.valueOf(s);

        /* 
            Az Integer.valueOf(s) ismét használható itt, de mivel int változóhoz rendeljük,
            unboxing szükséges az Integer objektum kibontásához.
        */
        int n3 = Integer.valueOf(s);

        // Kimenet kiírása, hogy lássuk az értékeket és típusokat.
        System.out.println(s);   // Eredeti String, "14"
        System.out.println(n);   // int, 14
        System.out.println(n2);  // Integer objektum, 14
        System.out.println(n3);  // int, 14

        // Feladat: különböző adattípusok konvertálása Stringből

        // Egy hosszú egész számot tartalmazó String ("123"), amit long típusra konvertálunk.
        String s2 = "123";
        long l = Long.parseLong(s2);  // String -> long

        // Egy lebegőpontos számot tartalmazó String ("3.14"), amit float típusra konvertálunk.
        String s3 = "3.14";
        float f = Float.parseFloat(s3);  // String -> float

        // Egy dupla pontosságú lebegőpontos számot tartalmazó String ("7.89"), amit double típusra konvertálunk.
        String s4 = "7.89";
        double d = Double.parseDouble(s4);  // String -> double

        // Egyetlen karaktert tartalmazó String ("a"), amit char típusra konvertálunk.
        String s5 = "a";
        char c = s5.charAt(0);  // Az első karakter kivétele -> char

        // Egy karakterlánc ("hello World!"), amelyet karaktertömbbé alakítunk.
        String s6 = "hello World!";
        char[] array = s6.toCharArray();  // String -> char[]

        // Kimenet kiírása a konvertált értékekhez
        System.out.println(l);   // Kimenet: 123
        System.out.println(f);   // Kimenet: 3.14
        System.out.println(d);   // Kimenet: 7.89
        System.out.println(c);   // Kimenet: 'a'
        System.out.println(Arrays.toString(array));  // Kimenet: [h, e, l, l, o,  , W, o, r, l, d, !]
    }
}
