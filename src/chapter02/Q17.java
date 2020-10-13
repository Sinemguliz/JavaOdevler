package chapter02;

import java.util.Scanner;

public class Q17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double fahrenheit = scan.nextDouble();

		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = scan.nextDouble();

		double windChillIndex = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed, 0.16)
				+ 0.4275 * fahrenheit * Math.pow(windSpeed, 0.16);

		System.out.print("The wind chill index is " + windChillIndex);
	}
}
