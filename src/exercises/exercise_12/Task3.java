package exercises.exercise_12;

/**
 * Write a generic method to exchange the positions of two different elements in an array.
 */
public class Task3 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        swapElements(numbers, 0, 4);
        printArray(numbers);

        String[] strings = {"one", "two", "three", "four", "five"};
        swapElements(strings, 0, 4);
        printArray(strings);
    }

    private static <T> void swapElements(T[] arr, int firstPosition, int secondPosition) {
        T temp = arr[firstPosition];
        arr[firstPosition] = arr[secondPosition];
        arr[secondPosition] = temp;
    }

    private static <T> void printArray(T[] arr) {
        for (T el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}