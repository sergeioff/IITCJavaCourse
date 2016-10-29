package exercises.exercise11;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * - Write an AddressBook class that manages a collection of Person objects.An AddressBook object
 * will allow the programmer to add,delete,or search for a Personobject in the address book.
 * 1. Implement the constructor(s).
 * 2. Implement the add method.
 * 3. Implement the search method - ﬁnds a person with a given name.
 * 4. Implement the delete method.
 * 5. Finalize the class.
 * - The search method of the AddressBook class returns only one Person object.
 * Modify the method so that it will return all Person objects that match the search criteria.
 * You can use an array to return multiple Person objects.
 * - Write new search routines for the AddressBook class.
 * Add second and third search methods that ﬁnd all persons, given an age and a gender, respectively.
 * - Modify the add method of the AddressBook class so that no Person object with a duplicate
 * name is added to the address book.
 * - Modify the AddressBook class to allow the programmer to access all Person objects in the address book.
 * Make this modiﬁcation by adding two methods: getFirstPerson and getNextPerson.
 * The getFirstPerson method returns the ﬁrst Person object in the book.
 * The getNextPerson method returns the next Person object if there is one.
 * If there is no next person in the book, getNextPerson returns null.
 * The getFirstPerson method must be called before the getNextPerson method is called.
 */

public class AddressBook {
    private ArrayList<Person> persons;

    public AddressBook() {
        persons = new ArrayList<>();
    }

    public AddressBook(Person ... persons) {
        this();
        Arrays.stream(persons).forEach(this.persons::add);
    }

    public void add(Person person) {
        if (persons.contains(person)) return;
        persons.add(person);
    }

    public void delete(Person person) {
        persons.remove(person);
    }

    public Person[] searchByFirstName(String firstName) {
        return (Person[]) persons.stream().filter(p -> p.getFirstName().equals(firstName)).toArray();
    }

    public Person[] searchByLastName(String lastName) {
        return (Person[]) persons.stream().filter(p -> p.getLastName().equals(lastName)).toArray();
    }

    public Person[] serchByPhoneNumber(String phoneNumber) {
        return (Person[]) persons.stream().filter(p -> p.getPhoneNumber().equals(phoneNumber)).toArray();
    }

    public Person[] searchByAge(int age) {
        return (Person[]) persons.stream().filter(p -> p.getAge() == age).toArray();
    }

    public Person[] serchByGender(boolean gender) {
        return (Person[]) persons.stream().filter(p -> p.getGender() == gender).toArray();
    }
}
