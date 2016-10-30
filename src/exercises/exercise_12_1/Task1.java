package exercises.exercise_12_1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a program to iterate through an ArrayList.
 * Hint: All of the collection classes provides iterator() method to
 * iterate through the collection. The iterator() method returns the Iterator object
 * through which you can access the collection elements in an order.
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }

        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
