package exercises.exercise_12;

/**
 * Write a generic method to exchange the positions of two different elements in an array.
 */
public class Task3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};

        swapElements(arr, 0, 4);

        for (int num : arr) {
            System.out.println(num);
        }
    }

    private static <T> void swapElements(T[] arr, int firstPosition, int secondPosition) {
        T temp = arr[firstPosition];
        arr[firstPosition] = arr[secondPosition];
        arr[secondPosition] = temp;
    }
}