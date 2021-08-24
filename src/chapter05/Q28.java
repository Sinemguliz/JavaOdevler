package chapter05;

import java.util.Scanner;

public class Q28 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the year: ");
		int year = input.nextInt();

		System.out.print("Please enter the first day of the year: ");
		int firstDay = input.nextInt();

		int daysInMonth = 0;

		for (int month = 1; month <= 12; month++) {
			switch (month) {

			case 1:
				System.out.print("January 1, " + year + " is ");
				daysInMonth = 31;

				break;

			case 2:
				System.out.print("February 1, " + year + " is ");
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
					daysInMonth = 29;
				else
					daysInMonth = 28;

				break;

			case 3:
				System.out.print("March 1, " + year + " is ");
				daysInMonth = 31;

				break;

			case 4:
				System.out.print("April 1, " + year + " is ");
				daysInMonth = 30;

				break;
			case 5:
				System.out.print("May 1, " + year + " is ");
				daysInMonth = 31;

				break;
			case 6:
				System.out.print("June 1, " + year + " is ");
				daysInMonth = 30;

				break;
			case 7:
				System.out.print("July 1, " + year + " is ");
				daysInMonth = 31;

				break;
			case 8:
				System.out.print("August 1, " + year + " is ");
				daysInMonth = 31;

				break;
			case 9:
				System.out.print("September 1, " + year + " is ");
				daysInMonth = 30;

				break;
			case 10:
				System.out.print("October 1, " + year + " is ");
				daysInMonth = 31;

				break;
			case 11:
				System.out.print("November 1, " + year + " is ");
				daysInMonth = 30;

				break;
			case 12:
				System.out.print("December 1, " + year + " is ");
				daysInMonth = 31;

				break;
			}


			String firstDayName = "";
			switch (firstDay) {
			case 0:
				firstDayName = "Sunday";
				break;
			case 1:
				firstDayName = "Monday";
				break;
			case 2:
				firstDayName = "Tuesday";
				break;
			case 3:
				firstDayName = "Wednesday";
				break;
			case 4:
				firstDayName = "Thursday";
				break;
			case 5:
				firstDayName = "Friday";
				break;
			case 6:
				firstDayName = "Saturday";
				break;
			}

			System.out.println(firstDayName);
			firstDay += daysInMonth;
			firstDay %= 7;
		}

	}

}
