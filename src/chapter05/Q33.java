package chapter05;

public class Q33 {
	public static void main(String[] args) {
		
		for (int i = 2; i < 1_000_000_000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
		/*
		int perfectNumber;
		for (int i = 2; i <= 10; i++) {
			boolean isPerfect = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPerfect = false;
					break;
				}
			}
			if (isPerfect) {
				perfectNumber = (int) (Math.pow(2, (i - 1)) * (Math.pow(2, i) - 1));
				if (perfectNumber <= 10000) {
					System.out.println(perfectNumber);
				}
			}

		}
		*/
	}

}
