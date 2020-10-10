package chapter03;
/* **3.4 (Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month names January, February, . . . , December
for the numbers 1, 2, . . . , 12, accordingly.*/
public class Q04 {
	public static void main(String[] args) {
		int m = (int) (Math.random() * 12);
		
	
		
		String month = "";
		switch (m % 12 + 1) {
		case 1: month = "January"; break;
		case 2: month = "Fab"; break;
		case 3: month = "March"; break;
		case 4: month = "April"; break;
		case 5: month = "May"; break;
		case 6: month = "June"; break;
		case 7: month = "July"; break;
		case 8: month = "Aug"; break;
		case 9: month = "Sep"; break;
		case 10: month = "Oc"; break;
		case 11: month = "Nov"; break;
		case 12: month = "Dec"; break;
		default: month = m % 12 + "";

		}
		System.out.println("As the month " + m + " is " + month);
}}