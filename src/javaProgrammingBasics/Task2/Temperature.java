package javaProgrammingBasics.Task2;

/**
 * Task 2:
 * Deﬁne a new class named Temperature. The class has two accessors—toFahrenheit and toCelsius—that
 * return the temperature in the speciﬁed unit and two mutators—setFahrenheit and setCelsius—that assign
 * the temperature in the speciﬁed unit. Maintain the temperature internally in degrees Fahrenheit.
 * Using this class, write a program that inputs temperature in degrees Fahrenheit and outputs the
 * temperature in equivalent degrees Celsius.
 */

public class Temperature {
    private double temperatureInFahrenheits;

    public double toFahrenheit() {
        return temperatureInFahrenheits;
    }

    public double toCelsius() {
        return (temperatureInFahrenheits - 32) * 5 / 9;
    }

    public void setFahrenheit(double value) {
        temperatureInFahrenheits = value;
    }

    public void setCelsius(double value) {
        temperatureInFahrenheits = value * 9 / 5 + 32;
    }
}
