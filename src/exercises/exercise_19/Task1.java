package exercises.exercise_19;

import java.sql.*;

/**
 * Write program, that prints full name of employee and his salary. Format output using Formatter.
 */
public class Task1 {
    private static final String dbUrl = "jdbc:mysql://localhost/HR?useSSL=false";
    private static final String dbUser = "root";
    private static final String dbPassword = "password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("Select FIRST_NAME, LAST_NAME, SALARY " +
                                                    "from employees;")) {
            while (rs.next()) {
                String firstName = rs.getString("FIRST_NAME");
                String lastName = rs.getString("LAST_NAME");
                double salary = rs.getDouble("SALARY");

                System.out.printf("Full name: %s\t\tSalary: %f\n", firstName + " " + lastName, salary);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }
}
