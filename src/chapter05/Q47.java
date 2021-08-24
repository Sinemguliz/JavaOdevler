package chapter05;

import java.util.Scanner;

public class Q47 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string:");
		String isbn = input.nextLine();

		if (isbn.length() != 12)
			System.out.print(isbn + " is an invalid input.");
		int sum = 0;
		for (int i = 0; i < isbn.length(); i++) {
			
		}

	}

}?