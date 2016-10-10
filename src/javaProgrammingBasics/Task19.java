package javaProgrammingBasics;

import java.util.Scanner;

/**
 * Write a program that reads a sentence and prints out the sentence in reverse order using
 * the reverse method of the StringBuffer class. For example, the method will display
 *    ?uoy era woH
 *    for the input
 *    How are you?
 * Repeat the operation until an empty string is entered.
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        do {
            System.out.println("Enter a line:");
            line = scanner.nextLine();

            if (line.length() == 0) {
                return;
            }

            System.out.printf("Reversed line:\n%s\n", reverse(line));
        } while (line.length() > 0);
    }

    private static String reverse(String line) {
        return new StringBuffer(line).reverse().toString();
    }
}
