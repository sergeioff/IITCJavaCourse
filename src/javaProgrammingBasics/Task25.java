package javaProgrammingBasics;

import java.util.Scanner;

/**
 * Write a program that determines if an input word is a palindrome.
 * A palindrome is a string that reads the same forward and backward, for example, noon and madam.
 * Ignore the case of the letter. So, for example, maDaM, MadAm, and mAdaM are all palindromes.
 * Repeat the operation until an empty string is entered.
 */
public class Task25 {
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

            System.out.println("is palindrome: " + isPalindrome(inputLine));
        } while (inputLine.length() > 0);
    }

    private static boolean isPalindrome(String line) {
        line = line.toLowerCase();

        int length = line.length();

        for (int i = 0; i < length / 2; i++) {
            if (line.charAt(i) != line.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
