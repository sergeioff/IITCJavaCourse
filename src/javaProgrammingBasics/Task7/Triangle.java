package javaProgrammingBasics.Task7;

/**
 * Deﬁne a class called Triangle that is capable of computing the perimeter and area of a triangle,
 * given its three sides a, b, and c, as shown below. Notice that side b is the base of the triangle.
 * Deﬁne a private method isValid to check the validity of three sides.
 * If any one of them is invalid, the methods getArea and getPerimeter will return the constant INVALID_DIMENSION.
 * Perimeter = a + b + c
 * Area = sqrt(s * (s - a) * (s - b) * (s - c))
 * where s = (a + b + c) / 2
 */

public class Triangle {
    private double sideA, sideB, sideC;
    private static final int INVALID_DIMENSION = -1;



    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private boolean isValid() {
        return ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideA > sideC));
    }

    public double getPerimeter() {
        if (!isValid()) {
            return INVALID_DIMENSION;
        }

        return sideA + sideA + sideC;
    }

    public double getArea() {
        if (!isValid()) {
            return INVALID_DIMENSION;
        }

        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s  - sideB) * (s - sideC));
    }
}
