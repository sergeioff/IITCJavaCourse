package exercises.exercise_14;

/**
 * Create a multithreaded program by using Runnable interface and then create,
 * initialize and start three Thread objects from your class.
 * The threads will execute concurrently and display the following String array elements.
 *
 * <code>String course [ ] = {“Java”, “J2EE”, “Spring”, “Android”};</code>
 */
public class Task2 {
    private static final String course[] = {"Java", "J2EE", "Spring", "Android"};
    private static final int THREADS_COUNT = 10;

    public static void main(String[] args) {
        Runnable printSubjectsFromCourse = () -> {
            for (String subject : course) {
                String currentThreadName = Thread.currentThread().getName();
                System.out.println(currentThreadName + "\t" + subject);
            }
        };

        Thread[] threads = new Thread[THREADS_COUNT];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(printSubjectsFromCourse, "Thread #" + i);
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }
}
