package chapter03;

import java.util.Scanner;

public class Q31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int option = input.nextInt();

		double amount;

		switch (option) {
		case 0:
			System.out.print("Enter the dollar amount: ");
			amount = input.nextDouble();
			System.out.println("$" + amount + " is " + (amount * exchangeRate) + " yuan");
			break;
		case 1:
			System.out.print("Enter the RMB amount: ");
			amount = input.nextDouble();
			System.out.println(amount + " yuan is $" + (((amount * 100) / exchangeRate)) / 100.0);
			break;
		default:
			System.out.println("Incorrect input");
		}
	}
}
