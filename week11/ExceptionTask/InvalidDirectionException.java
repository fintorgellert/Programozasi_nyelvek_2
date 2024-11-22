public class InvalidDirectionException extends Exception {

    private int errorCode;

    /**
     * Constructor for the InvalidDirectionException.
     * 
     * @param errorCode A hibakód, amely megadja a hiba típusát.
     * @param message A hiba egyedi üzenete, amely elmagyarázza a kivétel okát.
     */
    public InvalidDirectionException(int errorCode, String message) {
        super(message);             // Meghívjuk a szülőosztály konstruktorát a hibaüzenet átadásához.
        this.errorCode = errorCode; // A hibakódot a saját mezőnkben tároljuk.
    }

    /**
     * Getter a hibakódhoz.
     * 
     * @return Visszaadja a hibakódot, amelyet a konstruktorban állítottunk be.
     */
    public int getErrorCode() {
        return errorCode;
    }

}

/**
 * Ez az osztály egy saját kivétel implementációját tartalmazza, amely egy adott irányhoz
 * kapcsolódó hibák kezelésére szolgál. 
 * Az osztály az Exception osztályból származik, így beépített Java-s kivételként használható.
 * 
 * Az osztály tartalmaz egy "errorCode" nevű mezőt, amely lehetőséget ad a hiba típusának
 * részletesebb meghatározására. Például egy kódrendszer alapján az errorCode értékek segítségével
 * a program specifikus akciókat hajthat végre.
 * 
 * Főbb elemek:
 * - Konstruktor: A hiba kódját és az üzenetet egyaránt átadja a szülőosztálynak és elmenti.
 * - Getter: Lehetővé teszi a hibakód lekérdezését.
 * 
 * Használat:
 * Ezt a kivételosztályt olyan esetekben érdemes használni, amikor egy speciális iránykezelési hiba
 * történik, például ha egy irány érvénytelen vagy nem elérhető.
 */
