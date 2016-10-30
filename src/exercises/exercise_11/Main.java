package exercises.exercise_11;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jon", "Doe", "000-111-222-333", 40, true);
        Person p2 = new Person("Joanna", "Doe", "000-111-222-334", 30, false);
        Person p3 = new Person("Name", "Surname", "222-111-222-333", 20, true);
        Person p4 = new Person("FirstName", "LastName", "000-111-222-333", 40, true);

        AddressBook addressBook = new AddressBook(p1, p2, p3);
        addressBook.add(p4);

        System.out.println(addressBook.getFirstPerson());
        System.out.println(addressBook.getNextPerson());
        System.out.println(addressBook.getNextPerson());
        System.out.println(addressBook.getNextPerson());
        System.out.println(addressBook.getNextPerson());

        System.out.println(addressBook.searchByLastName("Doe"));
    }
}
