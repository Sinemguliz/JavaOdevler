package chapter05;

import java.util.Scanner;

public class Q17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int lines = sc.nextInt();
		
		for (int rows = 1; rows <= lines; rows++) {
			for(int space = lines - rows; space >=1; space--) {
				System.out.print("  ");
			}
			for (int decending = rows; decending >= 1; decending--) {
				System.out.print(decending + " ");
			}
			for (int ascending = 2; ascending <= rows; ascending++) {
				System.out.print(ascending + " ");
			}
			System.out.println();
		}
	}

}
