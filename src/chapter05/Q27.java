package chapter05;

public class Q27 {
	public static void main(String[] args) {
		System.out.println("All the leap years from 101 to 2100:");
		int count = 0;
		for (int year = 101; year <= 2100; year++) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				count++;
				if (count % 10 != 0)
				System.out.print(" " + year);
				else
					System.out.println();
			}
		}
		System.out.println();

	}

}
