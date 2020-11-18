package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubject = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubject) {
        this.name = name;
        this.taughtSubject = taughtSubject;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getTaughtSubject() {
        return taughtSubject;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject subjectItem: taughtSubject) {
            if (subjectItem.getSubjectName().equals(subject.getSubjectName())) {
                return true;
            }
        }
        return false;
    }
}
