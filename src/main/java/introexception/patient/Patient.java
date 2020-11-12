package introexception.patient;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name != "") {
            this.name = name;
        } else {
            throw new IllegalArgumentException("The name field must be filled out!");
        }
        if (yearOfBirth >= 1900) {
            this.yearOfBirth = yearOfBirth;
        } else {
            throw new IllegalArgumentException("The year must be at least 1900!");
        }
        if (!new SsnValidator().isValidSsn(socialSecurityNumber)) {
            throw new IllegalArgumentException("Invalid Social Security Number: " + socialSecurityNumber);
        } else {
            this.socialSecurityNumber = socialSecurityNumber;
        }
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
