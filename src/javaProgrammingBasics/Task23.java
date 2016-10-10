package javaProgrammingBasics;

import java.util.Scanner;

/**
 * Write a program that reads a sentence and prints out the sentence with all uppercase letters
 * changed to lowercase and all lowercase letters changed to uppercase.
 * Repeat the operation until an empty string is entered.
 */
public class Task23 {
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

            System.out.println(changeCase(inputLine));
        } while (inputLine.length() > 0);
    }

    private static String changeCase(String line) {
        StringBuilder stringBuilder = new StringBuilder(line.length());

        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                stringBuilder.append(Character.toLowerCase(currentChar));
            } else {
                stringBuilder.append(Character.toUpperCase(currentChar));
            }
        }

        return stringBuilder.toString();
    }
}
