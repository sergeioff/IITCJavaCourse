package javaProgrammingBasics.Task7;

/**
 * @see Triangle
 */

public class Task7 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 20, 13);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        Triangle invalidTriangle = new Triangle(100, 300, 10);
        System.out.println(invalidTriangle.getArea());
        System.out.println(invalidTriangle.getPerimeter());
    }
}
