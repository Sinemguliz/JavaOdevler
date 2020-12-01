package chapter05;

public class Q33 {
	public static void main(String[] args) {
		int perfectNumber;
		for (int i = 2; i <= 10; i++) {
			int control = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					control = 1;
					break;
				}

			}
			if (control == 0) {
				perfectNumber = (int) (Math.pow(2, (i - 1)) * (Math.pow(2, i) - 1));
				if (perfectNumber <= 10000) {
					System.out.println(perfectNumber);
				}

			}

		}
	}

}
