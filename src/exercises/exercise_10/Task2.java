package exercises.exercise_10;

/**
 * 2. В теории вычислимости важную роль играет функция Аккермана A(m,n), определенная следующим образом:
 *              n + 1,                       m = 0;
 * A(m, n) = {  A(m - 1, 1),                 m > 0, n = 0;   }
 *              A(m - 1, A(m, n - 1)),       m > 0, n > 0.
 *
 * Даны два целых неотрицательных числа m и n, каждое в отдельной строке. Выведите A(m,n).
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(akkerman(1, 2));
        System.out.println(akkerman(3, 2));
        System.out.println(akkerman(1, 0));
        System.out.println(akkerman(3, 5));
    }

    private static int akkerman(int m, int n) {
        if (m == 0) {
            return  n + 1;
        }
        if (m > 0) {
            if (n == 0) {
                return akkerman(m - 1, 1);
            }
            if (n > 0) {
                return akkerman(m - 1, akkerman(m, n - 1));
            }
        }

        return -1;
    }
}
