package javaProgrammingBasics;

import java.util.Scanner;

/**
 * Write a method that returns the number of digits in an integer argument;
 * for example, 23,498 has ﬁve digits. Using this method, write a program that
 * repeatedly asks for input and displays the number of digits the input integer has.
 * Stop the repetition when the input value is negative
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        while (number > 0) {
            System.out.printf("There are %d digits in %d\n", numberOfDigits(number), number);
            System.out.print("Enter number: ");
            number = scanner.nextInt();
        }
    }

    private static int numberOfDigits(int number) {
        return Integer.toString(number).length();
    }
}
