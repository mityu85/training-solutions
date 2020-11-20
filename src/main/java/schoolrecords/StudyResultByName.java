package schoolrecords;

import java.util.Locale;

public class StudyResultByName {

    private String studentName;
    private double studyAverage;

    public StudyResultByName(String studentName, double studyAverage) {
        this.studentName = studentName;
        this.studyAverage = studyAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        String format = String.format(Locale.US,"%3.2f", studyAverage);
        return Double.parseDouble(format);
    }
}
