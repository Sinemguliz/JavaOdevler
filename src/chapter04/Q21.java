package chapter04;

import java.util.Scanner;

public class Q21 {
	public static void main(String[] args) {
		boolean isValid = true;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a SSN: ");
		String snn = input.nextLine();

		if (snn.length() != 11) {
			isValid = false;
		} else {
			if (snn.indexOf('-') != 3 && snn.indexOf('-') != 6)
				isValid = false;
			else {
				for (int i = 0; i < snn.length(); i++) {
					if (i == 3 || i == 6)
						continue;
					if (!Character.isDigit(snn.charAt(i))) {
						isValid = false;
						break;
					}
				}
			}

		}

		if (isValid)
			System.out.print(snn + " is a valid social security number");
		else
			System.out.print(snn + " is an invalid social security number");
	}

}
