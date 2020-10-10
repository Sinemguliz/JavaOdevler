package chapter01;

public class Q11 {
public static void main(String[] args) {
    	
    	int time = 3600 * 24 * 365;  // bir yil kac second
		int born = time / 7;  
		int death = time / 13;  
		int immigrant = time / 45;  

		int current_population = 312032486;
		int population = born + immigrant - death;

		System.out.println("1. year population is : " + (current_population + population));
		System.out.println("2. year population is : " + (current_population + (population * 2)));
		System.out.println("3. year population is : " + (current_population + (population * 3)));
		System.out.println("4. year population is : " + (current_population + (population * 4)));
		System.out.println("5. year population is : " + (current_population + (population * 5)));
		
    }
}
