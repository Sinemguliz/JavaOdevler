package Chapter04;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		String grade = scan.next();

		char upperletter = Character.toUpperCase(grade.charAt(0));

		if (!Character.isLetter(upperletter))
			System.out.print("invalid input");
		else {
			switch (upperletter) {
			case 'A':
				System.out.print("The numeric value for grade" + grade + "  is 4");
				break;
			case 'B':
				System.out.print("The numeric value for grade" + grade + "  is 3");
				break;
			case 'C':
				System.out.print("The numeric value for grade" + grade + "  is 2");
				break;
			case 'D':
				System.out.print("The numeric value for grade" + grade + "  is 1");
				break;
			case 'F':
				System.out.print("The numeric value for grade" + grade + "  is 0");
				break;
			default:
				System.out.print(grade + " is an invalid grade.");
			}

		}
	}

}
