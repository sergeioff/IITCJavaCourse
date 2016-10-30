package exercises.exercise_10;

import java.util.Scanner;

/**
 * 10. Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
 * Определите наибольшее значение числа в этой последовательности.
 * В этой задаче нельзя использовать глобальные переменные и передавать какие-либо параметры в
 * рекурсивную функцию. Функция получает данные, считывая их с клавиатуры.
 * Функция возвращает единственное значение: максимум считанной последовательности.
 * Гарантируется, что последовательность содержит хотя бы одно число (кроме нуля).
 */
public class Task10 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getMaxNumberFromSequence());
    }

    private static int getMaxNumberFromSequence() {
        int firstNumber = scanner.nextInt();
        if (firstNumber == 0) return 0;

        int secondNumber = scanner.nextInt();
        int max = firstNumber > secondNumber ? firstNumber : secondNumber;

        if (secondNumber == 0) return max;
        int newMax = getMaxNumberFromSequence();

        return max > newMax ? max : newMax;
    }
}
