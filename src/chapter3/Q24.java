package chapter3;

// Question 3.24
public class Q24 {
	public static void main(String[] args) {
		int r = (int) (Math.random() * 52);
		
		String suit = "";
		if (r / 13 == 0) {
			suit = "Clubs";
		} else if (r / 13 == 1) {
			suit = "Diamonds";
		} else if (r / 13 == 2) {
			suit = "Hearts";
		} else if (r / 13 == 3) {
			suit = "Spades";
		}  
		
		String rank = "";
		switch (r % 13) {
		case 1: rank = "Ace"; break;
		case 11: rank = "Jack"; break;
		case 12: rank = "Queen"; break;
		case 13: rank = "King"; break;
		default: rank = r % 13 + "";

		}
		
		System.out.println("The card you picked is " + rank + " " + suit);
		/*
		if (r / 13 == 0) {
			if (r <= 10 && r > 1) {
				System.out.println("The card you picked is " + r + " Clubs");
			}
			if (r == 1) {
				System.out.println("The card you picked is Ace Clubs");
			}
			if (r == 11) {
				System.out.println("The card you picked is Jack Clubs");
			}
			if (r == 12) {
				System.out.println("The card you picked is Queen Clubs");
			}
			if (r == 13) {
				System.out.println("The card you picked is King Clubs");
			}
		} else if (r / 13 == 1) {
			int m = r % 13;
			if (m <= 10 && m > 1) {
				System.out.println("The card you picked is " + m + " Diamonds");
			}
			if (m == 1) {
				System.out.println("The card you picked is Ace Diamonds");
			}
			if (m == 11) {
				System.out.println("The card you picked is Jack Diamonds");
			}
			if (m == 12) {
				System.out.println("The card you picked is Queen Diamonds");
			}
			if (m == 13) {
				System.out.println("The card you picked is King Diamonds");

			}

		} else if (r / 13 == 2) {
			int n = r % 13;
			if (n <= 10 && n > 1) {
				System.out.println("The card you picked is " + n + " Hearts");
			}
			if (n == 1) {
				System.out.println("The card you picked is Ace Hearts");
			}
			if (n == 11) {
				System.out.println("The card you picked is Jack Hearts");
			}
			if (n == 12) {
				System.out.println("The card you picked is Queen Hearts");
			}
			if (n == 13) {
				System.out.println("The card you picked is King Hearts");

			}
		} else if (r / 13 == 3) {
			int a = r % 13;
			if (a <= 10 && a > 1) {
				System.out.println("The card you picked is " + a + " Spades");
			}
			if (a == 1) {
				System.out.println("The card you picked is Ace Spades");
			}
			if (a == 11) {
				System.out.println("The card you picked is Jack Spades");
			}
			if (a == 12) {
				System.out.println("The card you picked is Queen Spades");
			}
			if (a == 13) {
				System.out.println("The card you picked is King Spades");

			}
		}
		*/
	}
}
