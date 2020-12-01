package chapter05;

public class Q07 {
	public static void main(String[] args) {
		int tuition = 10000;
		int totalCost = 0;

		for (int year = 1; year < 15; year++) {
			tuition *= 1.05;
			if (year == 10)
				System.out.println("The tuition fee in ten year is $" + tuition);
			if (year > 10)
				totalCost += tuition;

		}

		System.out.print("Total cost for four years' worth of tuition after tenth year is $" + totalCost);

	}

}
