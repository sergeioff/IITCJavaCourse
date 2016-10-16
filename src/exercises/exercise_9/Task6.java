package exercises.exercise_9;

/**
 * 6. Return true if the given string begins with "mix", except the 'm' can be anything,
 * so "pix", "9ix" .. all count.
 * mixStart("mix snacks") → true
 * mixStart("pix snacks") → true
 * mixStart("piz snacks") → false
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
    }

    private static boolean mixStart(String line) {
        return line.indexOf("ix") == 1;
    }
}
