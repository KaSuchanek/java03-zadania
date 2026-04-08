package pl.edu.pk.zadania;/*
* utracona precyzja w wyniku rzutowania
* */

public class Zad02 {
    static void main(String[] args) {
        double liczba = 20.0;
        double pierwiastek = Math.sqrt(liczba);
// Rzutujemy na int (upychamy duże pudełko do małego)
        int wynikInt = (int) pierwiastek;
// Podnosimy do kwadratu
        int wynikKoncowy = wynikInt * wynikInt;

        System.out.println("Liczba startowa: " + liczba);
        System.out.println("Pierwiastek (double): " + pierwiastek);
        System.out.println("Po rzutowaniu na int: " + wynikInt);
        System.out.println("Wynik końcowy (kwadrat): " + wynikKoncowy);

    }
}
