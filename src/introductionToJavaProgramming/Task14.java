package introductionToJavaProgramming;
import java.util.Scanner;

/**
 * Task:
 * The volume of a sphere is computed by the equation V = 4 / 3 * π * r ^ 3
 * Where V is the volume and r is the radius of the sphere. Write a program that computes 
 * the volume of a sphere with a given radius r. 
 */

public class Task14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter radius of the sphere: ");
		double radius = scanner.nextDouble();
		
		scanner.close();
		
		double volume = 4 / 3 * Math.PI * Math.pow(radius, 3);
		
		System.out.printf("Volume of the sphere with radius %.2f is %.2f", radius, volume);
	}
}
