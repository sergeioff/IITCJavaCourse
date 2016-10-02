package javaProgrammingBasics;

import java.util.Scanner;

/**
 * Write a program that computes the total ticket sales of a concert. There are three types of
 * seatings: A, B, and C. The program accepts the number of tickets sold and the price of a ticket for
 * each of the three types of seats. The total sales are computed as follows:
 * totalSales = numberOfA_Seats * pricePerA_Seat +
 * numberOfB_Seats * pricePerB_Seat + numberOfC_Seats * pricePerC_Seat;
 * Write this program, using only one class, the main class of the program.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of sold tickets of seats type A: ");
        int numberOfA_Seats = scanner.nextInt();
        System.out.print("Enter price of ticket of seat type A: ");
        double pricePerA_Seat = scanner.nextDouble();

        System.out.print("Enter number of sold tickets of seats type B: ");
        int numberOfB_Seats = scanner.nextInt();
        System.out.print("Enter price of ticket of seat type B: ");
        double pricePerB_Seat = scanner.nextDouble();

        System.out.print("Enter number of sold tickets of seats type C: ");
        int numberOfC_Seats = scanner.nextInt();
        System.out.print("Enter price of ticket of seat type C: ");
        double pricePerC_Seat = scanner.nextDouble();

        double totalSales = numberOfA_Seats * pricePerA_Seat + numberOfB_Seats * pricePerB_Seat +
                numberOfC_Seats * pricePerC_Seat;

        System.out.println("Total sales: " + totalSales);
    }
}
