package exercises.exercise_19;

import java.sql.*;

/**
 * Write program, that prints full name of customer who has "Cancelled" order.
 * Format output using Formatter.
 * Use classicmodels.
 */
public class Task2 {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost/classicmodels?useSSL=false";
        String dbUser = "root";
        String dbPassword = "password";

        String sqlQuery = "select c.customerName, c.contactFirstName, c.contactLastName\n" +
                "from customers c inner join orders o on c.customerNumber = o.customerNumber\n" +
                "where o.status = 'Cancelled';";

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             Statement statement = connection.createStatement();
             ResultSet queryResults = statement.executeQuery(sqlQuery)) {

            System.out.println("Customers with cancelled order:");

            while (queryResults.next()) {
                String customer = queryResults.getString("customerName");
                String firstName = queryResults.getString("contactFirstName");
                String contactLastName = queryResults.getString("contactLastName");

                System.out.printf("Customer: %s\t\tFull name: %s\n", customer, firstName + " " + contactLastName);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }
}
