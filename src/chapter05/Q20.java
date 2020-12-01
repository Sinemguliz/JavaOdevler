package chapter05;

public class Q20 {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 10 per line
		int number = 2; // A number to be tested for primeness
		int count = 0;

		//System.out.println("The first 50 prime numbers are \n");

		// Repeatedly find prime numbers
		while (number < 1000) {
			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?

			// Test if number is prime
			for (int divisor = 2; divisor < number; divisor++) {
				if (number % divisor == 0) { // If true, number is not prime
					isPrime = false; // Set isPrime to false
					break; // Exit the for loop
				}
			}

			// Print the prime number and increase the count
			if (isPrime) {
				System.out.printf("%4d ", number);
				
				count++; // Increase the count

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Print  the new line
					System.out.println();
				}
					
			}

			// Check if the next number is prime
			number++;
		}
	}

}
