package chapter06;

import java.util.Iterator;

public class Q01 {
	public static int getPentagonalNumber(int n) {
		int pentagonalNumber = n * ((3 * n) - 1) / 2 ;
		return pentagonalNumber;
	}
	
	
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(getPentagonalNumber(i) + ", ");
			if (i % 10 == 0)
				System.out.println();
			
		}
	}

}
