package javaProgrammingBasics.Task2;

/**
 * Test class for Temperature
 * @see Temperature
 */
public class Task2 {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();

        double temperatureToSet = 50;

        temperature.setFahrenheit(temperatureToSet);
        System.out.println("Temperature in fahrenheit: " + temperature.toFahrenheit());

        double valueInCelsius = temperature.toCelsius();
        System.out.printf("%.2f fahrenheit = %.2f celsius\n", temperatureToSet, valueInCelsius);

        temperature.setCelsius(valueInCelsius);

        System.out.printf("%.2f celsius = %.2f fahrenheit\n", valueInCelsius, temperature.toFahrenheit());
    }
}
