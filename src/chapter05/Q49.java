package chapter05;

import java.util.Scanner;

public class Q49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		int vowels = 0;
		int consonants = 0;
		
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i))) {
				if (Character.toLowerCase(string.charAt(i)) == 'a' 
						|| Character.toLowerCase(string.charAt(i)) == 'e' 
						|| Character.toLowerCase(string.charAt(i)) == 'i' 
						|| Character.toLowerCase(string.charAt(i)) == 'o' 
						||  Character.toLowerCase(string.charAt(i)) == 'u')
					vowels++;
					
			}
			else 
				consonants++;

		}
		System.out.println("The number of vowels is " + vowels);
		System.out.print("The number of consonants is " + consonants);
	}

}
