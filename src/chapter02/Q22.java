package chapter02;

import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount: ");
		int amount = input.nextInt();

		int digit1 = amount / 1000;
		int digit2 = (amount - (1000 * digit1)) / 100;
		int cents = amount - (digit1 * 1000 + digit2 * 100);

		System.out.print("The amount " + amount + " respresent " + digit1 + digit2 + "dollar " + cents + "cent");

	}

}
