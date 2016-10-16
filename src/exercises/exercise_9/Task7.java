package exercises.exercise_9;

/**
 * 7. Given 2 int values, return whichever value is nearest to the value 10,
 * or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
 * close10(8, 13) → 8
 * close10(13, 8) → 8
 * close10(13, 7) → 0
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
    }

    private static int close10(int firstValue, int secondValue) {
        int firstDiff = Math.abs(10 - firstValue);
        int secondDiff = Math.abs(10 - secondValue);

        if (firstDiff == secondDiff) return 0;
        return firstDiff < secondDiff ? firstValue : secondValue;
    }
}
