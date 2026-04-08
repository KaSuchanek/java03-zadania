package pl.edu.pk.zadania;

import java.util.Scanner;

public class Zad08 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą nieujemną n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Liczba nie może być ujemna");
        } else {
            // Obliczanie silni n!
            long silnia = 1; // używamy long, bo silnia szybko rośnie
            for (int i = 1; i <= n; i++) {
                silnia *= i;
            }
            System.out.println(n + "! = " + silnia);

            // Obliczanie sumy potęg liczby 2
            long suma = 0;
            long potega2 = 1; // 2^0 = 1
            for (int i = 0; i <= n; i++) {
                suma += potega2;
                potega2 *= 2; // kolejna potęga 2
            }
            System.out.println("Suma potęg liczby 2, począwszy od 0 do " + n + " = " + suma);
        }
        scanner.close();
        }
    }
