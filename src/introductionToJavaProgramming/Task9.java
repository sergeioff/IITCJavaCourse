package introductionToJavaProgramming;
import java.util.Scanner;

/**
 * Task:
 * Write a program that inputs temperature in degrees Celsius and prints out the 
 * temperature in degrees Fahrenheit. The formula to convert degrees Celsius to 
 * equivalent degrees Fahrenheit is Celsius = 5 / 9 * (Fahrenheit - 32)
 */

public class Task9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double temperatureInCelsius = scanner.nextDouble();
		
		double temperatureInFahrenheit = temperatureInCelsius * 9 / 5 + 32;
		
		System.out.printf("%.2f celsius = %.2f in fahrenheit", temperatureInCelsius, 
				temperatureInFahrenheit);
		
		scanner.close();
	}
}
