package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        int n;

        System.out.println("Quantos números você vai digitar? ");
        n = sc.nextInt();

        int vect[] = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números Negativos:");

        for (int i=0; i<n; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }

        sc.close();
    }
}
