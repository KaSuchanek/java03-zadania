package pl.edu.pk.zadania;/*do while
* Najpierw wykona się kod w { ... }.
Potem sprawdzany jest warunek w while.
Jeśli warunek jest true, pętla wykona się ponownie.
Jeśli warunek jest false, pętla się kończy.
* idealne do menu sklepu użytkownik zawsze zobaczy menu co najmniej raz, zanim wpisze swoją decyzję,
nie musimy inicjalizować zmiennej wyboru przed pętlą tak, jak w zwykłym while.
Pętla kończy się, gdy użytkownik wybierze opcję „Zakończ”.*/

import java.util.Scanner;

public class Zad09 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int wybor;

        System.out.println("Witaj w restauracji!");

        do {
            System.out.println("1 - Zupa - 10zl");
            System.out.println("2 - Drugie danie - 30zl");
            System.out.println("3 - Salatka - 20zl");
            System.out.println("4 - Sok - 10zl");
            System.out.println("5 – Zakończ zamówienia");
            System.out.print("Wybierz opcję (1-5): ");
            wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    suma += 10;
                    System.out.println("Dodano zupę");
                    break;
                case 2:
                    suma += 30;
                    System.out.println("Dodano drugie danie");
                    break;
                case 3:
                    suma += 20;
                    System.out.println("Dodano sałatkę");
                    break;
                case 4:
                    suma += 10;
                    System.out.println("Dodano sok");
                    break;
                case 5:
                    System.out.println("Kończymy zamówienie");
                    break;
                default:
                    System.out.println("Niepoprawny wybór");
            }
        } while (wybor != 5);

        // obliczamy rachunek
        double kwotaDoZaplaty = suma;       // int -> double
        if (suma > 80) {
            double rabat = kwotaDoZaplaty * 0.1; // 10% rabatu
            kwotaDoZaplaty -= rabat;
            System.out.println("\nRabat: " + rabat + " zł");
        }

        System.out.println("\nPodsumowanie zamówienia:");
        System.out.println("Łączna kwota przed rabatem: " + suma + " zł");
        System.out.println("Do zapłaty po rabacie: " + kwotaDoZaplaty + " zł");

        scanner.close();
    }
}
