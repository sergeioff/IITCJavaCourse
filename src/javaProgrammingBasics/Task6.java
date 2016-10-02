package javaProgrammingBasics;

import java.time.LocalDate;

/**
 * Write a program that replies either Leap Year or Not a Leap Year, given a year.
 * It is a leap year if the year is divisible by 4 but not by 100 (for example, 1796 is a leap year
 * because it is divisible by 4 but not by 100). A year that is divisible by both 4 and 100 is a leap
 * year if it is also divisible by 400 (for example, 2000 is a leap year, but 1800 is not).
 */

public class Task6 {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();

        printLeapYear(1796);
        printLeapYear(2000);
        printLeapYear(1800);
        printLeapYear(currentYear);
    }

    private static void printLeapYear(int year) {
        System.out.print(year + " is ");
        if (isLeap(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }

    private static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            }
        }

        return false;
    }
}
