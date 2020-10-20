package chapter03;

import java.util.Scanner;

public class Q27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		

		if ( y > ((-y * (200 * 100)) / (-y * 200 -x * 100)) || x > ((-x * (200 * 100)) / (-y * 200 -x * 100)))
			System.out.print("The point is not in the triangle");
		else 
			System.out.print("The point is in the triangle");
			
	}
}
