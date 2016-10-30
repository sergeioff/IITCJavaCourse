package exercises.exercise_12_1.task3;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Write a program to sort Employee objects based on highest salary using Comparator.
 * Create a LinkedList using user defined objects (Ex: Employee). By using Collections.sort() method
 * you can sort the LinkedList. You have to pass Comparator object which contains your sort logic.
 */
public class Task3 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jon", 200);
        Employee employee2 = new Employee("Andrew", 100);
        Employee employee3 = new Employee("Michael", 250);
        Employee employee4 = new Employee("Josh", 110);

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        System.out.println("Before sort:");
        System.out.println(employees);

        Collections.sort(employees, (emp1, emp2) -> emp1.getSalary() - emp2.getSalary());
        System.out.println("\nAfter sort:");
        System.out.println(employees);
    }
}
