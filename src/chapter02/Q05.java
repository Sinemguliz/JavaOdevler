package chapter02;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the subtotal and a gratuity rate:");
		double subtotalRate = input.nextDouble();
		double gratuityRate = input.nextDouble();

		double gratuity = gratuityRate / subtotalRate;
		double total = subtotalRate + gratuity;

		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}