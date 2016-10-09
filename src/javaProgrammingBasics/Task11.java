package javaProgrammingBasics;

/**
 * Write a program that lists all perfect numbers between 6 and N, an upper limit entered by the user.
 * After you verify the program with a small number for N, gradually increase the value for N and see
 * how long the program takes to generate the perfect numbers. Since there are only a few perfect numbers,
 * you might want to display the numbers that are not perfect so you can easily tell that the program is
 * still running.
 */
public class Task11 {
    public static void main(String[] args) {
        printPerfetNumbers(10);
        printPerfetNumbers(100);
        printPerfetNumbers(1000);
        printPerfetNumbers(10000);
    }

    private static void printPerfetNumbers(int n) {
        System.out.printf("For N = %d\nPerfect numbers: ", n);
        long startTime = System.nanoTime();
        for (int i = 6; i < n; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + "\t");
            }
        }
        long endTime = System.nanoTime() - startTime;
        System.out.printf("\nTime: %d\n", endTime);
    }

    private static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
}
