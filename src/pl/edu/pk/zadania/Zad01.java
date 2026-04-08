package pl.edu.pk.zadania;

public class Zad01 {
    static void main(String[] args) {
        double a = 2.12;
        double b = -7.54;

        System.out.println(" --------Podtstawowe operacje w klasie java.lang.Math--------------");
        // Pierwiastkowanie
        System.out.println("Pierwiastek z " + a + " wynosi: " + Math.sqrt(a));
        // Wartość bezwzględna
        System.out.println("Wartość bezwzględna z " + b + " wynosi: " + Math.abs(b));
        //zaokraglanie
        double liczba = 3.55;
        System.out.println("Zaokrąglenie z " + liczba + " wynosi " + Math.round(liczba));
        System.out.println("Zaokrąglenie z " + a + " wynosi " + Math.round(a));

        System.out.println("\n--- Porównanie kwadratu ---");
        double wynikMnozenia = a * a;
        double wynikMetody = Math.pow(a, 2);
//        float wynikMnozeniaRzutowanie =  Math.pow(a, 2); -->blad chcemy w zmiennej float zmiescic double
//        -->przegladanie mozliwosci naprawienia bledu

        System.out.println("Wynik x * x: " + wynikMnozenia);
        System.out.println("Wynik Math.pow(x, 2): " + wynikMetody);

        //Ctrl+Q przegladanie metod w klasie
    }
}
