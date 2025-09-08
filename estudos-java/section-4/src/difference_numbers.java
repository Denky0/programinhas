import java.util.Scanner;
import java.util.Locale;
public class difference_numbers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.println(diferenca);
		
		sc.close();
	}

}
