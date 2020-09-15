package chapter02;
//Question 2.1 
import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
	System.out.println("Enter the miles: ");
	Scanner input = new Scanner(System.in);
	double mile = input.nextDouble();
	double km = 0;
	km = 1.6 * mile;
	System.out.println("miles is " + mile + " kilometers " + km );
	}
}
