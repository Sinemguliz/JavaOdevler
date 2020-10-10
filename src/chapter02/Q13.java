package chapter02;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount: ");
		double amount = input.nextDouble();

		double annualInterestRate = 0.00417;
		double lastAmount = amount * (1 + annualInterestRate);
		lastAmount = (amount + lastAmount) * (1 + annualInterestRate);
		lastAmount = (amount + lastAmount) * (1 + annualInterestRate);
		lastAmount = (amount + lastAmount) * (1 + annualInterestRate);
		lastAmount = (amount + lastAmount) * (1 + annualInterestRate);
		lastAmount = (amount + lastAmount) * (1 + annualInterestRate);

		System.out.println("After the sixth month, the account value is " + lastAmount);
	}

}
