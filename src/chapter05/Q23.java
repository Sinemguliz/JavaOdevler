package chapter05;

public class Q23 {
	public static void main(String[] args) {
		double rightToLeftSum = 0.0;
		for (int i = 50000; i >= 1; i--) {
			rightToLeftSum += 1.0 / i;
		}
		System.out.println("Computing from right to left " + rightToLeftSum);

		double leftToRightSum = 0.0;
		for (int i = 1; i <= 50000; i++) {
			leftToRightSum += 1.0 / i;
		}
		System.out.println("Computing from left to right " + leftToRightSum);

		double difference = rightToLeftSum - leftToRightSum;
		System.out.printf("difference is %2.30f", difference);
	}

}
