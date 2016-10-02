package introductionToJavaProgramming;

/**
 * Two Sum: Given an array of integers, return indices of the two numbers such that they add up to a
 * specific target.
 * You may assume that each input would have exactly one solution.
 */

public class Task15 {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 3, 2, 6, 7, 8, 1, 10, 12};
        int target = 15;

        int[] result = twoSum(numbers, target);

        for (int number : result) {
            System.out.print(number + " ");
        }
    }

    private static int[] twoSum(int[] numbers, int target) {
        int[] result = {-1, -1};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = numbers[i];
                    result[1] = numbers[j];

                    return result;
                }
            }
        }

        return result;
    }
}
