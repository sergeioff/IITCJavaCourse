package exercises.exercise_20;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;

/**
 * @see Main
 */
class SerializationService {
    private static final String PHONE_BOOK_FILE_LOCATION = "files/phonebook";
    private static final String TABLE_NAME = "Phone_book";
    private static final String dbUser = "root";
    private static final String dbPassword = "password";
    private static final String dbUrl = "jdbc:mysql://localhost/PhoneBook?useSSL=false";

    static PhoneBook initializePhoneBook() {
        Path path = Paths.get(PHONE_BOOK_FILE_LOCATION);

        if (Files.exists(path)) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.toFile()))) {
                return (PhoneBook) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace(System.err);
            }
        }

        return new PhoneBook();
    }

    static void savePhoneBook(PhoneBook phoneBook) {
        Path path = Paths.get(PHONE_BOOK_FILE_LOCATION);

        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            ous.writeObject(phoneBook);
            ous.flush();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    static void saveToDb(PhoneBook phoneBook) {
        final String dropTableSql = "drop table " + TABLE_NAME;
        final String tableCreationSql = "create table if not exists " + TABLE_NAME + " (" +
                "name varchar(100)," +
                "phone varchar(100)" +
                ");";
        final String addContactSql = "insert into " + TABLE_NAME + " values(?, ?)";

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             Statement statement = connection.createStatement();
             PreparedStatement preparedStatement = connection.prepareStatement(addContactSql)) {

            statement.executeUpdate(dropTableSql);
            statement.executeUpdate(tableCreationSql);

            for (Contact contact : phoneBook.getContacts()) {
                preparedStatement.setString(1, contact.getName());
                preparedStatement.setString(2, contact.getPhone());
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static PhoneBook readFromDb() {
        final String getContactsSql = "Select name, phone " +
                "from " + TABLE_NAME;

        PhoneBook phoneBook = new PhoneBook();

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            ResultSet resultSet = connection.createStatement().executeQuery(getContactsSql)) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                phoneBook.addContact(new Contact(name, phone));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return phoneBook;
    }
}
