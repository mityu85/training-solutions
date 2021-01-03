package ioreader.grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void readFromFile(String fileName) {
        Path file = Path.of("src/main/resources/" + fileName);
        try (BufferedReader bf = Files.newBufferedReader(file)) {
            String line;
            while((line = bf.readLine()) != null) {
                String[] temp = line.split(" ");
                List<Integer> grades = new ArrayList<>();
                for (int j = 1; j < temp.length; j++) {
                    grades.add(Integer.parseInt(temp[j]));
                }
                Student student = new Student(temp[0], grades);
                students.add(student);
            }
        } catch (IOException e) {
            throw new IllegalStateException("File cannot read", e);
        }
    }

    public double classAverage() {
        double sum = 0;
        for (Student student: students) {
            sum += student.average();
        }
        return sum / students.size();
    }
}
