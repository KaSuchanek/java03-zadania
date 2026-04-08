package pl.edu.pk.zadania;

import java.util.Scanner;

public class Zad06 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Podana liczba nie jest dodatnia");
        } else {
            System.out.print("Potęgi liczby 2 do " + n + ": ");

            int potega = 1; // pierwsza potęga 2^0 = 1
            while (potega <= n) { // dopóki potęga nie przekracza n
                System.out.print(potega + " ");

                potega *= 2; // kolejna potęga 2
//                if (potega <= n) {
//                    System.out.print(", "); // przecinek tylko jeśli będzie kolejna liczba
//                }
            }
        }
        scanner.close();
    }
}
