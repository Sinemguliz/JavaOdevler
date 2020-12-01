package chapter05;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();

		//int gcd = Math.min(n1, n2);
		
		int gcd = n1;
		if (n1 > n2)
			gcd = n2;
		
		while (!(n1 % gcd == 0 && n2 % gcd == 0)) {
			gcd--;				
		}

		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
	}

}
