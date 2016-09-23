package introductionToJavaProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Task:
 * Write a program that accepts a word and prints out the middle character. 
 * The length of the input word is odd. For example, if the input is magniﬁcent, 
 * which has 11 characters, you output the sixth character f. You use the division 
 * operator /. This operator returns only the quotient. For example, 
 * the expression 10/4 would result in 2 (not 2.5).
 */

public class Task6 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String word = reader.readLine();
		
		System.out.println(word.charAt(word.length() / 2));
	}
}
