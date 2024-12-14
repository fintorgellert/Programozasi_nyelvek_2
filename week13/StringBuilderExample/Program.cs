using System;
using System.Text;

namespace StringBuilderExample
{
    class Program
    {
        public static void Main(string[] args)
        {
            // A StringBuilder gyorsabb, mint a sima string összefűzés, ha sok szöveget módosítunk, mivel nem hoz létre új objektumokat minden egyes módosításkor.
            StringBuilder sb = new StringBuilder();

            // Szövegek hozzáadása
            sb.Append("Hello, ");
            sb.Append("világ!");

            // Az eredmény kiírása
            Console.WriteLine(sb.ToString());
        }
    }
}

