package covid;

import java.text.Collator;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Citizens {

    private long id;
    private String name;
    private String zip;
    private long age;
    private String email;
    private String taj;
    private long numberOfVaccination;
    private LocalDateTime lastVaccination;

    private Set<Cities> cities = new TreeSet<>(Collator.getInstance(new Locale("hu", "HU")));

    public Citizens(String name, String zip, long age, String email, String taj) {
        if (isEmpty(name) || isEmpty(zip)) {
            throw new IllegalArgumentException("Name or zip cannot be empty");
        }
        if (!isValidAge(age)) {
            throw new IllegalArgumentException("Age must be between 10 and 150");
        }
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Email is not valid");
        }
        this.name = name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getZip() {
        return zip;
    }

    public long getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTaj() {
        return taj;
    }

    public long getNumberOfVaccination() {
        return numberOfVaccination;
    }

    public LocalDateTime getLastVaccination() {
        return lastVaccination;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNumberOfVaccination(long numberOfVaccination) {
        this.numberOfVaccination = numberOfVaccination;
    }

    public void setLastVaccination(LocalDateTime lastVaccination) {
        this.lastVaccination = lastVaccination;
    }

    private boolean isEmpty(String str) {
        return str.isEmpty() || str == null;
    }

    private boolean isValidAge(long age) {
        return age > 10 && age < 150;
    }

    private boolean isValidEmail(String str) {
        return str.length() >= 3 && str.contains("@");
    }

    private boolean isValidTaj(String str) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 8; i+=2) {
            odd += Integer.parseInt(str.substring(i, i+1)) * 3;
        }
        for (int i = 1; i < 8; i+=2) {
            even += Integer.parseInt(str.substring(i, i+1)) * 7;
        }
        return (odd + even) % 10 == Integer.parseInt(str.substring(8));
    }
}
