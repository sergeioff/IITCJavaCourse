package javaProgrammingBasics;

import java.util.Scanner;

/**
 * Redo Exercise 3.21 without using the Character class.
 * Hint: The ASCII of any uppercase letter will fall between 65 (code for ’A’) and 90 (code for ’Z’).
 */
public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine;

        do {
            System.out.println("Enter a line:");
            inputLine = scanner.nextLine();

            if (inputLine.length() == 0) {
                System.out.println("Bye!");
                return;
            }

            System.out.printf("There are %d uppercase letters in line\n", numberOfUppercaseLetters(inputLine));
        } while (inputLine.length() > 0);
    }

    private static int numberOfUppercaseLetters(String line) {
        int countOfUppercaseLetters = 0;

        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            if ((int) currentChar <= 90) {
                countOfUppercaseLetters++;
            }
        }

        return countOfUppercaseLetters;
    }
}
