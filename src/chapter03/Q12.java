package chapter03;

/*3.12 (Palindrome integer) Write a program that prompts the user to enter a three-digit
integer and determines whether it is a palindrome integer. An integer is palindrome
if it reads the same from right to left and from left to right. A negative integer is
treated the same as a positive integer.*/
import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
/*
		int digit1 = (number - (number % 100)) / 100;
		int digit2 = ((number - (100 * digit1))) / 10;
		int digit3 = number - ((100 * digit1) + (10 * digit2));
*/
		
		int digit1 = number % 10;
		int digit3 = number / 100;

		if (digit1 == digit3)
			System.out.println(number + " is a palindrome.");
		else
			System.out.println(number + " is not a palindrome.");
	}
}
