package pl.edu.pk.zadania;

import java.util.Scanner;

public class Zad05 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Podana liczba nie jest dodatnia");
        } else {
            System.out.println("Liczby nieparzyste: ");
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.print(i);
                    if (i+2<=n){
                        System.out.print(", ");
                    }
                }
            }
        }
        scanner.close();
    }
}
