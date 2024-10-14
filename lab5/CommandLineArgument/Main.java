import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        // Az args tömb elemeinek kiíratása konzolra. 
        // Az args a parancssori argumentumokat tárolja, amelyeket a program futtatásakor adtunk meg.
        System.out.println(Arrays.toString(args));

        // Ellenőrzés, hogy pontosan két argumentumot adtunk-e meg. 
        // Ha nem, hibaüzenetet írunk ki, és a program kilép (exit kóddal 1).
        if (args.length != 2) {
            System.out.println("Error: please provide exactly two numbers!");
            System.exit(1);     // Kilépés hibakóddal, ha a bemeneti argumentumok száma nem megfelelő
        }

        // Az első és második parancssori argumentum átalakítása int típusúvá.
        // A parseInt() metódust használjuk a String konverziójára int típusra.
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // A két szám összegének kiszámítása és tárolása a result változóban.
        int result = x + y;

        // Az összeg kiíratása a konzolra.
        System.out.println(result);
    }
}
