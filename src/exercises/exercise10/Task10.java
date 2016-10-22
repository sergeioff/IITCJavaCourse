package exercises.exercise10;

import java.util.Scanner;

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
