package exercises.exercise_15.task3;

import java.io.*;
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
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        PhoneBook phoneBook = SerializationService.initializePhoneBook();

        boolean phoneBookChanged = false;

        String selectedAction;
        do {
            System.out.printf("Choose action: \n" +
                    "\t1) All - show all contacts in phone book\n" +
                    "\t2) Search - search contact by name\n" +
                    "\t3) Add - add a new contact to phone book\n" +
                    "\t4) Change - change existing contact\n" +
                    "\t5) Exit\n");

            selectedAction = scanner.nextLine();

            if (selectedAction.equalsIgnoreCase("exit") || selectedAction.equals("5")) {
                break;
            }

            boolean needToChange = false;

            switch (selectedAction) {
                case "1":
                case "a":
                case "all":
                case "All":
                    System.out.println(phoneBook);
                    break;
                case "4":
                case "c":
                case "change":
                case "Change":
                    needToChange = true;
                case "2":
                case "s":
                case "search":
                case "Search":
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    Contact contact = phoneBook.findContactByName(name);

                    if (contact == null) {
                        System.out.println("Contact not found");
                        break;
                    }

                    System.out.println("Found contact: " + contact);

                    if (needToChange) {
                        System.out.printf("Would you like to change: \n" +
                                "\t1) name\n" +
                                "\t2) phone\n" +
                                "\t3) name and phone\n" +
                                "\t4) nothing\n");

                        String selectedOption = scanner.nextLine();

                        boolean changeBoth = false;

                        System.out.println("=== Changing the contact ===");

                        switch (selectedOption) {
                            case "3":
                                changeBoth = true;
                            case "1":
                                System.out.print("Enter new name: ");
                                String newName = scanner.nextLine();
                                contact.setName(newName);

                                if (!changeBoth) {
                                    break;
                                }
                            case "2":
                                System.out.print("Enter new phone: ");
                                String newPhone = scanner.nextLine();
                                contact.setPhone(newPhone);
                                break;
                            case "4":
                                break;
                            default:
                                System.out.println("Invalid option!");
                        }

                        phoneBookChanged = true;
                    }
                    break;
                case "3":
                case "add":
                case "Add":
                    System.out.println("=== Addition of a new contact ===");
                    System.out.print("Enter name: ");
                    String contactName = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();

                    Contact newContact = new Contact(contactName, phone);
                    phoneBook.addContact(newContact);

                    phoneBookChanged = true;
                    break;
                default:
                    System.out.println("Wrong operation! Please try again.");
            }
        } while (!"exit".equalsIgnoreCase(selectedAction));

        if (phoneBookChanged) {
            SerializationService.savePhoneBook(phoneBook);
        }
    }
}