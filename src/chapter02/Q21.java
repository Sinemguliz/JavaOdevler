package chapter02;

import java.util.Scanner;

public class Q21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investmentAmount = scan.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = scan.nextDouble();
		
		System.out.print("Enter number of years: ");
		double years = scan.nextDouble();
		
		double monthlyInterestRate = (annualInterestRate / 1200);
		
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
		System.out.printf("Accumulated value is $%f", futureInvestmentValue);
	}
//formul yanlis tekrar bak!!!
}
