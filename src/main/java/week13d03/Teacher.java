package week13d03;

import java.util.Objects;

public class Teacher {

    private String name;
    private String subject;
    private String className;
    private int hours;

    public Teacher(String name, String subject, String className, int hours) {
        this.name = name;
        this.subject = subject;
        this.className = className;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassName() {
        return className;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
