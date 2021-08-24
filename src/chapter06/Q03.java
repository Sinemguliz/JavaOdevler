package chapter06;

import java.util.Scanner;

public class Q03 {
	public static int reverse(int number) {
		int reversed = 0;

        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
	}
	
	public static boolean isPalindrome(int number) {
		if (number  == reverse(number))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		System.out.print(isPalindrome(number));
	}


}
