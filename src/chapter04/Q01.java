package chapter04;

import java.util.Scanner;

public class Q01 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length from the center to a vertex: ");
		double vertex = scan.nextDouble();
		
		 double side = 2 * vertex * Math.sin((Math.PI / 5));		 
		 double area = (5 * Math.pow(side, 2)) / (4 * Math.tan((Math.PI / 5)));
		 
		 System.out.printf("The area of the pentagon is %.2f", area);
	}
	
}
