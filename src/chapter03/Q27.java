package chapter03;

import java.util.Scanner;

public class Q27 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter a point's x- and y-coordinates:");
		  double x = input.nextDouble();
		  double y = input.nextDouble();
		  double y2 = -x / 2 + 100;
		
		 if ((y > 0) && (x > 0) && (x + 2*y < 200))
			 System.out.print("The point is in the triangle");
		  
		  else
			  System.out.print("The point is not in the triangle");
		  
	}
}
