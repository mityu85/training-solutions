package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final  List<Mark> marks = new ArrayList<>();
    private final String name;

    private boolean isEmpty(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            return true;
        }
        return false;
    }

    public Student(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    } // érdemjegy rögzítése

    public double calculateAverage(){
        double sum = 0.0;
        double counter = 0.0;
        for (Mark markItem: marks){
            sum += markItem.getMarkType().getValue();
            counter++;
        }
        return sum / counter;
    } // teljes átlag számolása

    public double calculateSubjectAverage(Subject subject) {
        double sum = 0.0;
        double counter = 0.0;
        for (Mark markItem: marks) {
            if (markItem.getSubject().equals(subject.getSubjectName())) {
                sum += markItem.getMarkType().getValue();
                counter++;
            }
        }
        return sum / counter;
    } // tantárgyhoz tartozó átlag számítása

    public String toString() {
        for (Mark markItem: marks) {
           return name + " marks: " + markItem.getSubject() + ": " +
                   markItem.getMarkType().getDescription() + "(" +
                   markItem.getMarkType().getValue() + ")";
        }
        return null;
    }
}
