import java.util.Scanner;

    public class Rectangle_Area {
        public static void main(String[] args) {
            var scanner = new Scanner(System.in);
            System.out.println("Informe a base do Retângulo: ");
            double base = scanner.nextDouble();
            System.out.println("Informe a altura do retângulo: ");
            double altura = scanner.nextDouble();
            double area = base * altura;
            System.out.println(" A área do retângulo é: " + area);
            scanner.close();
        }
    }