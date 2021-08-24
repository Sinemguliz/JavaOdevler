package chapter05;

import java.util.Scanner;

public class Q29 {
	public static void main(String[] args) {
		System.out.print("Please enter the year: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();

		System.out.print("Please enter the first day of the year: ");
		int firstDay = input.nextInt();

		int daysInMonth = 0;

		for (int month = 1; month <= 12; month++) {

			switch (month) {

			case 1:
				System.out.println("          January  " + year);
				daysInMonth = 31;
				break;

			case 2:
				System.out.println("          February  " + year);
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
					daysInMonth = 29;
				else
					daysInMonth = 28;
				break;

			case 3:
				System.out.println("          March  " + year);
				daysInMonth = 31;
				break;

			case 4:
				System.out.println("          April  " + year);
				daysInMonth = 30;
				break;

			case 5:
				System.out.println("          May  " + year);
				daysInMonth = 31;
				break;

			case 6:
				System.out.println("          June  " + year);
				daysInMonth = 30;
				break;

			case 7:
				System.out.println("          July  " + year);
				daysInMonth = 31;
				break;

			case 8:
				System.out.println("          August  " + year);
				daysInMonth = 31;
				break;

			case 9:
				System.out.println("          September  " + year);
				daysInMonth = 30;
				break;

			case 10:
				System.out.println("          October  " + year);
				daysInMonth = 31;
				break;

			case 11:
				System.out.println("          November  " + year);
				daysInMonth = 30;
				break;

			case 12:
				System.out.println("          December  " + year);
				daysInMonth = 31;
			}
			System.out.println("-----------------------------");
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

			for (int i = 0; i < firstDay; i++) {
				System.out.printf("%4s", "");
			}

			for (int i = 1; i <= daysInMonth; i++) {
				System.out.printf("%4d", i);

				if ((i + firstDay) % 7 == 0)
					System.out.println();
			}
			
			firstDay = (firstDay + daysInMonth) % 7;
			
			System.out.println();
			System.out.println();

		}		
	}
}
