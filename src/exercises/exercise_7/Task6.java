package exercises.exercise_7;

import java.util.Scanner;

/**
 * Write a program in Java to make such a pattern like pyramid with number
 * which will repeat the number in a same row. 
 *     1
 *    2 2
 *   3 3 3
 *  4 4 4 4
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lastLineLength = 0;

        if (n < 10) {
            lastLineLength = n + n - 1;
        } else if (n >= 10) {
            lastLineLength = n * 2 + n - 1;
        }

        System.out.println(lastLineLength);

        for (int i = 1; i <= n; i++) {
            int spaces = (lastLineLength - (i + i - 1)) / 2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
