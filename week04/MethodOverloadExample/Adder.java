package Programozasi_nyelvek_2.week04.MethodOverloadExample;
// A Adder osztály, amely metódusokat definiál
public class Adder {
    // Az int típusú számok összeadására szolgáló metódus
    public int add(int a, int b)
    {
        System.out.println("# v1, int");    // Jelezve van, hogy ez az int verzió
        return a + b;                       // Az int típusú paraméterek összege
    }

    // A double típusú számok összeadására szolgáló metódus
    public double add(double a, double b)
    {
        System.out.println("# v2, double");     // Jelezve van, hogy ez a double verzió
        return a + b;                           // A double típusú paraméterek összege
    }
}