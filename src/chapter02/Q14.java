package chapter02;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double inches = input.nextDouble();

		double kg = pounds * 0.45359237;
		double meters = inches * 0.0254;

		double BMI = kg / (meters * meters);
		System.out.print("BMI is " + BMI);
	}
}
