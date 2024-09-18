/* 
    FormattedPrint példák Java nyelven

    Ez a program bemutatja a String formázási és kiírási lehetőségeket Java-ban.
    A következőket tartalmazza:
    1. Egyszerű string összefűzés.
    2. Formázott kiíratás printf() metódussal.
    3. Formázott kiíratás String.format() metódussal.
    4. Metódus használata formázott szöveg visszaadásához.

    Fordítás és futtatás terminálban:
    1. Fordítás: javac FormattedPrint.java
    2. Futtatás: java FormattedPrint 
*/

public class FormattedPrint
{
    // getString metódus, amely visszaad egy üdvözlő üzenetet
    // Az argumentumként kapott name változó értéke a stringbe ágyazódik
    static String getString(String name)
    {
        return "Hello " + name + "!";
    }

    public static void main(String[] args)
        {   
        // Definiáljuk a változókat
        String name = "Joe";
        String profession = "hacker";
        int age = 22;

        // Különböző módon formázott kiíratás

        // Egyszerű string összefűzés
        // Az összefűzött string a következő formában jelenik meg: "Joe (hacker), 22"
        System.out.println(name + " (" + profession + "), " + age);

        // Formázott kiíratás printf() metódussal
        // %s helyettesíti a String típusú változókat, %d helyettesíti az int típusú változót
        // Az eredmény: "Joe (hacker), 22"
        System.out.printf("%s (%s), %d\n", name, profession, age);

        // Formázott kiíratás String.format() metódussal
        // String.format() visszaad egy formázott stringet, amit a result változó tárol
        // Az eredmény: "Joe (hacker), 22"
        String result = String.format("%s (%s), %d", name, profession, age);
        System.out.println(result);

        // Meghívjuk a getString() metódust és kiírjuk az eredményt
        // A getString("Anna") visszaadja a "Hello Anna!" stringet
        String hello = getString("Anna");
        System.out.println(hello);
    }
}
