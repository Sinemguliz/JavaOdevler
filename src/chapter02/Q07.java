package chapter02;

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MINUTES_PER_DAY = 24 * 60;
		final int MINUTES_PER_YEAR = 365 * MINUTES_PER_DAY;

		System.out.print("Enter the number of minutes: ");
		int minute = input.nextInt();

		int year = minute / MINUTES_PER_YEAR;
		int day = (minute % MINUTES_PER_YEAR) / MINUTES_PER_DAY;

		System.out.println(minute + " minutes is approximately " + year + " years and " + day + " days");
	}
}
