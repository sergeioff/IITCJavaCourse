package introductionToJavaProgramming;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Task:
 * Write a program to display today’s date in this format: 10 December 2008. 
 * Use the console window for output.
 */

public class Task3 {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

		System.out.println(currentDate.format(formatter));
	}
}
