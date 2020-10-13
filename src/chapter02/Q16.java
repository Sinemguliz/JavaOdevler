package chapter02;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the side ");
		double side = scan.nextDouble();
		
		double area = 3 * Math.pow(3, 0.5) / 2 * Math.pow(side, 2);

		System.out.print("The area of the hexagon is " + area);

	}
}
