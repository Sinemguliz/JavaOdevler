package Chapter04;
/* *4.2 (Geometry: great circle distance) The great circle distance is the distance between
two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
latitude and longitude of two points. The great circle distance between the two
points can be computed using the following formula:
d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Write a program that prompts the user to enter the latitude and longitude of two
points on the earth in degrees and displays its great circle distance. The average
radius of the earth is 6,371.01 km. Note you need to convert the degrees into radians
using the Math.toRadians method since the Java trigonometric methods use
radians. The latitude and longitude degrees in the formula are for north and west.
Use negative to indicate south and east degrees. Here is a sample run: */

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double latitude1 = sc.nextDouble();
		double longitude1 = sc.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double latitude2 = sc.nextDouble();
		double longitude2 = sc.nextDouble();

		double d = 6371.01 * Math.acos((Math.sin(Math.toRadians(latitude1)) * Math.sin(Math.toRadians(longitude1)))
				+ (Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(longitude1))
						* Math.cos(Math.toRadians(longitude2) - Math.toRadians(latitude2))));
		System.out.printf("The distance between the two points is %f km.%n", d);
	}
}
