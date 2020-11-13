package stringbasic.pets;

import java.time.LocalDate;

public class Pet {

    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
    private int regNumber;

    public Pet(String name, LocalDate dateOfBirth, Gender gender, int regNumber) {

        if (regNumber > 999999 || regNumber < 000001) {
            throw new IllegalArgumentException("Invalid number");
        }
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public int getRegNumber() {
        return regNumber;
    }
}
