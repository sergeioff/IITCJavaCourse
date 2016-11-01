package exercises.exercise_12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * Write a generic method to count the number of elements in a collection that have a specific
 * property (for example, odd integers, prime numbers).
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("aaa");
        strings.add("asdasdas");
        strings.add("bsdasdas");
        strings.add("bbb");
        strings.add("ddd");

        System.out.println(countMatchElements(strings, (s -> s.length() == 3)));
        System.out.println(countMatchElements(strings, (s -> s.startsWith("a"))));

        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }

        Predicate<Integer> oddPredicate = integer -> integer % 2 != 0;
        Predicate<Integer> primePredicate = number -> {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        };

        System.out.println(countMatchElements(numbers, oddPredicate));
        System.out.println(countMatchElements(numbers, primePredicate));
    }

    private static <T> long countMatchElements(Collection<T> collection, Predicate<T> predicate) {
        return collection.stream().filter(predicate).count();
    }
}
