package coreJava.task9;

/**
 * @see Task9
 */
class Person {
    private String name;
    private String surname;
    private String phoneNumber;

    Person(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person {\n\tname: " + name + ",\n\tsurname: " + surname + ",\n\tphone: " + phoneNumber +"\n}";
    }
}
