package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_09 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        int maiorid;
        int posicao;

        System.out.print("Quantas pessoas você vai digitar? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a Pessoa");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        maiorid = idades[0];
        posicao = 0;

        for (int i=1; i<n; i++) {
            if (idades[i] > maiorid) {
                maiorid = idades[i];
                posicao = i;
            }
        }

        System.out.printf("Pessoa mais Velha: %s\n", nomes[posicao]);

        sc.close();
    }
}
