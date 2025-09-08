package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Wage;

public class Exercise_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Wage wage = new Wage();
		
		System.out.println("Name: ");
		wage.name = sc.nextLine();
		System.out.print("Gross salary: ");
		wage.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		wage.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + wage);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		wage.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + wage);
		
		sc.close();

	}

}
