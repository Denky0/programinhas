package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media;
        double soma;

        System.out.println("Quantos números você vai digitar? ");
        n = sc.nextInt();

        double vect[] = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i=0; i<n; i++) {
            soma = soma + vect[i];
        }
        
        media = soma / n;

        System.out.print("Valores digitados = " );

        for (int i=0; i<n; i++) {
            System.out.printf("%.1f%n ", vect[i]);
        }

        System.out.printf("\nSOMA = %.2f%n", soma);
        System.out.printf("\nMEDIA = %.2f%n", media);

        sc.close();
    }
}
