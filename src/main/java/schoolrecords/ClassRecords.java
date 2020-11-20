package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class ClassRecords {

    private final String className;
    private Random rnd;
    private final List<Student> students = new ArrayList<>();

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty() || str.isBlank();
    }

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student) {
        for (Student studentItem: students) {
            if (studentItem.getName().equals(student.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    } // felvesz egy diákot az osztályba

    public boolean removeStudent(Student student) {
        for (Student studentItem: students) {
            if (studentItem.getName().equals(student.getName())) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }//kivesz egy diákot az osztályból

    public double calculateClassAverage() {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double sum = 0.0;
        double counter = 0.0;
        for (Student studentItem: students) {
            if (studentItem.calculateAverage() == 0) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            sum += studentItem.calculateAverage();
            counter++;
        }
        String format = String.format(Locale.US,"%3.2f", sum / counter);
        return Double.parseDouble(format);
    }//osztályátlagot számol, minden diákot figyelembe véve

    public double calculateClassAverageBySubject(Subject subject) {
        double sum = 0.0;
        double counter = 0.0;
        for (Student studentItem: students) {
            if (studentItem.calculateSubjectAverage(subject) == 0) {
                sum += studentItem.calculateSubjectAverage(subject);
            } else {
                sum += studentItem.calculateSubjectAverage(subject);
                counter++;
            }
        }
        if (counter == 0.0 || sum == 0.0) {
          //  counter--;
            return 0;
        }
        String format = String.format(Locale.US,"%3.2f", sum / counter);
        return Double.parseDouble(format);
    }//tantárgy szerinti osztályátlagot számol,
    // kihagyja azon diákokat, akiknek az adott tantárgyból nincs jegye

    public Student findStudentByName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }
        List<Student> foundStudentList = new ArrayList<>();
        Student resultStudent = null;
        for (Student studentItem: students) {
            if (studentItem.getName().equals(name)) {
                foundStudentList.add(studentItem);
            }
        }
        if (foundStudentList.size() == 0) {
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        }
        return foundStudentList.get(0);
    }// név szerint megkeres egy diákot az osztályban

    public Student repetition() {
        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(this.rnd.nextInt(students.size()));
    }//felelethez a listából random módon kiválaszt egy diákot

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> studyResultByNames = new ArrayList<>();
        for (Student studentItem: students) {
        studyResultByNames.add(new StudyResultByName(studentItem.getName(), studentItem.calculateAverage()));
        }
        return studyResultByNames;
    }//a diákok nevét és tanulmányi átlagát egy-egy új objektumba viszi,
    // és azok listáját adja vissza

    public String listStudentNames() {
        List<String> strings = new ArrayList<>();
        for (Student studentItem: students) {
            strings.add(studentItem.getName());
        }
        return String.join(", ", strings);
    }//kilistázza a diákok neveit, vesszővel elválasztva
}
