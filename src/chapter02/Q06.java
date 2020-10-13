package chapter02;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the integer between 0 and 1000 ");
		int number = input.nextInt();
		if (0 <= number && number < 1000) {

			int ones = number % 10;
			number /= 10;

			int tenth = number % 10;
			number /= 10;

			int hundreds = number % 10;

			int sum = hundreds + tenth + ones;
			System.out.println("The sum of the digits is " + sum);
		} else {
			System.out.println("Please enter a valid variable!");
		}
	}

}
