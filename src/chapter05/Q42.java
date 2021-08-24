package chapter05;

import java.util.Scanner;

public class Q42 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the commission: ");
		double targetCommission = input.nextDouble();

		double salesAmount = 0;

		double commission = 0;

		for (salesAmount = 1; commission < targetCommission; salesAmount++) {
			if (salesAmount < 5000) {
				commission = salesAmount * 0.08;
			} else if (salesAmount < 10000) {
				commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
			} else {
				commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
			}
		}

		System.out.println("Sales should be " + salesAmount + " to earn " + targetCommission + " commission");
	}

}
