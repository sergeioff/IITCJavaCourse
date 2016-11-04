package exercises.exercise_14_1.task1;

import java.util.Scanner;

/**
 * Find the integer in the range 1 to 100000 that has the largest number of divisors.
 * Write a program that uses multiple threads to solve problem.
 * By using threads, your program will take less time to do the computation when it is
 * run on a multiprocessor computer. At the end of the program, output the elapsed time,
 * the integer that has the largest number of divisors, and the number of divisors that it has.
 */
public class Task1 {
    public static void main(String[] args) {
        int leftBound = 1;
        int rightBound = 100_000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of threads:");

        int threadsCount = scanner.nextInt();

        int increment = rightBound / threadsCount;

        long startTime = System.currentTimeMillis();

        CountDivisorsThread[] threads = new CountDivisorsThread[threadsCount];

        for (int i = 0; i < threadsCount; i++) {
            int newRightBound = leftBound + increment;

            if (newRightBound > rightBound) {
                newRightBound = rightBound;
            }

            threads[i] = new CountDivisorsThread(leftBound, newRightBound);
            leftBound += increment + 1;
        }

        for (int i = 0; i < threadsCount; i++) {
            threads[i].start();
        }

        for (int i = 0; i < threadsCount; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int result = threads[0].getResult();
        int numOfDivisors = getNumberOfDivisors(result);
        for (int i = 1; i < threadsCount; i++) {
            int currentNumber = threads[i].getResult();
            int currentNumOfDivisors = getNumberOfDivisors(currentNumber);

            if (currentNumOfDivisors > numOfDivisors) {
                numOfDivisors = currentNumOfDivisors;
                result = currentNumber;
            }
        }

        System.out.println(result);

        long endTime = System.currentTimeMillis();

        System.out.println("Time: " + (endTime - startTime));
    }

    static int getNumberOfDivisors(int number) {
        int numberOfDivisors = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numberOfDivisors++;
            }
        }

        return numberOfDivisors;
    }
}
