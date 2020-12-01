package chapter05;

public class Q24 {
	public static void main(String[] args) {
		
		double sum = 0;
		for(double n = 1.0; n <= 97.0; n += 2) {
			sum += n / (n + 2);
		}
		System.out.print("Sum is: " + sum);
	}
		

}
