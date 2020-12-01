package chapter05;

import java.util.Scanner;

public class Q19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number Of Lines : ");
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= (num - i); j++) {
				System.out.print("    ");
			}
			for (int j = 0; j < i; j++) {
				System.out.printf("%4d", (int) Math.pow(2, j));
			}
			for (int j = i - 2; j >= 0; j--) {
				System.out.printf("%4d", (int) Math.pow(2, j));
			}
			System.out.println();
		}
	}

}
