package javaProgrammingBasics;

/**
 * Write a recursive method to compute the sum of the ﬁrst N positive integers.
 * Note: This is strictly for exercise. You should not write the real method recursively.
 */
public class Task13 {
    public static void main(String[] args) {
        System.out.println(sumTo(3));
        System.out.println(sumTo(5));
        System.out.println(sumTo(10));
    }

    private static int sumTo(int n) {
        if (n == 1) return n;
        return n + sumTo(n - 1);
    }
}
