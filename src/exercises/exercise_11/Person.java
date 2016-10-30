package exercises.exercise_11;

public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private boolean gender;

    public Person(String firstName, String lastName, String phoneNumber, int age, boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person {\n\tfirstName: " + firstName + ",\n\tlastName: "
                + lastName +",\n\tphoneNumber: " + phoneNumber +
                ",\n\tage: " + age + ",\n\tgender: " + gender +"\n}";
    }
}
