package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_10 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUantos alunos serão digitados? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

         for (int i=0; i<n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
         }

         System.out.println("Alunos Aprovados:");

        for (int i=0; i<n; i++) {
            double media = (nota1[i] + nota2[i] / 2);

            if (media >= 6.0) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }
}
