package week14d03;

import java.util.*;

public class Student implements Comparable<Student> {

    private String name;
    private Map<String, List<Integer>> subjects = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getSubjects() {
        return subjects;
    }

    public void addSubjectGrades(String subject, Integer grade, Integer... gradeItems) {
        subjects.put(subject, addGradesToList(subject, grade, gradeItems));
    }

    private List<Integer> addGradesToList(String subject, Integer grade, Integer... gradeItems) {
        List<Integer> grades = new ArrayList<>();
        if (subjects.get(subject) != null) {
            grades = subjects.get(subject);
        }
        grades.add(grade);
        if (gradeItems.length != 0) {
            for (Integer i: gradeItems) {
                grades.add(i);
            }
        }
        return grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
