package exercises.exercise_10;

import java.util.Scanner;

/**
 * 1. Даны два целых числа A и В (каждое в отдельной строке).
 * Выведите все числа от A до B включительно, в порядке возрастания,
 * если A < B, или в порядке убывания в противном случае.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int A = scanner.nextInt();
        final int B = scanner.nextInt();

        printNumbers(A, B);
        printNumbersWithRecursion(A, B);
    }

    private static void printNumbers(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b ; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b ; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void printNumbersWithRecursion(int a, int b) {
        System.out.print(a + " ");
        if (a == b) {
            System.out.println();
            return;
        }
        if (a < b) {
            printNumbersWithRecursion(++a, b);
        } else {
            printNumbersWithRecursion(--a, b);
        }
    }
}
