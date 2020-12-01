package chapter05;

import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan amount: ");
		double loanAmount = input.nextDouble();

		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double annualRate = input.nextDouble();

		double monthlyRate = annualRate / 1200;
		double monthlyPayment = loanAmount * monthlyRate / (1 - (1 / Math.pow(1 + monthlyRate, 12 * numberOfYears)));
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n", (monthlyPayment * 12) * numberOfYears);
		System.out.println("Payment#     Interest     Principal     Balance");
		double balance = loanAmount;
		for (int i = 1; i <= numberOfYears * 12; i++) {
			double interest = monthlyRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest, principal, balance);
		}

	}

}
