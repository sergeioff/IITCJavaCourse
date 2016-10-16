package exercises.exercise_9;

/**
 * 5. We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 3 int values, return true if 1 or more of them are teen.
 * hasTeen(13, 20, 10) → true
 * hasTeen(20, 19, 10) → true
 * hasTeen(20, 10, 13) → true
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 13));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));
        System.out.println(hasTeen(20, 21, 22));
        System.out.println(hasTeen(3, 4, 5));
    }

    private static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        int[] ages = {firstAge, secondAge, thirdAge};

        for (int age : ages) {
            if (age >= 13 && age <= 19) return true;
        }

        return false;
    }
}
