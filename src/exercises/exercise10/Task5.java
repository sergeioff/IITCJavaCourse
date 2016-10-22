package exercises.exercise10;

/**
 * 5. Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке,
 * разделяя их пробелами или новыми строками.
 * При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
 * Разрешена только рекурсия и целочисленная арифметика.
 */
public class Task5 {
    public static void main(String[] args) {
        printNumbersOf(10);
        printNumbersOf(155);
        printNumbersOf(1);
        printNumbersOf(0);
        printNumbersOf(123456789);
    }

    private static void printNumbersOf(int number) {
        System.out.print(number % 10 + " ");
        number /= 10;
        if (number != 0) {
            printNumbersOf(number);
        } else {
            System.out.println();
        }
    }
}
