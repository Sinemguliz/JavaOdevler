package chapter05;

public class Q15 {
	public static void main(String[] args) {
		char exclamationMark = '!';
		char tilda = '~';
		int count = 0;
		for (char i = exclamationMark ; i <= tilda; i++) {
			System.out.print(i + " ");
			count++;
			if (count % 10 == 0)
				System.out.println();
		}
	}

}
