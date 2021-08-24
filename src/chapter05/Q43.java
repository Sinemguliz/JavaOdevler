package chapter05;

public class Q43 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 7; i++) {
			count++;
			for (int j = 1; j <= 7; j++) {
				System.out.println(i + " " + j);
				count++;
			}

		}
		System.out.println(count);
	}

}
