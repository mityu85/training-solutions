package week09d03;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }

    public void setPresent() {
        Random random = new Random();
        int presentValue = 0;
        if (age <= 14) {
            presentValue = random.nextInt(3);
            present = Present.values()[presentValue];
        } else {
            presentValue = random.nextInt(3)+1;
            present = Present.values()[presentValue];
        }
    }
}
