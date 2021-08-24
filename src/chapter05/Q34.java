package chapter05;

import java.util.Scanner;

public class Q34 {
	public static void main(String[] args) {
		int userScore = 0;
		int computerScore = 0;

		Scanner scan = new Scanner(System.in);

		
		String computer = "";
		String user = "";

		while (Math.abs(computerScore - userScore) < 2) {
			int computerRandom = (int) (Math.random() * 3);
			
			System.out.print("scissor (0), rock (1), paper (2): ");
			int userChoise = scan.nextInt();

			switch (computerRandom) {
			case 0:
				computer = "scissor";
				break;
			case 1:
				computer = "rock";
				break;
			case 2:
				computer = "paper";
				break;
			}

			switch (userChoise) {
			case 0:
				user = "scissor";
				break;
			case 1:
				user = "rock";
				break;
			case 2:
				user = "paper";
				break;
			}

			if ((computerRandom == 0 && userChoise == 0) || (computerRandom == 1 && userChoise == 1)
					|| (computerRandom == 2 && userChoise == 2))
				System.out.println("The computer is " + computer + ". You are " + user + ". It is a draw");
			else if ((computerRandom == 0 && userChoise == 2) || (computerRandom == 2 && userChoise == 1)
					|| (computerRandom == 1 && userChoise == 0)) {
				System.out.println("The computer is " + computer + ". You are " + user + ". Computer won");
				computerScore++;
			} else {
				System.out.println("The computer is " + computer + ". You are " + user + ". You won");
				userScore++;
			}
		}
		
		System.out.println("Game over...");
		
		if (userScore > computerScore) 
			System.out.println("You win");
		else 
			System.out.println("Computer win");
	}
}
