package introductionToJavaProgramming;

/**
 * Task:
 * Write Java expressions to compute each of the following. 
 * a. The square root of B^2 + 4AC (A and C are distinct variables) 
 * b. The square root of X+4Y^3
 * c. The cube root of the product of X and Y
 * d. The area of a circle
 */

public class Task7 {
	public static void main(String[] args) {
		final int B =2, A = 2, C = 3, X = 4, Y = 5, R = 6;
		
		double a = Math.sqrt(B * B + 4 * A * C);
		double b = Math.sqrt(X + 4 * Math.pow(Y, 3));
		double c = Math.cbrt(X * Y);
		double d = Math.PI * R * R;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
