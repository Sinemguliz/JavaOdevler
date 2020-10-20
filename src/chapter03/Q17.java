package chapter03;
import java.util.Scanner;

public class Q17 {
	public static void main(String[] args) {
		int computerRandom = (int) (Math.random() * 3);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userChoise = scan.nextInt();
		
		String computer = "";
		String user = "";
		
		switch(computerRandom) {
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
		
		switch(userChoise) {
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
		
		if ((computerRandom == 0 && userChoise == 0) || (computerRandom == 1 && userChoise == 1) || (computerRandom == 2 && userChoise == 2))
			System.out.print("The computer is " + computer + ". You are " + user + ". It is a draw" );
		else if ((computerRandom == 0 && userChoise == 2) || (computerRandom == 2  && userChoise == 1) || (computerRandom == 1 && userChoise == 0))
			System.out.print("The computer is " + computer + ". You are " + user + ". Computer won" );
		else
			System.out.print("The computer is " + computer + ". You are " + user + ". You won" );
	}
}
