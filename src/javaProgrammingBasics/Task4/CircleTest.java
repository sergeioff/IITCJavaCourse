package javaProgrammingBasics.Task4;

/**
 * Test class for Circle
 * @see Circle
 */
public class CircleTest {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(200, 100);
        } catch (IllegalArgumentException e) {
            System.out.println("OK! Unable to create wrong object: " + e.getMessage());
        }

        Circle circle = new Circle(100, 200);

        System.out.println("Inner area: " + circle.getInnerArea());
        System.out.println("Outer area: " + circle.getOuterArea());
        System.out.println("Area of a circular region: " + circle.getCircularArea());
        System.out.println("Inner circumference: " + circle.getInnerCircumference());
        System.out.println("Outer circumference: " + circle.getOuterCircumference());
    }
}
