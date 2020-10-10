

import java.util.Scanner;

public class Q01QQ {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the miles: ");
		double mile = input.nextDouble();

		double km = 1.6 * mile;
		
		System.out.println("miles is " + mile + " kilometers " + km);
	}
}
