import java.util.Scanner;

public class exercise_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.err.println("divisão impossível");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
	}

}
