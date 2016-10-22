package exercises.exercise10;

import java.util.Scanner;

/**
 * 9. Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
 * Выведите все нечетные числа из этой последовательности, сохраняя их порядок.
 * В этой задаче нельзя использовать глобальные переменные и передавать какие-либо параметры
 * в рекурсивную функцию. Функция получает данные, считывая их с клавиатуры.
 * Функция не возвращает значение, а сразу же выводит результат на экран.
 * Основная программа должна состоять только из вызова этой функции.
 */
public class Task9 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readNumberAndPrintIfEven();
    }

    private static void readNumberAndPrintIfEven() {
        int number = scanner.nextInt();
        if (number == 0) return;

        if (number % 2 != 0) {
            System.out.println(number);
        }
        readNumberAndPrintIfEven();
    }
}
