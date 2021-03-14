package week04d01;

import java.time.format.SignStyle;

public class NameChanger {

    private String fullName;
    private String firstName;
    private String lastName;

    public NameChanger(String firstName, String lastName) {
        if (isEmpty(firstName) || isEmpty(lastName)) {
            throw new IllegalArgumentException("Invalid name: " + firstName + lastName);
        }
        this.firstName = firstName;
        this.lastName = lastName;
        fullName = firstName + " " + lastName;
    }

    public void changeFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private boolean isEmpty(String str) {
        return  str == null || str.isEmpty();
    }
}
