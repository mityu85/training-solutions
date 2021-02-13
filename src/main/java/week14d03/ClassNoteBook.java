package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassNoteBook {

    private List<Student> students = new ArrayList<>();

    public void addStudents(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> sortNoteBook() {
        List<Student> sortedStudentList = students;
        Collections.sort(sortedStudentList);
        return sortedStudentList;
    }
}
