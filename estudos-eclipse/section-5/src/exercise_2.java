import java.util.Scanner;
public class exercise_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Qual o número?");
		number = sc.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		
		sc.close();
		
	}

}
