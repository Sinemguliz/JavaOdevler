package chapter03;

import java.util.Scanner;

public class Q21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: (e.g., 2012):");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12:");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: 1-31:");
		int theday = input.nextInt();

		if (month == 1 || month == 2) {
			month = month + 12;
			year = year - 1;
		}

		int century = year / 100;
		int yearofTheCentury = year % 100;
		int dayofTheWeek = (theday + 26 * (month + 1) / 10 + yearofTheCentury + yearofTheCentury / 4 + century / 4
				+ 5 * century) % 7;
		String day = "";

		switch (dayofTheWeek) {

		case 0:
			day = "Saturday";
			break;
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;

		}

		System.out.print("Day of the week is " + day);

	}

}
