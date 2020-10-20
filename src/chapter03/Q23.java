package chapter03;

import java.util.Scanner;

public class Q23 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		if ((x < 5 && x > -5) && (y < 2.5 && y > -2.5))
			System.out.print("Point (" + x + ", " + y + ") is in the rectangle");
		else
			System.out.print("Point (" + x + ", " + y + ") is not in the rectangle");
	}

}
