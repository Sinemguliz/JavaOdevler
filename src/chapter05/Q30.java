package chapter05;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount: ");
		double amount = input.nextDouble();

		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter the number of months: ");
		int months = input.nextInt();

		double monthlyInterestRate = (annualInterestRate / 100) / 12;

		double amountInSavingAccount = 0;
		for (int i = 1; i <= months; i++) {
			amountInSavingAccount = (amount + amountInSavingAccount) * (1 + monthlyInterestRate);
		}

		System.out.printf("Amount in savings account after " + months + " months: $%.2f", amountInSavingAccount);
	}

}
