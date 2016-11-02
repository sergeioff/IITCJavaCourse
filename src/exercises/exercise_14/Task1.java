package exercises.exercise_14;

/**
 * Write a program to create two threads.
 * In this class we have one constructor used to start the threads and run it.
 * Check whether these two threads are run or not.
 */
public class Task1 {
    public static void main(String[] args) {
        new Task1();
    }

    private Task1() {
        Thread firstThread = new MyThread();
        Thread secondThread = new Thread(new MyRunnable(), "Thread that implements Runnable");

        firstThread.start();
        secondThread.start();

        System.out.println(firstThread.isAlive());
        System.out.println(secondThread.isAlive());
    }

    private class MyThread extends Thread {
        MyThread() {
            super("Thread that extends Thread");
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from " + Thread.currentThread().getName());
            }
        }
    }

    private class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from " + Thread.currentThread().getName());
            }
        }
    }
}
