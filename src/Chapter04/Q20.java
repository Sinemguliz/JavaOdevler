package Chapter04;

import java.util.Scanner;

public class Q20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a sting: ");
		String str = input.nextLine();

		System.out.println(str + " has a length of " + str.length() + " and its first character is " + str.charAt(0));
	}

}
