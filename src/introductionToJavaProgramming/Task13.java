package introductionToJavaProgramming;
import java.util.Scanner;

/**
 * Task:
 * If you invest P dollars at R percent interest rate compounded annually, in N years, 
 * your investment will grow to P * (1 + R / 100) ^ N dollars. Write an application that 
 * accepts P, R, and N and computes the amount of money earned after N years.
 */

public class Task13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter dollars: ");
		double dollars = scanner.nextDouble();
		
		System.out.print("Enter percent rate: ");
		double percentRate = scanner.nextDouble();
		
		System.out.print("Enter years: ");
		int years = scanner.nextInt();
		
		scanner.close();
		
		double result = dollars * Math.pow((1 + percentRate / 100), years);
		
		System.out.printf("You can earn $%.2f after %d years", result, years);
	}
}
