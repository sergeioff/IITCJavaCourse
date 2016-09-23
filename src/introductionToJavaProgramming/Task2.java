package introductionToJavaProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Task:
 * Input the user’s ﬁrst, middle, and last name as three separate strings 
 * and display the name in the order of the ﬁrst name, the middle initial, 
 * and the last name. Include the period after the middle initial. 
 * If the input strings are Wolfgang, Amadeus, and Mozart, for example, 
 * then the output would be Wolfgang A. Mozart. Use the console window for output.
 */

public class Task2 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter first name: ");
		String firstName = reader.readLine();
		
		System.out.print("Enter middle name: ");
		String middleName = reader.readLine();
		
		System.out.print("Enter last name: ");
		String lastName = reader.readLine();
		
		System.out.printf("%s %s. %s", firstName, middleName.charAt(0), lastName);
	}
}
