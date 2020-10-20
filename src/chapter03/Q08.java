package chapter03;

/* *3.8 (Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.*/
import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter 3 numbers:");

		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();

		if (number1 > number2 && number1 > number3 && number2 > number3)
			System.out.println("the integers in non-decreasing order: " + number1 + " " + number2 + " " + number3);
		else if (number1 > number2 && number1 > number3 && number3 > number2)
			System.out.println("the integers in non-decreasing order: " + number1 + " " + number3 + " " + number2);
		else if (number2 > number1 && number2 > number3 && number1 > number3)
			System.out.println("the integers in non-decreasing order: " + number2 + " " + number1 + " " + number3);
		else if (number2 > number1 && number2 > number3 && number3 > number1)
			System.out.println("the integers in non-decreasing order: " + number2 + " " + number3 + " " + number1);
		else if (number3 > number1 && number3 > number2 && number1 > number2)
			System.out.println("the integers in non-decreasing order: " + number3 + " " + number1 + " " + number2);
		else if (number3 > number1 && number3 > number2 && number2 > number1)
			System.out.println("the integers in non-decreasing order: " + number3 + " " + number2 + " " + number1);
	}

}
