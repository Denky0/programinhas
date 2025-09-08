package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_04 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números Pares:");

        int numbers = 0;
        for (int i=0; i<n; i++) {
            if (vect[i] % 2 == 0) {
            System.out.printf("%d ", vect[i]);
            numbers++;
            }
        }

        System.out.printf("\n\nQuantidade de números pares = %d\n", numbers);

        sc.close();
    }
}
