package javaProgrammingBasics;

import javaProgrammingBasics.Task2.Temperature;

import java.util.Scanner;

/**
 * Using the Temperature class from Exercise 3.2, write a program that inputs temperature in
 * degrees Celsius and outputs the temperature in equivalent degrees Fahrenheit.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        Temperature temperature = new Temperature();
        temperature.setCelsius(celsius);

        System.out.printf("%.2f Celsius = %.2f Fahrenheit", celsius, temperature.toFahrenheit());
    }
}
