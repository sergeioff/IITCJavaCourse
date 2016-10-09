package javaProgrammingBasics;

import java.util.Scanner;

/**
 * There are 25 primes between 2 and 100, and there are 1229 primes between 2 and 10,000.
 * Write a program that inputs a positive integer N > 2 and displays the number of primes
 * between 2 and N (inclusive). Use the timing technique to show the amount of time it took to compute the result.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int counter = 0;

        long startTime = System.nanoTime();

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }

        long finalTime = System.nanoTime() - startTime;
        System.out.printf("There are %d prime numbers between 2 and %d\ntime: %dns", counter, N, finalTime);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
