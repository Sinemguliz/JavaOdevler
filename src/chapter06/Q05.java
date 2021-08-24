package chapter06;

import java.util.Scanner;

public class Q05 {
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double min = 0;
		double max = 0;
		if (num1 > num2 && num1 > num3 && num2 > num3)
			System.out.println(num3 + "-" + num2 + "-" + num3);
		else if (num1 > num2 && num1 > num3 && num3 > num2)
			System.out.println(num2 + "-" + num3 + "-" + num3);			
		else if (num2 > num1 && num2 > num3 && num1 > num3) 
			System.out.println(num3 + "-" + num1 + "-" + num2);
		else if (num2 > num1 && num2 > num3 && num3 > num1) 
			System.out.println(num1 + "-" + num3 + "-" + num2);
		else if (num3 > num1 && num3 > num2 && num1 > num2)
			System.out.println(num1 + "-" + num2 + "-" + num3);
		else if (num3 > num1 && num3 > num2 && num2 > num1)
			System.out.println(num2 + "-" + num1 + "-" + num3);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		double number = input.nextDouble();
		System.out.println();
	}
		

}
