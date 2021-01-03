package ioreader.grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public double average() {
        double sum = 0;
        for (Integer grade: grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public boolean isGradesIncreasing() {
        for (int i = 0; i < grades.size()-1; i++) {
                if (grades.get(i) > grades.get(i+1)) {
                    return false;
                }
            }
        return true;
    }
}
