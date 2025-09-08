package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_03 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i=0; i<n; i++) {
            soma = soma + alturas[i];
        }

        double media = soma / n;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", media);
        
        int conta = 0;
        for (int i=0; i<n; i++) {
            if (idades[i] < 16) {
                conta = conta + 1;
            }
        }

        double porcentagem = conta * 100.0 / n;

        System.out.printf("Pessoa com menos de 16 anos: %.1f%%%n", porcentagem);
        
         for (int i=0; i<n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        } 

        sc.close();
    }
}
