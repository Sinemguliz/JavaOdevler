package chapter03;

public class Q16 {
	public static void main(String[] args) {
		// 0 <= a < 1 -> 0 <= a < 100 -> -50 <= a < 50
		double x = Math.random() * 100 - 50;
		double y = Math.random() * 200 - 100;
		System.out.printf("(%.2f, %.2f) is in rectangle", x, y);
	}

}
