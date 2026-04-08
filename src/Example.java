import java.util.Scanner;

public class Example {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w restauracji");
        int wybor;
        int suma = 0;

        //wyswitelamy menu ideaalna do while
        do {
            System.out.println("1 - zupa -10zl");
            System.out.println("2 -drugie danie -30");
            System.out.println("3 - sok - 10");
            System.out.println("4 - salatka 15");
            System.out.print("wybierz opcje: ");
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
                    suma += 10;
                    System.out.println("Dodano sok");
                    break;
                case 4:
                    suma += 15;
                    System.out.println("Dodano zupę");
                    break;
                case 5:
                    System.out.println("koniec");
                    break;
                default:
                    System.out.println("niepoprawny wybor");
            }
        } while (wybor != 5);
        double ileZaplacimy = suma; //niejawne rzutowanie int - double
        System.out.println("Łączna kwota przed rabatem: " + suma + " zł");

    }
}
