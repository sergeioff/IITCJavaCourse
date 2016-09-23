package introductionToJavaProgramming;
import java.util.Scanner;

/**
 * Task:
 * Write a program that accepts a person’s weight and displays the number of calories the person 
 * needs in one day. A person needs 19 calories per pound of body weight, so the formula expressed 
 * in Java is calories = bodyWeight * 19; 
 * (Note: We are not distinguishing between genders.)
 */

public class Task10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your weight in pounds: ");
		double bodyWeight = scanner.nextDouble();
		
		double caloriesNeeded = bodyWeight * 19;
		
		System.out.printf("You need %.0f calories in one day", caloriesNeeded);
		scanner.close();
	}
}
