using System;
using System.Collections.Generic;
using System.Linq;

namespace SolveTask3
{
    class Program
    {
        // User osztály, amely tárolja a felhasználó adatokat
        class User
        {
            public int Id { get; set; }                         // Felhasználó egyedi azonosítója
            public string Name { get; set; }                    // Felhasználó neve
            public DateTime RegistrationDate { get; set; }      // Regisztráció dátuma
        }

        // Book osztály, amely a könyv adatait tárolja
        class Book
        {
            public int Id { get; set; }                 // Könyv egyedi azonosítója
            public string Title { get; set; }           // Könyv címe
            public string Author { get; set; }          // Könyv szerzője
            public int PublicationYear { get; set; }    // Könyv kiadási éve
        }

        // Loan osztály, amely tárolja a kölcsönzés adatait
        class Loan
        {
            public int UserId { get; set; }             // Felhasználó azonosítója
            public int BookId { get; set; }             // Könyv azonosítója
            public DateTime LoanDate { get; set; }      // Kölcsönzés dátuma
            public DateTime? ReturnDate { get; set; }   // Visszahozatal dátuma (ha van)
        }

        static void Main()
        {
            // User lista
            List<User> users = new List<User>
            {
                new User { Id = 1, Name = "Kiss Péter",   RegistrationDate = new DateTime(2015, 6, 1)  },
                new User { Id = 2, Name = "Nagy Anna",    RegistrationDate = new DateTime(2018, 3, 15) },
                new User { Id = 3, Name = "Szabó Márton", RegistrationDate = new DateTime(2020, 9, 23) },
                new User { Id = 4, Name = "Tóth Éva",     RegistrationDate = new DateTime(2021, 11, 5) }
            };

            // Book lista
            List<Book> books = new List<Book>
            {
                new Book { Id = 1, Title = "A kőszivű ember fiai",           Author = "Jókai Mór",     PublicationYear = 1869 },
                new Book { Id = 2, Title = "Pál utcai fiúk",                 Author = "Molnár Ferenc", PublicationYear = 1906 },
                new Book { Id = 3, Title = "Egri csillagok",                 Author = "Gárdonyi Géza", PublicationYear = 1899 },
                new Book { Id = 4, Title = "Harry Potter és a Bölcsek köve", Author = "J.K. Rowling",  PublicationYear = 1997 },
                new Book { Id = 5, Title = "1984",                           Author = "George Orwell", PublicationYear = 1949 }
            };

            // Loan lista
            List<Loan> loans = new List<Loan>
            {
                new Loan { UserId = 1, BookId = 1, LoanDate = new DateTime(2023, 1, 10), ReturnDate = new DateTime(2023, 2, 1)  },
                new Loan { UserId = 1, BookId = 3, LoanDate = new DateTime(2023, 5, 15), ReturnDate = null                      },
                new Loan { UserId = 2, BookId = 4, LoanDate = new DateTime(2023, 6, 1),  ReturnDate = new DateTime(2023, 6, 25) },
                new Loan { UserId = 3, BookId = 2, LoanDate = new DateTime(2023, 4, 20), ReturnDate = null                      },
                new Loan { UserId = 3, BookId = 5, LoanDate = new DateTime(2023, 7, 15), ReturnDate = new DateTime(2023, 8, 1)  },
                new Loan { UserId = 4, BookId = 3, LoanDate = new DateTime(2023, 2, 1),  ReturnDate = new DateTime(2023, 2, 20) },
                new Loan { UserId = 4, BookId = 1, LoanDate = new DateTime(2023, 9, 10), ReturnDate = null                      },
            };


            // 1. Összes kölcsönzés kiírása - mindkét LINQ szintaxis
            Console.WriteLine("All loans:");

            /* Kulcsszavas LINQ (Query Syntax)

             * Itt a from, join és select kulcsszavakat használjuk. 
             * Az adatok összekapcsolása a join kulcsszóval történik, ahol a `loans` és `users` listákat 
             * az `UserId` mező alapján kapcsoljuk össze. 
             * A könyvekkel való összekapcsolás ugyanígy történik a `BookId` alapján. 
             * Az select segítségével egy új anoním típust hozunk létre, amely tartalmazza a felhasználó nevét, a könyv címét, szerzőjét 
             * és azt, hogy visszahozva van-e.
             */
            var allLoansQuerySyntax = from loan in loans
                                      join user in users on loan.UserId equals user.Id
                                      join book in books on loan.BookId equals book.Id
                                      select new
                                      {
                                          User = user.Name,
                                          Book = book.Title,
                                          Author = book.Author,
                                          Returned = loan.ReturnDate.HasValue ? "Returned" : "Not returned"
                                      };

            foreach (var item in allLoansQuerySyntax)
            {
                Console.WriteLine($"{item.User} - {item.Book} ({item.Author}) [{item.Returned}]");
            }

            /* Metódus láncolásos LINQ (Method Syntax)
         
             * A Join metódus láncolásos használatával végezzük el az összekapcsolást, 
             * ahol először a `loans` és `users`, majd a `loans` és `books` listát kapcsoljuk össze. 
             * Az anonymous type-ot pedig a select után hozunk létre.
             */
            var allLoansMethodSyntax = loans
                                       .Join(users, loan => loan.UserId, user => user.Id, (loan, user) => new { loan, user })
                                       .Join(books, temp => temp.loan.BookId, book => book.Id, (temp, book) => new
                                       {
                                           User = temp.user.Name,
                                           Book = book.Title,
                                           Author = book.Author,
                                           Returned = temp.loan.ReturnDate.HasValue ? "Returned" : "Not returned"
                                       });

            foreach (var item in allLoansMethodSyntax)
            {
                Console.WriteLine($"{item.User} - {item.Book} ({item.Author}) [{item.Returned}]");
            }


            // 2. Legtöbb kölcsönzést végző felhasználó
            Console.WriteLine("\nMost loans:");

            /* Kulcsszavas LINQ

             *  Itt a group by és orderby kulcsszavakat használjuk. 
             * A kölcsönzéseket a felhasználó azonosítója szerint csoportosítjuk, majd csökkenő sorrendbe rendezzük a csoportok számát,
             * és az első csoportot választjuk.
             */
            var mostLoansQuerySyntax = (from loan in loans
                                        group loan by loan.UserId into grouped
                                        orderby grouped.Count() descending
                                        select new { UserId = grouped.Key, Count = grouped.Count() })
                                        .FirstOrDefault();

            var mostLoanUser = users.FirstOrDefault(u => u.Id == mostLoansQuerySyntax.UserId);
            Console.WriteLine($"Most loans: {mostLoanUser.Name}, {mostLoansQuerySyntax.Count} times.");

            /* Metódus láncolásos LINQ

             * A GroupBy és OrderByDescending metódusok segítségével ugyanazt a csoportosítást és rendezést végezzük el, 
             mint a kulcsszavas változatnál.
             */
            var mostLoansMethodSyntax = loans
                                        .GroupBy(l => l.UserId)
                                        .OrderByDescending(g => g.Count())
                                        .FirstOrDefault();

            var mostLoanUserMethodSyntax = users.FirstOrDefault(u => u.Id == mostLoansMethodSyntax.Key);
            Console.WriteLine($"Most loans: {mostLoanUserMethodSyntax.Name}, {mostLoansMethodSyntax.Count()} times.");


            // 3. Régi könyvek (2000 előtti), amelyek nincsenek még visszahozva
            Console.WriteLine("\nOld books (before 2000), Not returned:");

            /* Kulcsszavas LINQ

             * A where és any operátorok segítségével először szűrjük a 2000 után kiadott könyveket, majd kiszűrjük azokat,
             * amelyek még nincsenek visszahozva.
             */
            var oldBooksQuerySyntax = from book in books
                                      where book.PublicationYear < 2000 &&
                                            !loans.Any(l => l.BookId == book.Id && l.ReturnDate == null)
                                      select book;

            foreach (var book in oldBooksQuerySyntax)
            {
                Console.WriteLine($"{book.Title} ({book.Author}, {book.PublicationYear})");
            }

            /* Metódus láncolásos LINQ

             * A Where és Any metódusok láncolásos formában végzik el ugyanazt a szűrést.
             */
            var oldBooksMethodSyntax = books
                                       .Where(b => b.PublicationYear < 2000 &&
                                                   !loans.Any(l => l.BookId == b.Id && l.ReturnDate == null))
                                       .ToList();

            foreach (var book in oldBooksMethodSyntax)
            {
                Console.WriteLine($"{book.Title} ({book.Author}, {book.PublicationYear})");
            }


            // 4. Legrégebbi felhasználó aktív kölcsönzései
            var oldestUser = users.OrderBy(u => u.RegistrationDate).First();
            Console.WriteLine($"\nOldest user: {oldestUser.Name}");

            /* Kulcsszavas LINQ

             * A where és join kulcsszavak segítségével szűrjük a legrégebbi felhasználó aktív kölcsönzéseit, 
             * majd csatlakoztatjuk a könyveket a kölcsönzéshez.
             */
            var activeLoansQuerySyntax = from loan in loans
                                         where loan.UserId == oldestUser.Id && loan.ReturnDate == null
                                         join book in books on loan.BookId equals book.Id
                                         select book;

            foreach (var book in activeLoansQuerySyntax)
            {
                Console.WriteLine($"{book.Title} ({book.Author})");
            }

            /* Metódus láncolásos LINQ

             * A Where és Join metódusok segítségével hasonló módon végezzük el a szűrést és az összekapcsolást.
             */
            var activeLoansMethodSyntax = loans
                                          .Where(l => l.UserId == oldestUser.Id && l.ReturnDate == null)
                                          .Join(books, l => l.BookId, book => book.Id, (l, book) => book)
                                          .ToList();

            foreach (var book in activeLoansMethodSyntax)
            {
                Console.WriteLine($"{book.Title} ({book.Author})");
            }


            // 5. Legutóbbi kölcsönzés
            /* 
             * Itt egyszerűen az OrderByDescending metódussal rendezzük a kölcsönzéseket dátum szerint csökkenő sorrendbe,
             * és kiválasztjuk az első elemet, amely a legutóbbi kölcsönzés.
             */
            var latestLoan = loans.OrderByDescending(l => l.LoanDate).First();
            var latestLoanUser = users.First(u => u.Id == latestLoan.UserId);
            var latestBook = books.First(b => b.Id == latestLoan.BookId);
            Console.WriteLine($"\nLatest loan: {latestBook.Title} ({latestBook.Author}) borrowed by {latestLoanUser.Name} on {latestLoan.LoanDate.ToShortDateString()}.");
        }
    }
}

/* 
 * Minden egyes LINQ operátor és a hozzájuk tartozó metódusok viselkedése nagyon hasonló a két szintaxis között, de a választott szintaxis más-más módon olvasható és alkalmazható.
 */
