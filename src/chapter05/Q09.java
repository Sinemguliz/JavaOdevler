package chapter05;

import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		int highestScore = 0;
		String highestScoreName = "";
		int highestSecondScore = 0;
		String highestSecondScoreName = "";

		System.out.println("Enter each student’s name and score");

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Student: " + (i + 1) + "\nName: ");
			String name = input.next();
			int score = input.nextInt();

			if (score > highestScore) {

				highestSecondScore = highestScore;
				highestSecondScoreName = highestScoreName;

				highestScore = score;
				highestScoreName = name;
			} else if (score > highestSecondScore) {

				highestSecondScore = score;
				highestSecondScoreName = name;
			}
		}
		
		System.out.println("Student with the highest score: " + highestScoreName);
		System.out.println("The highest score is: " + highestScore);
		
		System.out.println("Student with the second highest score: " + highestSecondScoreName);
		System.out.println("The second highest score is: " + highestSecondScore);

	}

}
