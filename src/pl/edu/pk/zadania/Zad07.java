package pl.edu.pk.zadania;

import java.util.Scanner;

public class Zad07 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Równanie kwadratowe: ax^2 + bx + c = 0");
        System.out.print("Podaj a: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj b: ");
        double b = scanner.nextDouble();
        System.out.print("Podaj c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            // Równanie liniowe bx + c = 0
            if (b != 0) {
                double x = -c / b;
                System.out.println("Równanie liniowe, jedno rozwiązanie: x = " + x);
            } else {
                System.out.println("Nieprawidłowe równanie (a = 0 i b = 0)");
            }
        } else {
            // Obliczenie delty
            double delta = b * b - 4 * a * c;
            System.out.println("Delta = " + delta);

            if (delta < 0) {
                System.out.println("Brak pierwiastków rzeczywistych");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Jedno podwójne rozwiązanie: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Dwa rozwiązania:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        scanner.close();
    }
}
