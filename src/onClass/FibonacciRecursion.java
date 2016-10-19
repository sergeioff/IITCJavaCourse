package onClass;

public class FibonacciRecursion {

    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fib(5));
        System.out.println(fib(4));
    }

    private static int fib(int n) {
        if (n <= 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
