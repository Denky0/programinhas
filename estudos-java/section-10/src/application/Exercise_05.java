package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double [n];
        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double value = vect[0];
        int posicao = 0;

        for (int i=1; i<n; i++) {
            if (vect[i] > value) {
                value = vect[i];
                posicao = i;
            }
        }

        System.out.println("Maior valor = " + value);
        System.out.println("Posição do Maior Valor = " + posicao);

        sc.close();
    }
}
