// Main osztály, amely a PyUtils osztály input metódusait használja a felhasználótól való beolvasáshoz.
public class Main {
    public static void main(String[] args) {
        /* 
            Az input metódus meghívása a PyUtils osztályból, amely a prompt szöveget kiírja 
            és beolvassa a felhasználó nevét.
         */
        String name = PyUtils.input("Your name: ");
        
        /* 
            Az input metódus meghívása a PyUtils osztályból, ezúttal prompt nélkül, 
            hogy egy következő adatot kérjen be.
        */
        String no = PyUtils.input();

        // Kiírja a beolvasott értékeket a konzolra.
        System.out.println(name);
        System.out.println(no);
    }
}
