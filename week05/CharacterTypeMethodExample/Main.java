package Programozasi_nyelvek_2.week05.CharacterTypeMethodExample;
public class Main {
    public static void main(String[] args) {
        // A Character.getName(int codePoint) metódus a megadott kódpontnak megfelelő karakter Unicode nevét adja vissza.
        System.out.print("Character name: ");
        System.out.println(Character.getName(9654) + " (9654)");            // Kódpont alapján ▶ neve

        // A Character.isDigit(char ch) metódus ellenőrzi, hogy a karakter számjegy-e.
        System.out.print("Character is digit: ");
        System.out.print(Character.isDigit('4') + " ('4')");                // Igaz, mert '4' számjegy
        System.out.println(", " + Character.isDigit('g') + " ('g')");       // Hamis, mert 'g' nem számjegy

        // A Character.isLetter(char ch) metódus ellenőrzi, hogy a karakter betű-e.
        System.out.print("Character is letter: ");
        System.out.print(Character.isLetter('f') + " ('f')");               // Igaz, mert 'f' betű
        System.out.println(", " + Character.isLetter('5') + " ('5')");      // Hamis, mert '5' számjegy, nem betű

        // A Character.isLowerCase(char ch) metódus ellenőrzi, hogy a karakter kisbetű-e.
        System.out.print("Character is lower case: ");
        System.out.print(Character.isLowerCase('a') + " ('a')");            // Igaz, mert 'a' kisbetű
        System.out.println(", " + Character.isLowerCase('A') + " ('A')");   // Hamis, mert 'A' nagybetű

        // A Character.isUpperCase(char ch) metódus ellenőrzi, hogy a karakter nagybetű-e.
        System.out.print("Character is upper case: ");
        System.out.print(Character.isUpperCase('H') + " ('H')");            // Igaz, mert 'H' nagybetű
        System.out.println(", " + Character.isUpperCase('h') + " ('h')");   // Hamis, mert 'h' kisbetű

        // A Character.isWhitespace(char ch) metódus ellenőrzi, hogy a karakter egy szóköz vagy whitespace-e.
        System.out.print("Character is whitespace: ");
        System.out.print(Character.isWhitespace('\n') + " ('\\n')");        // Igaz, mert '\n' whitespace
        System.out.println(", " + Character.isWhitespace('@') + " ('@')");  // Hamis, mert '@' nem whitespace

        // Példa: A '▶' karakter kódpontját és értékét mutatja
        System.out.println((char) 9654);                                    // '▶' karakter, 9654-es kódponton
        System.out.println((int) '▶');                                      // 9654, a '▶' karakter Unicode kódpontja

        // Karakterek tömbje, amelyek számjegyeket tartalmaznak
        char[] charArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        // A Character.getNumericValue(char ch) metódus a karakter numerikus értékét adja vissza
        // Például '0' esetén 0, '1' esetén 1, stb.
        for (char e : charArray) {
            System.out.println(Character.getNumericValue(e));               // Az egyes számjegyek értékének kiírása
        }
        
        System.out.println();
    }
}
