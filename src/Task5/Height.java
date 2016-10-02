package Task5;

/**
 * Write a program that displays the recommended weight (kg), given the user’s age and height (cm).
 * The formula for calculating the recommended weight is
 * recommendedWeight = (height - 100 + age / 10) * 0.90
 * Deﬁne a service class named Height and include an appropriate method for getting a recommended
 * weight of a designated height.
 */

public class Height {
    static double getRecommendedWeight(int height, int age) {
        return (height - 100 + age / 10) * 0.9;
    }

    public static void main(String[] args) {
        System.out.println(getRecommendedWeight(170, 50));
    }
}
