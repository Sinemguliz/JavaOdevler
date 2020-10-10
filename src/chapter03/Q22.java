package chapter03;

import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 double x, y;
		 double distance;
		  
		 System.out.print("Enter the value of x and y:");
		 x = scan.nextDouble();
		 y = scan.nextDouble();
		  
		 distance = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
		  
		 if(distance <= 10) {
			 System.out.print("Point (" + x + ", " + y + ") is in the circle.");
		 } else {
			 System.out.print("Point (" + x + ", " + y + ") is not in the circle.");
		 }

}
}
