package chapter05;

import java.util.Scanner;

public class Q41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		
		int count = 0;
		int max = 0;
		
		while (true) {
			int number = input.nextInt();
			
			if (number <= 0)
				break;
			
			if (number > max) {
				max = number;
				count = 1;
			} else if (number == max)
				count++;			
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
		
	}

}
