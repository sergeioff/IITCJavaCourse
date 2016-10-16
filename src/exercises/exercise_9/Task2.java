package exercises.exercise_9;

/**
 * 2. Given an int n, return true if it is within 10 of 100 or 200.
 * Note: Math.abs(num) computes the absolute value of a number.
 * nearHundred(93) → true
 * nearHundred(90) → true
 * nearHundred(89) → false
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(189));
        System.out.println(nearHundred(191));
    }

    private static boolean nearHundred(int value) {
        return (Math.abs(100 - value) <= 10) || (Math.abs(200 - value) <= 10);
    }
}
