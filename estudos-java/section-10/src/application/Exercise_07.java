package application;

import java.util.Locale;
import java.util.Scanner;


public class Exercise_07 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números vai ter o vetor?");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i=0; i<n; i++) {
            soma = soma + vect[i];
        }

        double media = soma / n;

        System.out.printf("\nMédia do Vetor = %.3f%n", media);
        System.out.println("Elementos abaixo da Média:");

        for (int i=0; i<n; i++) {
            if (vect[i] < media) {
                System.out.printf("%.1f%n", vect[i]);
            }
        }

        sc.close();
    }
}
