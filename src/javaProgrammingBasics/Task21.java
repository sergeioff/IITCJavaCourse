package javaProgrammingBasics;

import java.util.Scanner;

/**
 * Write a program that prints the number of uppercase letters in an input string.
 * Use the class method isUpperCase of the Character class, which returns true if the passed
 * parameter of type char is an uppercase letter. You need to explore the Character class from the java.lang
 * package on your own. Repeat the operation until an empty string is entered.
 */
public class Task21 {
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
            if (Character.isUpperCase(currentChar)) {
                countOfUppercaseLetters++;
            }
        }

        return countOfUppercaseLetters;
    }
}
