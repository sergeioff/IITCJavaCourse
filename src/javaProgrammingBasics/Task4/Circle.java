package javaProgrammingBasics.Task4;

/**
 * Write a program that computes the area of a circular region. Given the radii of the inner and the outer circles.
 * We compute the area of the circular region by subtracting the area of the inner circle from the area of
 * the outer circle. Deﬁne a Circle class that has methods to compute the area and circumference.
 * You set the circle’s radius with the setRadius method or via a constructor.
 */

class Circle {
    private double innerRadius;
    private double outerRadius;

    Circle(double innerRadius, double outerRadius) {
        checkRadius(innerRadius, outerRadius);
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
    }

    void setInnerRadius(double innerRadius) {
        checkRadius(innerRadius, outerRadius);
        this.innerRadius = innerRadius;
    }

    void setOuterRadius(double outerRadius) {
        checkRadius(innerRadius, outerRadius);
        this.outerRadius = outerRadius;
    }

    private void checkRadius(double innerRadius, double outerRadius) {
        if (innerRadius >= outerRadius) {
            throw new IllegalArgumentException("Outer radius must be greater than inner radius");
        }
    }

    double getInnerArea() {
        return Math.PI * innerRadius * innerRadius;
    }

    double getOuterArea() {
        return Math.PI * outerRadius * outerRadius;
    }

    double getCircularArea() {
        return getOuterArea() - getInnerArea();
    }

    double getInnerCircumference() {
        return 2 * Math.PI * innerRadius;
    }

    double getOuterCircumference() {
        return 2 * Math.PI * outerRadius;
    }
}
