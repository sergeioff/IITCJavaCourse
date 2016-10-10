package javaProgrammingBasics.Task16.myutil;

public class MealCard {
    private int studentId;
    private int points;

    public MealCard(int studentId, int points) {
        this.studentId = studentId;
        this.points = points;
    }

    public MealCard(int studentId) {
        this.studentId = studentId;
        this.points = 100;
    }

    public void addPoints(int points) {
        this.points += points;
        System.out.println("Added " + points + " points. Current value of points: " + this.points);
    }

    public void buySomething(int price) {
        if (points - price < 0) {
            System.err.println("Not enough points to buy this item");
        } else {
            points -= price;
            System.out.println("Ok! Remained " + points + " points");
        }
    }

    @Override
    public String toString() {
        return "MealCard {studentId: " + studentId + ", points: " + points + "};";
    }
}
