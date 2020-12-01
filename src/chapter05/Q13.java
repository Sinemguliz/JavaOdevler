package chapter05;

public class Q13 {
	public static void main(String[] args) {
		int number = 0;
		while (Math.pow(number,  3) <= 12000) {
			number++;
		}
		number--;
		
		System.out.print("The highest number that n^3 is less than 12000: " + number);
	}

}
