package javaProgrammingBasics;

import java.util.Scanner;

/**
 * Write a program that reads in a sentence and displays the count of individual vowels in the sentence.
 * Use any output routine of your choice to display the result in this format. Count only the lowercase vowels.
 * Repeat the operation until an empty string is entered.
 */
public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;

        do {
            System.out.println("Enter a line:");
            line = scanner.nextLine();

            if (line.length() == 0) {
                System.out.println("Bye!");
                return;
            }

            System.out.printf("There are %d vowels in line: %s\n", countVowels(line), line);
        } while (line.length() > 0);
    }

    private static int countVowels(String line) {
        int vowelsCount = 0;
        for (int i = 0; i < line.length(); i++) {
            char character = line.charAt(i);

            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}
