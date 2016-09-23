package introductionToJavaProgramming;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Task:
 * Write a program that inputs the year a person is born and outputs the age of the person in 
 * the following format:  You were born in 1990 and will be (are) 26 this year.
 */

public class Task11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your year of birth: ");
		int yearOfBirth = scanner.nextInt();
		
		scanner.close();
		
		LocalDate currentDate = LocalDate.now();
		
		int age = currentDate.getYear() - yearOfBirth;
		
		System.out.printf("You were born in %d and will be (are) %d this year.",
				yearOfBirth, age);
	}
}
