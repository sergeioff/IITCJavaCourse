package exercises.exercise_15.task3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @see Task3
 */
class SerializationService {
    private static final String PHONE_BOOK_FILE_LOCATION = "files/phonebook";

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
}
