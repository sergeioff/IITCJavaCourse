package javaProgrammingBasics;

/**
 * A perfect number is a positive integer that is equal to the sum of its proper divisors.
 * A proper divisor is a positive integer other than the number itself that divides the number
 * evenly (i.e., no remainder). For example, 6 is a perfect number because the sum of its proper
 * divisors 1, 2, and 3 is equal to 6. Eight is not a perfect number because 1+2+4 != 8 .
 * Write a program that accepts a positive integer and determines whether the number is perfect.
 * Also, display all proper divisors of the number. Try a number between 20 and 30 and another
 * number between 490 and 500.
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(8));
        System.out.println(isPerfectNumber(20));
        System.out.println(isPerfectNumber(22));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(30));
        System.out.println(isPerfectNumber(495));
    }

    private static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
}
