package exercises.exercise_20;

import java.io.Serializable;

/**
 * @see Main
 */
public class Contact implements Serializable {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SuppressWarnings("UnusedDeclaration")
    String getPhone() {
        return phone;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "name: " + name + ", phone: "+ phone;
    }
}
