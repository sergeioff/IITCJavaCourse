package exercises.exercise_20;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @see Main
 */
class PhoneBook implements Serializable {
    private ArrayList<Contact> contacts;

    PhoneBook() {
        contacts = new ArrayList<>();
    }

    void addContact(Contact contact) {
        contacts.add(contact);
    }

    Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }

        return null;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        if (contacts.size() < 1) {
            return "Phone book is empty";
        }

        return String.format("There are %d contacts in the phone book:\n%s\n", contacts.size(), contacts);
    }
}
