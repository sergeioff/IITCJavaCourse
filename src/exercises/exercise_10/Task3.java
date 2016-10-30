package exercises.exercise_10;

/**
 * 3. Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки,
 * или слово NO в противном случае.
 * Операцией возведения в степень пользоваться нельзя!
 */
public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%d: %s\n", i, isPowerOf2(i) ? "YES" : "NO");
        }
    }

    private static boolean isPowerOf2(int n) {
        if (n <= 1) return false;
        if (n % 2 != 0) return false;
        else {
            n /= 2;
            if (n <= 1) return true;
            return isPowerOf2(n);
        }
    }
}
