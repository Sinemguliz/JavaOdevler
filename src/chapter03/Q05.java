package chapter03;

/* 3.5 (Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week.*/
import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter today's day:");
		int a = scan.nextInt();

		System.out.println("the number of days elapsed since today:");
		int b = scan.nextInt();

		String day = "";

		switch (a) {
		case 0:
			day = "Sunday";
			break;
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		default:
			day = a % 7 + "";
		}

		String day1 = "";

		switch ((a + b) % 7) {
		case 0:
			day1 = "Sunday";
			break;
		case 1:
			day1 = "Monday";
			break;
		case 2:
			day1 = "Tuesday";
			break;
		case 3:
			day1 = "Wednesday";
			break;
		case 4:
			day1 = "Thursday";
			break;
		case 5:
			day1 = "Friday";
			break;
		case 6:
			day1 = "Saturday";
			break;
		default:
			day1 = (a + b) % 7 + "";
		}

		System.out.println("Today is " + day + " and the future day is " + day1);
	}
}
