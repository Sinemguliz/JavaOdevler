package chapter03;

/***3.9 (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
which is calculated from the other 9 digits using the following formula:
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
If the checksum is 10, the last digit is denoted as X according to the ISBN-10
convention. Write a program that prompts the user to enter the first 9 digits and
displays the 10-digit ISBN (including leading zeros). Your program should read
the input as an integer.*/
import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int number = scan.nextInt();

		int d1 = number / 100000000;
		int digits = number % 100000000;

		int d2 = digits / 10000000;
		digits %= 10000000;

		int d3 = digits / 1000000;
		digits %= 1000000;

		int d4 = digits / 100000;
		digits %= 100000;

		int d5 = digits / 10000;
		digits %= 10000;

		int d6 = digits / 1000;
		digits %= 1000;

		int d7 = digits / 100;
		digits %= 100;

		int d8 = digits / 10;
		digits %= 10;

		int d9 = digits;

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (d10 == 10)
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
		else
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
	}
}
