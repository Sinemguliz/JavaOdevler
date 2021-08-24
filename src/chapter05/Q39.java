package chapter05;

import java.util.Scanner;

public class Q39 {
	public static void main(String[] args) {
		double targetCommission = 30000;

		double salesAmount = 0;

		double commission = 0;
		while (commission < targetCommission) {

			salesAmount++;
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
