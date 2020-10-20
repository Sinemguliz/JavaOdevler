package chapter04;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a letter : ");
		String letter = scan.next();

		char upperletter = Character.toUpperCase(letter.charAt(0));
		
		
			switch (upperletter) {
			case 'A':
			case 'B':
			case 'C':
				System.out.print("The corresponding number is 2");
				break;
			case 'D':
			case 'E':
			case 'F':
				System.out.print("The corresponding number is 3");
				break;
			case 'G':
			case 'H':
			case 'I':
				System.out.print("The corresponding number is 4");
				break;
			case 'J':
			case 'K':
			case 'L':
				System.out.print("The corresponding number is 5");
			case 'M':
			case 'N':
			case 'O':
				System.out.print("The corresponding number is 6");
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				System.out.print("The corresponding number is 7");
				break;
			case 'T':
			case 'U':
			case 'V':
				System.out.print("The corresponding number is 8");
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				System.out.print("The corresponding number is 9");
				break;
				
			default:
				System.out.print(letter + " is an invalid input.");
			
			}
		
	}

}
