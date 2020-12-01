package chapter05;

import java.util.Scanner;

public class Q18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");

		int n = input.nextInt();

		System.out.println("Pattern A");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d", j);
			}
			System.out.println();

		}

	}

}
