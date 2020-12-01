package chapter05;

public class Q25 {
	public static void main(String[] args) {
		double sum = 0;
		double value = 10000.0;
		for (double i = 1; i <= (2 * value - 1); i += 2) {
			sum += 1 / i;
			i += 2;
			sum -= 1 / i;
		}
		double pi = 4 * sum;
		System.out.println("PI value 10000: " + pi);
		sum = 0;
		value = 20000.0;
		for (double i = 1; i <= (2 * value - 1); i += 2) {
			sum += 1 / i;
			i += 2;
			sum -= 1 / i;
		}
		pi = 4 * sum;
		System.out.println("PI value = 20000: " + pi);
		sum = 0;
		value = 100000.0;
		for (double i = 1; i <= (2 * value - 1); i += 2) {
			sum += 1 / i;
			i += 2;
			sum -= 1 / i;
		}
		pi = 4 * sum;
		System.out.println("PI value = 100000: " + pi);
	}

}
