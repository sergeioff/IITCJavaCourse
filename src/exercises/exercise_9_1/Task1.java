package exercises.exercise_9_1;

import java.util.Scanner;

/**
 * 1. The input contains N positive integers (N ≤ 10000).
 * Each of that numbers is not greater than 15000. This numbers are not necessarily
 * different (so it may happen that two or more of them will be equal).
 * Your task is to choose a few of given numbers (1 ≤ few ≤ N) so that the sum of chosen
 * numbers is multiple for N (i.e. N * k = (sum of chosen numbers) for some integer k).
 * Input
 * The first line of the input contains the single number N.
 * Each of next N lines contains one number from the given set.
 * Output
 * In case your program decides that the target set of numbers can not be found it should
 * print to the output the single number 0. Otherwise it should print the number of the chosen
 * numbers in the first line followed by the chosen numbers themselves (on a separate line each)
 * in arbitrary order.
 * If there are more than one set of numbers with required properties you should print to the output
 * only one (preferably your favorite) of them.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        process(numbers);
    }

    private static void process(int[] numbers) {
        int counter = 0;
        final int N = numbers.length;

        for (int number : numbers) {
            if (number % N == 0) {
                System.out.printf("%d %% %d == 0\n", number, N);
                counter++;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];

                if (sum % N == 0) {
                    System.out.printf("%d + %d %% %d == 0\n", numbers[i], numbers[j], N);
                    counter++;
                }
            }
        }

        System.out.println("Count: " + counter);
    }
}
