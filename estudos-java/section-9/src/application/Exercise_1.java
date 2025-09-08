package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Exercise_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bank bank;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit(y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(number, holder, initialDeposit);
		} else {
			bank = new Bank(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bank.deposit(depositValue);
		
		System.out.println("Updated account data:");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		double withdraw = sc.nextDouble();
		bank.withdraw(withdraw);
		
		System.out.println("Updated account data:");
		System.out.println(bank);
			
	}

}
