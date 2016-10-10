package javaProgrammingBasics;

import java.util.Scanner;

/**
 * Write a program that reads in a character and displays the character’s ASCII.
 * Accept the input as a string data and check the ﬁrst character.
 * Display an error message if more than one character is entered.
 * Repeat the operation until the symbol @ (ASCII 64) is entered.
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ascii = -1;

        do {
            System.out.print("Enter a character: ");
            String inputLine = scanner.nextLine();
            if (inputLine.length() == 1) {
                char character = inputLine.charAt(0);
                ascii = (int) character;
                System.out.printf("ascii for '%c' is %d\n", character, ascii);
            } else {
                System.err.println("Please enter only one character");
            }
        } while (ascii != 64);
    }
}
