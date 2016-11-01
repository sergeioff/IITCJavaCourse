package exercises.exercise_12;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println(findFirstGreaterThan(numbers, 5));
    }

    private static <T extends Comparable<T>> int findFirstGreaterThan(List<T> list, T element) {
        int currentIdx = 0;
        for (T el : list) {
            if (el.compareTo(element) > 0) {
                return currentIdx;
            }
            currentIdx++;
        }

        return -1;
    }
}
