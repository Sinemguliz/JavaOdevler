package chapter05;

public class Q04 {
	public static void main(String[] args) {
		System.out.println("Miles\tKilometers");

		for (int miles = 1; miles < 11; miles++) {
			double kilometers = miles * 1.609;
			System.out.println(miles + "\t\t" + kilometers);
		}
	}

}
