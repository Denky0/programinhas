import java.util.Locale;
import java.util.Scanner;
public class price_hours {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		double salario = horas * valor;
		
		System.out.println("number = " + number);
		System.out.printf("salario = U$ %.2f%n", salario);
		
		sc.close();

	}

}
