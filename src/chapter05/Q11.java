package chapter05;

public class Q11 {
	public static void main(String[] args) {
		
		for (int count = 0, i = 100; i<=200; i++) {
			int modForFive = i % 5;
			int modForSix = i % 6;
			// if ((modForFive == 0 && modForSix != 0) || (modForSix == 0 && modForFive != 0)) {
			if (modForSix == 0 ^ modForFive == 0) {
				System.out.print(i + " ");
				
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
		}
	}

}
