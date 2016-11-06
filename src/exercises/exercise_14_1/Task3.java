package exercises.exercise_14_1;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * To make things even more interesting, you should try a new technique for combining the results from
 * all the tasks: Use two queues in your program. Use a queue of tasks, as usual, to hold the tasks that
 * will be executed by the thread pool. But also use a queue of results produced by the threads.
 * When a task completes, the result from that task should be placed into the result queue.
 * The main program can read results from the second queue as they become available,
 * and combine all the results to get the final answer. The result queue will have to be a blocking queue,
 * since the main program will have to wait for results to become available. Note that the main program
 * knows the exact number of results that it expects to read from the queue, so it can do so in a for loop;
 * when the for loop completes, the main program knows that all the tasks have been executed.
 *
 * Hint: use a ConcurrentLinkedQueue for the task queue and a LinkedBlockingQueue for the result queue.
 */
public class Task3 {
    public static void main(String[] args) {
        final int LEFT_BOUND = 1;
        final int RIGHT_BOUND = 100_000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of threads:");
        int numberOfThreads = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        Queue<Integer> taskQueue = new ConcurrentLinkedQueue<>();

        for (int i = LEFT_BOUND; i <= RIGHT_BOUND; i++) {
            taskQueue.add(i);
        }

        Thread[] threads = new Thread[numberOfThreads];

        Queue<Result> resultsQueue = new LinkedBlockingQueue<>();

        Runnable processNumber = () -> {
            while (taskQueue.size() > 0) {
                int numberToProcess = taskQueue.poll();
                int numOfDivisors = getNumberOfDivisors(numberToProcess);
                resultsQueue.add(new Result(numberToProcess, numOfDivisors));
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

        int maxElement = 1;
        int maxNumberOfDivisors = 1;

        for (Result result : resultsQueue) {
            if (result.numberOfDivisors > maxNumberOfDivisors) {
                maxNumberOfDivisors = result.numberOfDivisors;
                maxElement = result.number;
            }
        }

        System.out.println(maxElement);

        long endTime = System.currentTimeMillis();

        System.out.println("Time: " + (endTime - startTime));
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

    private static class Result {
        int number;
        int numberOfDivisors;

        Result(int number, int numberOfDivisors) {
            this.number = number;
            this.numberOfDivisors = numberOfDivisors;
        }
    }
}
