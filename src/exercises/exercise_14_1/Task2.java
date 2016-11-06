package exercises.exercise_14_1;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * In the previous exercise, you divided up a large task into a small number of large pieces and created
 * a thread to execute each task. Because of the nature of the problem, this meant that some threads had much
 * more work to do than others -- it is much easier to find the number of divisors of a small number than it
 * is of a big number. A better approach is to break up the problem into a fairly large number of smaller problems. 
 *
 * Use a thread pool to execute the tasks: Each thread in the pool runs in a loop in which it repeatedly
 * takes a task from a queue and carries out that task. Implement a thread pool strategy for solving the
 * same maximum-number-of-divisors problem as in the previous exercise.
 *
 * @see exercises.exercise_14_1.task1.Task1
 */
public class Task2 {
    private static int maxElement = 1;
    private static int maxNumberOfDivisors = 1;

    public static void main(String[] args) {
        final int LEFT_BOUND = 1;
        final int RIGHT_BOUND = 100_000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of threads:");
        int numberOfThreads = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        Queue<Integer> queue = new ConcurrentLinkedQueue<>();

        for (int i = LEFT_BOUND; i <= RIGHT_BOUND; i++) {
            queue.add(i);
        }

        Thread[] threads = new Thread[numberOfThreads];

        Runnable processNumber = () -> {
            while (queue.size() > 0) {
                int numberToProcess = queue.poll();
                int numOfDivisors = getNumberOfDivisors(numberToProcess);
                if (numOfDivisors > maxNumberOfDivisors) {
                    setMaxElementAndDivisors(numberToProcess, numOfDivisors);
                }
            }
        };

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(processNumber);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(maxElement);

        long endTime = System.currentTimeMillis();

        System.out.println("Time: " + (endTime - startTime));
    }

    private synchronized static void setMaxElementAndDivisors(int maxElement, int maxDivisors) {
        Task2.maxElement = maxElement;
        Task2.maxNumberOfDivisors = maxDivisors;
    }

    private static int getNumberOfDivisors(int number) {
        int numberOfDivisors = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numberOfDivisors++;
            }
        }

        return numberOfDivisors;
    }
}
