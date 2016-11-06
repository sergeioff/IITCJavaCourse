package exercises.exercise_14.task3;

import java.util.Random;

/**
 * Write a program for inventory problem to illustrate the usage of synchronized keyword.
 * Note: The output should be similar  as mentioned below:
 * Thread1 Thread[test thread,5,main]
 * Thread2 Thread[test thread,5,main]
 * Quantity ordered :13
 * Quantity on hand :487
 * Total quantify taken away by way of order :13
 * Quantity ordered :91
 * Quantity on hand :396
 * Total quantify taken away by way of order :104
 */
public class Task3 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(400);
        Random random = new Random();

        Runnable makeOrderRunnable = () -> inventory.order(random.nextInt(100));

        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(makeOrderRunnable, "test runnable");
        }

        for (Thread thread : threads) {
            System.out.println(thread);
            thread.start();
        }
    }
}
