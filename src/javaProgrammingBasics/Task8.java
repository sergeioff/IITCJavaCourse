package javaProgrammingBasics;

import java.util.Scanner;

/**
 * Task:
 * A prime number is an integer greater than 1 and divisible by only itself and 1.
 * The ﬁrst seven prime numbers are 2, 3, 5, 7, 11, 13, and 17. Write a method that returns
 * true if its parameter is a prime number. Using this method, write a program that repeatedly asks
 * the user for input and displays Prime if the input is a prime number and Not Prime, otherwise.
 * Stop the repetition when the input is a negative number.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        while (number > 0) {
            if (isPrime(number)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }

            number = scanner.nextInt();
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
