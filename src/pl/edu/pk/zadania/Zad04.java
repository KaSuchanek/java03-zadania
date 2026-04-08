package pl.edu.pk.zadania;

import java.util.Scanner;

public class Zad04 {
    static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.print("Podaj masę (kg): ");
        double masa = skaner.nextDouble();

        System.out.print("Podaj wzrost (cm): ");
        double wzrost = skaner.nextDouble();
        double wzrostM = wzrost/100d;

        double bmi = masa / (wzrostM * wzrostM);

        System.out.println("Twoje BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Niedowaga");
        } else if (bmi <= 24.9) {
            System.out.println("Waga prawidłowa");
        } else {
            System.out.println("Nadwaga");
        }
    }
}


