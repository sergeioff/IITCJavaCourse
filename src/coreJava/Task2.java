package coreJava;

import java.util.Random;

/**
 * Repeat exercise 1, using a two-dimensional array of double with 12 rows and each row
 * having 28, 30, or 31 columns.
 */
public class Task2 {
    private static double[][] temperatures;
    private static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        init();
        showTemperatures();
        System.out.println("Hottest day in year: " + getHottestDay());
        System.out.println("Coldest day in year: " + getColdestDay());

        System.out.println("Average temperatures of months: ");
        double[] averageTemperatures = getAverageTemperaturesOfMonths();

        for (int i = 0; i < averageTemperatures.length; i++) {
            System.out.printf("%s: %.1f\n", monthNames[i], averageTemperatures[i]);
        }

        System.out.println("Difference between the hottest and coldest days of months: ");
        double[] differences = getDifferenceBetweenHottestAndColdestDays();

        for (int i = 0; i < differences.length; i++) {
            System.out.printf("%s: %.1f\n", monthNames[i], differences[i]);
        }

        System.out.printf("Temperature of %s %d: %.1f\n", monthNames[2 - 1], 1, getTemperatureOf(2, 1));
        System.out.printf("Temperature of %s %d: %.1f\n", monthNames[12 - 1], 5, getTemperatureOf(12, 5));
    }

    static void init() {
        Random random = new Random();

        temperatures = new double[12][];

        for (int i = 0; i < daysInMonths.length; i++) {
            int daysInMonth = daysInMonths[i];

            temperatures[i] = new double[daysInMonth];
            for (int j = 0; j < daysInMonth; j++) {
                if (i <= 1 || i >= 9) {
                    temperatures[i][j] = random.nextInt(20) - 15;
                } else if (i >= 4 || i <= 7) {
                    temperatures[i][j] = random.nextInt(20) + 10;
                } else {
                    temperatures[i][j] = random.nextInt(15);
                }
            }
        }
    }

    static void showTemperatures() {
        for (double[] monthTemperatures : temperatures) {
            for (double temperature : monthTemperatures) {
                System.out.print(temperature + " ");
            }
            System.out.println();
        }
    }

    static int getHottestDay() {
        double max = temperatures[0][0];
        int hottestDay = 0;

        int dayInYear = 0;

        for (double[] monthTemperatures : temperatures) {
            for (double temperature : monthTemperatures) {
                if (temperature > max) {
                    max = temperature;
                    hottestDay = dayInYear;
                }
                dayInYear++;
            }
        }

        return hottestDay;
    }

    static int getColdestDay() {
        double min = temperatures[0][0];
        int coldestDay = 0;

        int dayInYear = 0;

        for (double[] monthTemperatures : temperatures) {
            for (double temperature : monthTemperatures) {
                if (temperature < min) {
                    min = temperature;
                    coldestDay = dayInYear;
                }
                dayInYear++;
            }
        }

        return coldestDay;
    }

    static double[] getAverageTemperaturesOfMonths() {
        double[] temperaturesOfMonths = new double[12];

        int monthIdx = 0;

        for (double[] monthTemperatures : temperatures) {
            int averageForMonth = 0;

            for (double temp : monthTemperatures) {
                averageForMonth += temp;
            }

            averageForMonth /= monthTemperatures.length;

            temperaturesOfMonths[monthIdx++] = averageForMonth;
        }

        return temperaturesOfMonths;
    }

    static double[] getDifferenceBetweenHottestAndColdestDays() {
        double[] differences = new double[12];

        for (int i = 0; i < differences.length; i++) {
            double hottest = temperatures[i][0];
            double coldest = temperatures[i][0];

            for (int j = 0; j < temperatures[i].length; j++) {
                double temp = temperatures[i][j];

                if (temp > hottest) {
                    hottest = temp;
                }
                if (temp < coldest) {
                    coldest = temp;
                }
            }

            differences[i] = hottest - coldest;
        }

        return differences;
    }

    static double getTemperatureOf(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            throw new IllegalArgumentException();
        }

        day--;
        month--;

        return temperatures[month][day];
    }
}
