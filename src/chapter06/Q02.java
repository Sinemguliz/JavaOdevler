package chapter06;

import java.util.Scanner;

public class Q02 {
	
	public static int sumDigits(long n) {
		int digit = 0;
		int sum = 0;
		while (n > 9) {
			digit = (int) n % 10;
			n = n / 10;
			sum += digit;
			
			}
		return sum + (int) n;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		long n = input.nextLong();
		System.out.println(sumDigits(n));
	}

}
