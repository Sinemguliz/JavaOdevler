package chapter03;
/* *3.8 (Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.*/
import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a>b && a>c && b>c) 
			System.out.println("the integers in non-decreasing order: " + a + " "+ b +" "+ c);
		if (a>b && a>c && c>b) 
			System.out.println("the integers in non-decreasing order: " + a +" " + c +" "+ b);
		else if (b>a && b>c && a>c)
			System.out.println("the integers in non-decreasing order: " + b +" "+ a +" " + c);
		else if (b>a && b>c && c>a)
			System.out.println("the integers in non-decreasing order: " + b +" "+ c +" " + a);
		else if (c>a && c>b && a>b)
			System.out.println("the integers in non-decreasing order: " + c +" "+ a+" " + b);
		else if (c>a && c>b && b>a)
			System.out.println("the integers in non-decreasing order: " + c + " "+ b+ " " + a);
	}

}
