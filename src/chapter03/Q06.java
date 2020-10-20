package chapter03;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter feet: ");
		double feet = input.nextDouble();

		// Prompt the user to enter height in inches
		System.out.print("Enter inches: ");
		double inch = input.nextDouble();

		final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
		final double METERS_PER_INCH = 0.0254; // Constant

		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double hightInMeters = (feet * 12 + inch) * METERS_PER_INCH;
		double bmi = weightInKilograms / Math.pow((hightInMeters), 2);

		// Display result
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}
