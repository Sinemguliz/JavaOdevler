package chapter05;

public class Q05 {
	public static void main(String[] args) {
		System.out.println("Kilograms\t\tPounds\t\t|\tPounds\t\tKilograms");

		for (int kg = 1, pounds2 = 20; kg < 200 && pounds2 < 516; kg += 2, pounds2 += 5) {

			double pounds1 = kg * 2.2;
			double kg2 = pounds2 / 2.2;
			System.out.printf("%d\t\t\t%.2f\t\t|\t%d\t\t%.2f\n", kg, pounds1, pounds2, kg2);

		}

	}
}
