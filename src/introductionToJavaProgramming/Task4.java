package introductionToJavaProgramming;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Task:
 * Repeat Exercise 3, but this time use this format: Monday December 10, 2008.
 * @see Task3
 */

public class Task4 {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy");
		System.out.println(currentDate.format(formatter));
	}
}
