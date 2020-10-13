package chapter03;

/* 3.24 (Game: pick a card) Write a program that simulates picking a card from a deck
of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card. */
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
		case 1:
			rank = "Ace";
			break;
		case 11:
			rank = "Jack";
			break;
		case 12:
			rank = "Queen";
			break;
		case 13:
			rank = "King";
			break;
		default:
			rank = r % 13 + "";

		}

	}
}
