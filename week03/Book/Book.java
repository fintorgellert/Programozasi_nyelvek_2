package Programozasi_nyelvek_2.week03.Book;
public class Book
{
    /* 
        Az osztály egy sablon, amely leírja az objektumok tulajdonságait és viselkedését.
        Itt a Book osztály 3 tulajdonsággal rendelkezik: title (cím), author (szerző) és pages (oldalszám).
    */
    public String title;
    public String author;
    public int pages;
    
    /* 
        Konstruktor, amely akkor fut le, amikor egy új Book objektumot hozunk létre.
        A konstruktor három paramétert vesz fel: a könyv címét, szerzőjét és oldalszámát.
    */
    public Book(String aTitle, String anAuthor, int somePages)
    {
        /* 
            A "this" kulcsszó az adott példányra hivatkozik, hogy megkülönböztessük a példányváltozókat a paraméterektől.
            A példányváltozókat (title, author, pages) inicializáljuk a paraméterekkel.
        */

        this.title = aTitle;
        this.author = anAuthor;
        this.pages = somePages;
    }
}