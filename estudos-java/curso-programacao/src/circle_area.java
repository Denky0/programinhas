import java.util.Scanner;
import java.util.Locale;
public class circle_area {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A;
		double pi = 3.14159;
		
		R = sc.nextDouble();
		A = pi * R * R;
		
		System.out.printf("A = %.4f%n", A);
		
		sc.close();

	}

}
