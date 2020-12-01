package chapter05;

public class Q10 {
	public static void main(String[] args) {

		int count = 0;
		for (int i = 100; i <= 1000; i++) {
			int modForFive = i % 5;
			int modForSix = i % 6;
			if (modForFive == 0 && modForSix == 0) {
				System.out.print(i + " ");
				
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
		}
	}

}