package exercises.exercise_15.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a phone directory program that keeps its list of names and phone numbers in a file.
 * The user of the program should be able to look up a name in the directory to find the associated phone number.
 * The user should also be able to make changes to the data in the directory.
 * Every time the program starts up, it should read the data from the file.
 * Before the program terminates, if the data has been changed while the program was running, the file
 * should be re-written with the new data. Designing a user interface for the program is part of the exercise.
 */
public class Task3 {
    private static final String PHONEBOOK_FILE = "files/phonebook";

    private static ArrayList<Contact> phoneBook = new ArrayList<>();
    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        initializePhoneBook();
        String selectedAction;
        do {
            System.out.printf("Choose action: \n" +
                    "\tall - show all contacts\n" +
                    "\ts - search\n" +
                    "\ta - add\n" +
                    "\texit - exit\n");
            selectedAction = reader.nextLine();

            switch (selectedAction) {
                case "all":
                    System.out.println(phoneBook);
                    break;
                case "s":
                    System.out.println("Enter name of a contact");
                    String nameOfContact = reader.nextLine();
                    Contact contact = searchContactByName(nameOfContact);
                    if (contact == null) {
                        System.out.println("Contact not found");
                        break;
                    }

                    System.out.println("Contact found: ");
                    System.out.println(contact);

                    System.out.println("Would you like to change the contact? (y/n)");
                    String selection = reader.nextLine();
                    if (selection.equalsIgnoreCase("y")) {
                        changeContact(contact);
                    }
                    break;
                case "a":
                    addContact();
                    break;
            }
        } while (!"Exit".equalsIgnoreCase(selectedAction));

        savePhoneBook();
    }

    private static void initializePhoneBook() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(PHONEBOOK_FILE))) {
            int contactsCount = in.readInt();
            for (int i = 0; i < contactsCount; i++) {
                Contact contact = (Contact) in.readObject();
                phoneBook.add(contact);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Phone book file doesn't exist");
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void addContact() {
        System.out.println("=== Addition of a new contact ===");
        System.out.print("Enter contact name: ");
        String contactName = reader.nextLine();
        System.out.print("Enter contact phone: ");
        String contactPhone = reader.nextLine();
        Contact contact = new Contact(contactName, contactPhone);
        phoneBook.add(contact);
    }

    private static Contact searchContactByName(String name) {
        for (Contact contact : phoneBook) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }

        return null;
    }

    private static void changeContact(Contact contact) {
        System.out.println("Enter new name for contact:");
        String newName = reader.nextLine();
        System.out.println("Enter new phone for contact:");
        String newPhone = reader.nextLine();

        contact.setName(newName);
        contact.setPhone(newPhone);
    }

    private static void savePhoneBook() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PHONEBOOK_FILE))) {
            out.writeInt(phoneBook.size());
            for (Contact contact : phoneBook) {
                out.writeObject(contact);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}