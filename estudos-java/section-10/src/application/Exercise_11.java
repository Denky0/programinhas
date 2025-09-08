package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_11 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i=0; i<n; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Gênero da " + (i+1) + "a pessoa: ");
            generos[i] = sc.next().charAt(0);
        }
        
        double menorAlt = alturas[0];
        double maiorAlt = alturas[0];

        for (int i=0; i<n; i++) {
            if (alturas[i] > maiorAlt) {
                maiorAlt = alturas[i];
            } if (alturas[i] < menorAlt) {
                menorAlt = alturas[i];
            }
        }

        int qtdH = 0;
        int qtdM = 0;
        double alturaF = 0;

        for (int i=0; i<n; i++) {
            if(generos[i] == 'M') {
                qtdH++;
            } else {
                qtdM++;
                alturaF = alturaF + alturas[i];
            }
        }

        double media = alturaF / qtdM;

        System.out.printf("Menor Altura = %.2f%n", menorAlt);
        System.out.printf("Maior Altura = %.2f%n", maiorAlt);
        System.out.printf("Média das alturas das Mulheres = %.2f%n", media);
        System.out.println("Número de Homens = " + qtdH);

        sc.close();
    }
}
