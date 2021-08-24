package chapter05;

public class Q40 {
	public static void main(String[] args) {
		int tails = 0;
		int heads = 0;
		for (int i = 0; i < 100_000_000; i++) {
			boolean head = Math.random() > 0.5;
			if (head)
				heads++;
			else
				tails++;
		}
		System.out.println("Heads: " + heads + " Tails: " + tails);
	}

}
