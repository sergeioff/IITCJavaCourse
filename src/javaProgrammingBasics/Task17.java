package javaProgrammingBasics;

import javaProgrammingBasics.Task16.myutil.MealCard;

public class Task17 {
    public static void main(String[] args) {
        MealCard defaultMealCard = new MealCard(1);
        MealCard mealCard = new MealCard(2, 500);

        System.out.println(defaultMealCard);
        System.out.println(mealCard);

        defaultMealCard.addPoints(100);
        defaultMealCard.buySomething(300);

        mealCard.buySomething(400);

        System.out.println(defaultMealCard);
        System.out.println(mealCard);
    }
}
