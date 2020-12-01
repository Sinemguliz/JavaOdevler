package chapter05;

public class Q12 {
	public static void main(String[] args) {
		int number = 0;
		while (Math.pow(number,  2) <= 12000) {
			number++;
		}

		System.out.print("The smallest number that n^2 is greater than 12000: " + number);
	}

}
