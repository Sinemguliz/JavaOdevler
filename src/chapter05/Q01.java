package chapter05;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = sc.nextInt();

		if (number == 0) {
			System.out.println("No numbers are entered except 0");
			return;
		}

		int positives = 0;
		int negatives = 0;
		double total = 0;
		while (number != 0) {
			if (number > 0)
				positives++;
			else
				negatives++;
			total += number;
			number = sc.nextInt();
		}

		double average = total / (positives + negatives);

		System.out.print("The number of positives is " + positives + "\nThe number of negatives is " + negatives
				+ "\nThe total is " + total + "\nThe average is " + average);

	}

}
