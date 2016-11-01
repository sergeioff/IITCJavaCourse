package exercises.exercise_13;

import java.util.Random;
import java.util.Scanner;

/**
 * Write a program called MaxValue.java that finds the maximum value in an array of ints using 4 threads.
 * Your main should be similar as the one in SumThread example, though you should construct your array of
 * random numbers instead of increasing numbers.
 * You may assume in your threaded code that the array has at least 4 elements.
 */
public class MaxValue {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("Enter threads count: ");
        Scanner scanner = new Scanner(System.in);
        int threadsCount = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        WorkerThread[] threads = new WorkerThread[threadsCount];
        for (int i = 0; i < threadsCount; i++) {
            threads[i] = new WorkerThread(arr, i * arr.length / threadsCount, (i + 1) * arr.length / threadsCount);
            threads[i].start();
        }

        for (int i = 0; i < threadsCount; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int[] results = new int[threadsCount];

        for (int i = 0; i < threadsCount; i++) {
            results[i] = threads[i].getResult();
        }

        System.out.println(findMaxValue(results, 0, results.length));

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }

    static int findMaxValue(int[] arr, int startIdx, int stopIdx) {
        int max = arr[startIdx];

        for (int i = startIdx; i < stopIdx; i++) {
            int currentElement = arr[i];

            if (currentElement > max) {
                max = currentElement;
            }
        }

        return max;
    }
}
