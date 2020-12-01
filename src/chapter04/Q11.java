package chapter04;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int input = scan.nextInt();

		if (input < 10 && input >= 0)
			System.out.print("The hex value is " + input);
		else if (input == 10)
			System.out.print("The hex value is A");
		else if (input == 11)
			System.out.print("The hex value is B");
		else if (input == 12)
			System.out.print("The hex value is C");
		else if (input == 13)
			System.out.print("The hex value is D");
		else if (input == 14)
			System.out.print("The hex value is E");
		else if (input == 15)
			System.out.print("The hex value is F");
		else
			System.out.print(input + " is an invalid input");

	}

}
