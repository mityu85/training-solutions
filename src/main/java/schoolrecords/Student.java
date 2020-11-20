package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
            if (marks.size() == 0) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            sum += markItem.getMarkType().getValue();
            counter++;
        }
        if (counter == 0.0 || sum == 0.0) {
            return 0.0;
        }
        String format = String.format(Locale.US,"%3.2f", sum / counter);
        return Double.parseDouble(format);
    } // teljes átlag számolása

    public double calculateSubjectAverage(Subject subject) {
        double sum = 0.0;
        double counter = 0.0;
        for (Mark markItem: marks) {
            if (markItem.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sum += markItem.getMarkType().getValue();
                counter++;
            } else {
                sum += 0;
            }
        }
        if (counter == 0.0 || sum == 0.0) {
            return 0;
        }
        return sum / counter;
        //return 2.75;
    } // tantárgyhoz tartozó átlag számítása

    public String toString() {
        for (Mark markItem: marks) {
           return name + " marks: " + markItem.getSubject().getSubjectName() + ": " +
                   markItem.getMarkType().getDescription().toString() + "(" +
                   markItem.getMarkType().getValue() + ")";
        }
        return null;
    }
}
