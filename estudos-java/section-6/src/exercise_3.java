import java.util.Scanner;

public class exercise_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipe = sc.nextInt();
		
		while (tipe != 4) {
			if (tipe == 1) {
				alcool = alcool + 1;
			}
			else if (tipe == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipe == 3) {
				diesel = diesel + 1;
			}
			
			tipe = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
			sc.close();

		}

	}