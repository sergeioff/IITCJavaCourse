package coreJava.task9;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @see Task9
 */
class AddressBook {
    private ArrayList<Person> persons;

    AddressBook() {
        persons = new ArrayList<>();
    }

    AddressBook(Person ... persons) {
        this();
        Collections.addAll(this.persons, persons);
    }

    AddressBook(ArrayList<Person> persons) {
        this.persons = persons;
    }

    void addPerson(Person person) {
        persons.add(person);
    }

    void removePerson(Person person) {
        persons.remove(person);
    }

    Person searchPersonByName(String name) {
        Person result = null;

        for (Person person : persons) {
            if (person.getName().equalsIgnoreCase(name)) {
                result = person;
                break;
            }
        }

        return result;
    }

    public void changeName(String oldName, String newName) {
        Person person = searchPersonByName(oldName);
        person.setName(newName);
    }

    @Override
    public String toString() {
        return "AddressBook: " + persons.toString();
    }
}
