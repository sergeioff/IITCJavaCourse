package coreJava.task9;

/**
 * Write a complete address book maintenance application.
 * The user of the program has four options: Add a new person, delete a person, modify the data of a person,
 * and search for a person by giving the name.
 * You have to decide how to allow the user to enter the values for a new person,
 * display person information, and so forth.
 */
class Task9 {
    public static void main(String[] args) {
        Person jon = new Person("Jon", "Doe", "1234");
        Person joanna = new Person("Joanna", "Doe", "4321");

        AddressBook addressBook = new AddressBook(jon, joanna);

        System.out.println("Initial contents of AddressBook:");
        System.out.println(addressBook);

        addressBook.changeName("Joanna", "Helen");
        System.out.println("Contents of AddressBook after name change:");
        System.out.println(addressBook);


        addressBook.addPerson(new Person("Bill", "Doe", "1111"));
        System.out.println("Contents of AddressBook after person addition");
        System.out.println(addressBook);

        System.out.println("Search person by name name Jon: ");
        Person foundPerson = addressBook.searchPersonByName("Jon");
        System.out.println(foundPerson);

        addressBook.removePerson(foundPerson);
        System.out.println("Collection after removing: ");
        System.out.println(addressBook);
    }
}
