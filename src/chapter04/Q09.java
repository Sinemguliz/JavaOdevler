package chapter04;

import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String str = input.nextLine();

		char ch = str.charAt(0);

		System.out.print("The Unicode for the character E is " + (int) ch);

	}

}
