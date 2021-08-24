package chapter05;

import java.util.Scanner;

public class Q36 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String isbn = scan.next();
		int number = Integer.parseInt(isbn);
		int sum = 0;
		int control = 1;
		for (int i = 8; i >= 0; i--) {
			sum +=  (number / (int) Math.pow(10, i)) % 10 * control;
			control++;			
		}
		int checksum = sum % 11;
		if (checksum == 10)
			System.out.print("The ISBN-10 number is " + isbn + "X");
		else 
			System.out.print("The ISBN-10 number is " + isbn + checksum);
	}

}
