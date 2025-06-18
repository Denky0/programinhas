import java.util.Scanner;

public class Age_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da Primeira Pessoa:");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a idade da Primeira Pessoa:");
        int idade1 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite o nome da Segunda Pessoa:");
        String nome2 = scanner.nextLine();
        System.out.print("Digite a idade da Segunda Pessoa:");
        int idade2 = scanner.nextInt();

        scanner.nextLine();

        int diferenca = Math.abs(idade1 - idade2);
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é: " + diferenca + " anos ");
        scanner.close();
    }
}