package exercises.exercise10;

/**
 * 4. Дано натуральное число N. Вычислите сумму его цифр.
 * При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(getSumOfNumbers(1237));
        System.out.println(getSumOfNumbers(00001));
        System.out.println(getSumOfNumbers(55));
        System.out.println(getSumOfNumbers(12));
    }

    private static int getSumOfNumbers(int number) {
        if (number == 0) return 0;
        return number % 10 + getSumOfNumbers(number / 10);
    }
}
