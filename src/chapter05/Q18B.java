package chapter05;

import java.util.Scanner;

public class Q18B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines:");

		int n = input.nextInt();

		System.out.println("Pattern B");
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
