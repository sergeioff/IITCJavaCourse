package introductionToJavaProgramming;
import java.util.Scanner;

/**
 * Task:
 * A quantity known as the body mass index (BMI) is used to calculate the risk of 
 * weight-related health problems. BMI is computed by the formula
 * BMI = w / (h / 100.0) ^ 2
 * Where w is weight in kilograms and h is height in centimeters. A BMI of 
 * about 20 to 25 is considered “normal.” Write an application that accepts weight 
 * and height (both integers) and outputs the BMI.
 */

public class Task12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your weight: ");
		int weight = scanner.nextInt();
		
		System.out.print("Enter your height: ");
		int height = scanner.nextInt();
		
		double bodyMassIndex = weight / Math.pow(height / 100.0, 2);
		
		if (bodyMassIndex >= 20 && bodyMassIndex <= 25) {
			System.out.printf("Your BMI is normal (%.2f)", bodyMassIndex);
		} else {
			System.out.printf("Your BMI isn't normal (%.2f)", bodyMassIndex);
		}
		
		scanner.close();
	}
}
