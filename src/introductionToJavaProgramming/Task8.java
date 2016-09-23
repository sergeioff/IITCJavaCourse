package introductionToJavaProgramming;

import java.util.Scanner;

/**
 * Task:
 * Write a program to convert centimeters (input) to feet and inches (output). 
 * 1 inch = 2.54 cm.
 */

public class Task8 {
	public static void main(String[] args) {
		final double INCH = 2.54;
		final double FEET = 30.48;
		
		Scanner scanner = new Scanner(System.in);
		double valueInCentimeters = scanner.nextDouble();
		
		double valueInInches = 1 / INCH * valueInCentimeters;
		double valueInFeets = 1 / FEET * valueInCentimeters;
		
		System.out.printf("%.2f centimeters in inches = %f\n", valueInCentimeters, valueInInches);
		System.out.printf("%.2f centimeters in feets = %f\n", valueInCentimeters, valueInFeets);
		
		scanner.close();
	}
}
