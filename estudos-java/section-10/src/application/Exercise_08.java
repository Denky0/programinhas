package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_08 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        int soma = 0;
        int conta = 0;

        for (int i=0; i<n; i++) {
            if (vect[i] % 2 == 0) {
                soma += vect[i];
                conta++;
            }
        }

        if (conta == 0) {
            System.out.println("Nenhum número Par");
        } else {
            double media = soma / conta;
            System.out.printf("Média dos Pares = %.1f%n", media);
        }

        sc.close();
    }
}
