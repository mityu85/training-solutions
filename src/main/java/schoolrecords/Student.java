package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    private boolean isEmpty(String str) {
        return false;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void grading(Mark mark) {
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
