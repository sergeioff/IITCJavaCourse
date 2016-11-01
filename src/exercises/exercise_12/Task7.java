package exercises.exercise_12;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a generic method to find the maximal element in the range [begin, end) of a list.
 */
public class Task7 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(1000);
        numbers.add(20);
        numbers.add(201);

        System.out.println(getMax(numbers, 0, 4));
        System.out.println(getMax(numbers, 2, 4));
    }

    private static  <T extends Comparable<T>> T getMax(List<T> list, int begin, int end) {
        T maxElement = list.get(begin);

        for (int i = begin; i < end; i++) {
            T currentElement = list.get(i);
            if (currentElement.compareTo(maxElement) > 0) {
                maxElement = currentElement;
            }
        }

        return maxElement;
    }
}
