package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercise_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student.name = sc.nextLine();
		Student.nota_1 = sc.nextDouble();
		Student.nota_2 = sc.nextDouble();
		Student.nota_3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", Student.notaFinal());
		if (Student.notaFinal() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", Student.pontosRestantes());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
