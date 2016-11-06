package exercises.exercise_14.task3;

/**
 * @see Task3
 */
class Inventory {
    private int quantityOnHand;
    private int quantityTotalOrdered;

    Inventory(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
        this.quantityTotalOrdered = 0;
    }

     synchronized void order(int quantity) {
        if (quantity > quantityOnHand) {
            throw new IllegalArgumentException();
        }

        quantityOnHand -= quantity;
        quantityTotalOrdered += quantity;

        System.out.println("Quantity ordered: " + quantity);
        System.out.println("Quantity on hand: " + quantityOnHand);
        System.out.println("Total quantity taken away by way of order: " + quantityTotalOrdered);
    }
}
