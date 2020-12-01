package chapter05;

public class Q03 {
	public static void main(String[] args) {
		System.out.println("Kilograms\tPounds");

		for (int kg = 1; kg < 200; kg += 2) {
			double pounds = kg * 2.2;
			System.out.println(kg + "\t\t" + pounds);
		}
	}

}
