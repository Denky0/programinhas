import java.util.Scanner;
public class exercise_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int number;
		
		System.out.println("Qual o número?");
		number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não negativo");
		}
		
		sc.close();
		
	}

}
