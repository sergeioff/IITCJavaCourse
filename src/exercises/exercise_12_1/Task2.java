package exercises.exercise_12_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create a program and implement the following:
 * i.)   Write a program for copying an another collection (Ex: LinkedList) instance objects
 *       to existing ArrayList.
 * ii.)  And also write code for copying all the contents of ArrayList to an array.
 * iii.) And reverse ArrayList contents. You can reverse the contents by calling Collections.reverse() method.
 *       You have to pass ArrayList instance to this method, which reverses the content.
 * Hint: ArrayList is a resizable-array implementation of the List interface.
 * Implements all optional list operations, and permits all elements, including null.
 * In addition to implementing the List interface, this class provides methods to manipulate the size
 * of the array that is used internally to store the list. (This class is roughly equivalent to Vector,
 * except that it is unsynchronized.)
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            arrayList.add(i);
        }

        ArrayList<Integer> copyOfArrayList = copy(arrayList);

        System.out.println(copyOfArrayList);

        reverse(copyOfArrayList);

        System.out.println(copyOfArrayList);

        Object[] arrayFromArrayList = toArray(arrayList);

        for (Object number : arrayFromArrayList) {
            System.out.println(number);
        }
    }

    private static <T> ArrayList<T> copy(List<T> collection) {
        return new ArrayList<T>(collection);
    }

    private static Object[] toArray(ArrayList list) {
        return list.toArray();
    }

    private static void reverse(List list) {
        Collections.reverse(list);
    }
}
