package javaProgrammingBasics;

/**
 * Write a recursive method to compute the sum of the ﬁrst N positive odd integers.
 * Note: This is strictly for exercise. You should not write the real method recursively.
 */
public class Task14 {
    public static void main(String[] args) {
        System.out.println(sumOddNumbersTo(11));
    }

    private static int sumOddNumbersTo(int n) {
        if (n == 1) return n;
        if (n % 2 != 0) return n + sumOddNumbersTo(n - 1);
        return sumOddNumbersTo(n - 1);
    }
}
