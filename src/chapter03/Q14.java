package chapter03;

import java.util.Random;
import java.util.Scanner;

/*(Game: heads or tails) Write a program that lets the user guess whether the flip of
a coin results in heads or tails. The program randomly generates an integer 0 or 1,
which represents head or tail. The program prompts the user to enter a guess, and
reports whether the guess is correct or incorrect.*/
public class Q14 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Random random = new Random();
		int flip = random.nextInt(2);
		// System.out.println(coin_flip);
		System.out.print("Coin flip.  Enter 1 for heads, 0 for tails: ");
		int guess = in.nextInt();

		if (guess == flip)
			System.out.println("Correct!");

		else
			System.out.println("Sorry, incorrect.");

	}
}
