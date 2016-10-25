package coreJava;

import java.util.Random;

/**
 * Declare an array of double of size 365 to store daily temperatures for one year.
 * Using this data structure, write a code fragment to ﬁnd
 * • The hottest and coldest days of the year.
 * • The average temperature of each month.
 * • The difference between the hottest and coldest days of every month.
 * • The temperature of any given day. The day is speciﬁed by two input values: month (1, . . . , 12)
 * and day (1, . . . , 31). Reject invalid input values (e.g., 13 for month and 32 for day).
 */
public class Task1 {
    private static int[] daysTemperatures = new int[365];
    private static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
                                          "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        init();
        showTemperatures();
        System.out.println("Hottest day in year: " + getHottestDay());
        System.out.println("Coldest day in year: " + getColdestDay());

        System.out.println("Average temperatures of months: ");
        int[] averageTemperatures = getAverageTemperaturesOfMonths();

        for (int i = 0; i < averageTemperatures.length; i++) {
            System.out.printf("%s: %d\n", monthNames[i], averageTemperatures[i]);
        }

        System.out.println("Difference between the hottest and coldest days of months: ");
        int[] differences = getDifferenceBetweenHottestAndColdestDays();

        for (int i = 0; i < differences.length; i++) {
            System.out.printf("%s: %d\n", monthNames[i], differences[i]);
        }

        System.out.printf("Temperature of %s %d: %d\n", monthNames[2 - 1], 1, getTemperatureOf(2, 1));
        System.out.printf("Temperature of %s %d: %d\n", monthNames[12 - 1], 5, getTemperatureOf(12, 5));
    }

    static void init() {
        Random random = new Random();

        int offset = 0;
        for (int i = 0; i < daysInMonths.length; i++) {
            for (int j = 0; j < daysInMonths[i]; j++) {
                if (i <= 1 || i >= 9) {
                    daysTemperatures[offset + j] = random.nextInt(20) - 15;
                } else if (i >= 4 || i <= 7) {
                    daysTemperatures[offset + j] = random.nextInt(20) + 10;
                } else {
                    daysTemperatures[offset + j] = random.nextInt(15);
                }
            }
            offset += daysInMonths[i];
        }
    }

    static void showTemperatures() {
        for (int temperature : daysTemperatures) {
            System.out.print(temperature + " ");
        }
        System.out.println();
    }

    static int getHottestDay() {
        int max = daysTemperatures[0];
        int hottestDay = 0;

        for (int i = 0; i < daysTemperatures.length; i++) {
            int dayTemp = daysTemperatures[i];
            if (dayTemp > max) {
                max = dayTemp;
                hottestDay = i;
            }
        }

        return hottestDay;
    }

    static int getColdestDay() {
        int min = daysTemperatures[0];
        int coldestDay = 0;

        for (int i = 0; i < daysTemperatures.length; i++) {
            int dayTemp = daysTemperatures[i];
            if (dayTemp < min) {
                min = dayTemp;
                coldestDay = i;
            }
        }

        return coldestDay;
    }

    static int[] getAverageTemperaturesOfMonths() {
        int[] temperatures = new int[12];

        int offset = 0;
        for (int i = 0; i < temperatures.length; i++) {
            int sumOfTemperatures = 0;

            int days = daysInMonths[i];

            for (int j = 0; j < days; j++) {
                sumOfTemperatures += daysTemperatures[offset + j];
            }

            temperatures[i] = sumOfTemperatures / days;
            offset += days;
        }

        return temperatures;
    }

    static int[] getDifferenceBetweenHottestAndColdestDays() {
        int[] differences = new int[12];

        int offset = 0;
        for (int i = 0; i < differences.length; i++) {
            int hottest = daysTemperatures[offset];
            int coldest = daysTemperatures[offset];

            int days = daysInMonths[i];

            for (int j = 0; j < days; j++) {
                int temp = daysTemperatures[offset + j];

                if (temp > hottest) {
                    hottest = temp;
                }
                if (temp < coldest) {
                    coldest = temp;
                }
            }

            differences[i] = hottest - coldest;
            offset += days;
        }

        return differences;
    }

    static int getTemperatureOf(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            throw new IllegalArgumentException();
        }

        day--;
        month--;

        int offset = 0;

        for (int i = 0; i < month; i++) {
            offset += daysInMonths[i];
        }

        return daysTemperatures[offset + day];
    }
}
