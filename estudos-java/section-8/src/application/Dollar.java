package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conversor;

public class Dollar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		Conversor.price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		Conversor.quantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", Conversor.Reais());
	}

}
