package chapter05;

import java.util.Scanner;

public class Q31 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of CD: ");
		double amount = input.nextDouble();

		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter the number of months: ");
		int months = input.nextInt();

		double monthlyIWorthRate = amount;
		System.out.println("Month\t CD Value");

		for (int i = 1; i <= months; i++) {
			monthlyIWorthRate = monthlyIWorthRate + monthlyIWorthRate * annualInterestRate / 1200;
			System.out.printf(+i + "\t %.2f\n", monthlyIWorthRate);
		}

	}

}
