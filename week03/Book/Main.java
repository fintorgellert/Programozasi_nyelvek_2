package Programozasi_nyelvek_2.week03.Book;
public class Main
{
    public static void main(String[] args)
    {
        /*
            Egy új példány létrehozása a Book osztályból.
            A konstruktor segítségével megadjuk a könyv címét, szerzőjét és oldalszámát.
        */
        Book book1 = new Book("Dune", "Frank Herbert", 412);
        
        /* 
            A példányváltozóhoz a példány nevével és a '.' operátorral férünk hozzá.
            Kiírjuk a book1 objektum szerzőjét.
         */
        System.out.println(book1.author);

        // Új példány létrehozása egy másik könyvhöz.
        Book book2 = new Book("Alapítvány", "Asimov", 255);
        
        // Kiírjuk a book2 objektum szerzőjét és oldalszámát.
        System.out.println(book2.author);
        System.out.println(book2.pages);
        
        /* 
            A példányváltozókat módosíthatjuk a példányon keresztül.
            Módosítjuk a book2 példány oldalszámát 350-re. 
        */
        book2.pages = 350;

        // Kiírjuk a módosított oldalszámot.
        System.out.println(book2.pages);
    }
}