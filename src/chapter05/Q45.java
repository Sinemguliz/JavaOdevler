package chapter05;

import java.util.Scanner;

public class Q45 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double mean = 0;
		double deviation = 0;
		double number;
		System.out.print("Enter ten numbers: ");
		for (int i = 1; i <= 10; i++) {
			number = input.nextDouble();
			mean += number;
			deviation += Math.pow(number, 2); 
		}
		deviation =  Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / (10 - 1));
		mean /= 10;
		
		System.out.println("The mean is " + mean);
		System.out.printf("The standard deviation is %.5f", deviation);		
		
	}

}
