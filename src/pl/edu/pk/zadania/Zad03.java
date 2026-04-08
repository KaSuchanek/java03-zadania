package pl.edu.pk.zadania;

import java.util.Scanner;

public class Zad03 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean dzialanie = true;

        while (dzialanie) {

            System.out.print("Podaj liczbę: ");
            double liczba = scanner.nextDouble();

            if (liczba > 0) {
                System.out.println("Liczba jest dodatnia");
            } else if (liczba < 0) {
                System.out.println("Liczba jest ujemna");
            } else {
                System.out.println("Liczba jest równa zero");
            }

            System.out.print("Czy liczymy dalej? (t/n): ");
            char decyzja = scanner.next().charAt(0);

            if (decyzja == 'n') {
                dzialanie = false; // zakończenie pętli
            }
        }

        scanner.close();
        System.out.println("Koniec programu");

    }
}


