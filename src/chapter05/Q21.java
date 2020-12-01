package chapter05;

import java.util.Scanner;

public class Q21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan amount: ");
		double loanAmount = input.nextDouble();

		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		System.out.print("Interest Rate\tMonthly Payment\t\tTotal Payment\n");


		for (double i = 5.0; i <= 8; i += 0.125) {
			System.out.printf("%-6.3f%%\t\t", i);
			
			// Obtain monthly interest rate
			double monthlyInterestRate = i / 1200;
			// Calculate payment
			double monthlyPayment = loanAmount * monthlyInterestRate
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;
			
			System.out.printf("%-35.2f", monthlyPayment);
			System.out.printf("%-25.2f\n", totalPayment);
		}

	}

}
