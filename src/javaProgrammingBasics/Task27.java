package javaProgrammingBasics;

import java.util.Scanner;

/**
 * Write a program that determines if an input sentence is a palindrome, for example,
 * A man, a plan, a canal, Panama!
 * You ignore the punctuation marks, blanks, and case of the letters.
 * Repeat the operation until an empty string is entered.
 */
public class Task27 {
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

            System.out.println(isPalindromeLine(inputLine));
        } while (inputLine.length() > 0);
    }

    private static boolean isPalindromeLine(String line) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);

            if (Character.isLetter(currentChar)) {
                stringBuilder.append(Character.toLowerCase(currentChar));
            }
        }

        int length = stringBuilder.length();

        for (int i = 0; i < length / 2; i++) {
            if (stringBuilder.charAt(i) != stringBuilder.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
