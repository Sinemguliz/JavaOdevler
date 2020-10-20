package chapter03;

/* 3.5 (Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week.*/
import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter today's day: ");
		int todayDay = scan.nextInt();

		System.out.print("Enter the number of days elapsed since today: ");
		int numberofDay = scan.nextInt();

		String today = "";

		switch (todayDay) {
		case 0:
			today = "Sunday";
			break;
		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		}

		String futureDay = "";

		switch ((todayDay + numberofDay) % 7) {
		case 0:
			futureDay = "Sunday";
			break;
		case 1:
			futureDay = "Monday";
			break;
		case 2:
			futureDay = "Tuesday";
			break;
		case 3:
			futureDay = "Wednesday";
			break;
		case 4:
			futureDay = "Thursday";
			break;
		case 5:
			futureDay = "Friday";
			break;
		case 6:
			futureDay = "Saturday";
			break;
		default:
			futureDay = (todayDay + numberofDay) % 7 + "";
		}

		System.out.println("Today is " + today + " and the future day is " + futureDay);
	}
}
