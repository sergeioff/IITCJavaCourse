package exercises.exercise_10;

/**
 * 7. Дано натуральное число n>1. Выведите все простые множители этого числа
 * в порядке неубывания с учетом кратности. 
 */
public class Task7 {

    public static void main(String[] args) {
        printSimpleMultipliers(1463);
    }

    private static void printSimpleMultipliers(int number) {
        for (int i = 2; i <= number ; i++) {
            if (isPrime(i) && number % i == 0) {
                System.out.println(i);
                printSimpleMultipliers(number / i);
                break;
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
