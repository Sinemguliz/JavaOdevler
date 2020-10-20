package chapter03;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		double r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
		double r2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;

		if (discriminant == 0)
			System.out.println("The equation has one root " + r1);
		else if (discriminant < 0)
			System.out.println("The equation has no real roots.");
		else if (discriminant > 0)
			System.out.println("The equation has two roots " + r1 + r2);
	}
}
