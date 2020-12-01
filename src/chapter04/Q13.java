package chapter04;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String letter = scan.next();

		char lowerletter = Character.toLowerCase(letter.charAt(0));

		if (!Character.isLetter(lowerletter)) {
			System.out.print("invalid input");
		} else {
			switch (lowerletter) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.print(letter + " is a vowel.");
				break;
			default:
				System.out.print(letter + " is a consonant.");
			}
		}
	}
}
