package exercises.exercise_9;

/**
 * 1. Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 * diff21(19) → 2
 * diff21(10) → 11
 * diff21(21) → 0
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(41));
    }

    private static int diff21(int n) {
        int diff = Math.abs(21 - n);
        return n <= 21 ? diff : diff * 2;
    }
}
