package coreJava;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;

/**
 * Repeat Exercise 4.1, using an array of Month objects with each Month object
 * having an array of double of size 28, 30, or 31.
 */
public class Task3 {
    private final int MONTHS_IN_YEAR = 12;
    private Month[] months = new Month[MONTHS_IN_YEAR];

    private Task3() {
        for (int i = 0; i < months.length; i++) {
            months[i] = new Month(i);
        }

        Arrays.stream(months).forEach(Month::initByRandomTemperatures);
    }

    public static void main(String[] args) {
        Task3 taskObj = new Task3();

        Arrays.stream(taskObj.months).forEach(System.out::println);

        System.out.println("Hottest day in year: " + taskObj.getHottestDay());
        System.out.println("Coldest day in year: " + taskObj.getColdestDay());

        System.out.println("Average temperatures of months: ");
        double[] averageTemperatures = taskObj.getAverageTemperaturesOfMonths();

        for (int i = 0; i < averageTemperatures.length; i++) {
            System.out.printf("%s: %.1f\n", taskObj.months[i].getMonthName(), averageTemperatures[i]);
        }

        System.out.println("Difference between the hottest and coldest days of months: ");
        double[] differences = taskObj.getDifferencesBetweenHottestAndColdestDays();

        for (int i = 0; i < differences.length; i++) {
            System.out.printf("%s: %.1f\n", taskObj.months[i].getMonthName(), differences[i]);
        }

        System.out.printf("Temperature of %s %d: %.1f\n", taskObj.months[2 - 1].getMonthName(),
                1, taskObj.getTemperature(2, 1));
        System.out.printf("Temperature of %s %d: %.1f\n", taskObj.months[12 - 1].getMonthName(),
                5, taskObj.getTemperature(12, 5));
    }

    private void showTemperatures() {
        Arrays.stream(months).forEach(Month::toString);
    }

    private int getHottestDay() {
        double max = months[0].getTemperatureByDay(0);
        int hottestDay = 0;

        int currentDay = 0;
        for (Month month : months) {
            for (int j = 0; j < month.getDaysCount(); j++) {
                double temperature = month.getTemperatureByDay(j);

                if (temperature > max) {
                    max = temperature;
                    hottestDay = currentDay;
                }

                currentDay++;
            }
        }

        return hottestDay;
    }

    private int getColdestDay() {
        double min = months[0].getTemperatureByDay(0);
        int coldestDay = 0;

        int currentDay = 0;
        for (Month month : months) {
            for (int j = 0; j < month.getDaysCount(); j++) {
                double temperature = month.getTemperatureByDay(j);

                if (temperature < min) {
                    min = temperature;
                    coldestDay = currentDay;
                }

                currentDay++;
            }
        }

        return coldestDay;
    }

    private double[] getAverageTemperaturesOfMonths() {
        double[] temperatures = new double[MONTHS_IN_YEAR];

        for (int i = 0; i < months.length; i++) {
            temperatures[i] = months[i].getAverageTemperature();
        }

        return temperatures;
    }

    private double[] getDifferencesBetweenHottestAndColdestDays() {
        double[] differences = new double[MONTHS_IN_YEAR];

        for (int i = 0; i < differences.length; i++) {
            differences[i] = months[i].getAverageTemperature();
        }

        return differences;
    }

    private double getTemperature(int month, int day) {
        month--;
        day--;

        return months[month].getTemperatureByDay(day);
    }


    private class Month {
        private final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        private final String[] MONTH_NAMES = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        private int number;
        private double[] monthTemperatures;
        private String monthName;

        Month(int number) {
            this.number = number;
            monthTemperatures = new double[DAYS_IN_MONTHS[number]];
            monthName = MONTH_NAMES[number];
        }

        void initByRandomTemperatures() {
            Random random = new Random();

            for (int i = 0; i < monthTemperatures.length; i++) {
                if (number <= 1 || number >= 9) {
                    monthTemperatures[i] = random.nextInt(20) - 15;
                } else if (number >= 4 || number <= 7) {
                    monthTemperatures[i] = 20 + random.nextInt(15);
                } else {
                    monthTemperatures[i] = random.nextInt(15);
                }
            }
        }

        double getTemperatureByDay(int day) {
            return monthTemperatures[day];
        }

        void setTemperature(int day, double temperature) {
            monthTemperatures[day] = temperature;
        }

        int getDaysCount() {
            return monthTemperatures.length;
        }

        double getAverageTemperature() {
            OptionalDouble optionalAverage = Arrays.stream(monthTemperatures).average();

            if (optionalAverage.isPresent()) {
                return optionalAverage.getAsDouble();
            }

            return 0;
        }

        double getDifferenceBetweenHottestAndColdestDay() {
            double minTemp = monthTemperatures[0];
            double maxTemp = monthTemperatures[0];

            for (double temperature : monthTemperatures) {
                if (temperature > maxTemp) {
                    maxTemp = temperature;
                }
                if (temperature < minTemp) {
                    minTemp = temperature;
                }
            }

            return maxTemp - minTemp;
        }

        public String getMonthName() {
            return monthName;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            for (double temp : monthTemperatures) {
                sb.append(temp).append(" ");
            }
            sb.append("\n");

            return sb.toString();
        }
    }
}
