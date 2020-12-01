package chapter05;

public class Q26 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		double e = 0;
		int numberOfIteration = 100000;
		double denominator = 1;
		for (double i = 1; i <= numberOfIteration; i++) {
			denominator *= i;
			e += 1 / denominator;
			System.out.println(denominator);
			if (i == 10000) {
				System.out.println("The e value for i = 10000: " + e);
			} else if (i == 20000) {
				System.out.println("The e value for i = 20000: " + e);
			}
		}
		System.out.println("The e value for i = 100000: " + e);
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time: " + (end - start));
	}
}
