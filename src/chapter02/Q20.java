package chapter02;

import java.util.Scanner;

public class Q20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = scan.nextDouble();
		double annualInterestRate = scan.nextDouble();

		double interest = balance * (annualInterestRate / 1200);
		System.out.print("The interest is " + interest);
	}

}
