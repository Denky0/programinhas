import java.util.Scanner;

public class Square_Area {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informa o lado do Quadrado:");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
        scanner.close();
    }
}
