package exercises.exercise_9;

/**
 * 10. Given two temperatures, return true if one is less than 0 and the other is greater than 100.
 * icyHot(120, -1) → true
 * icyHot(-1, 120) → true
 * icyHot(2, 120) → false
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(icyHot(120, -1));
        System.out.println(icyHot(-1, 120));
        System.out.println(icyHot(2, 120));
    }

    private static boolean icyHot(int firstTemperature, int secondTemperature) {
        return (firstTemperature < 0 && secondTemperature > 100) ||
                (secondTemperature < 0 && firstTemperature > 100);
    }
}
