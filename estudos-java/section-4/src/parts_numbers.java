import java.util.Locale;
import java.util.Scanner;
public class parts_numbers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int number1 = sc.nextInt();
		double preco1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int number2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		
		double valor = number1 * preco1 + number2 * preco2;
		
		System.out.printf("Valor a pagar: R$ %.2f%n ", valor);
		
		sc.close();

	}

}
