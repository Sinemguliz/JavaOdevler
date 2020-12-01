package chapter05;

public class Q06 {
	public static void main(String[] args) {
		System.out.println("Miles\t\tKilometers\t\t|\tKilometers\t\tMiles");

		for (int miles = 1, km2 = 20; miles < 11 && km2 < 66; miles++, km2 += 5) {

			double km1 = miles * 1.609;
			double miles2 = km2 / 1.609;
			System.out.printf("%d\t\t\t%.3f\t\t|\t%d\t\t\t%.3f\n", miles, km1, km2, miles2);
		}
	}
}
