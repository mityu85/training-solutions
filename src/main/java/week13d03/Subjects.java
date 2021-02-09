package week13d03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Subjects {

    private List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getTeachers() {
        return new ArrayList<>(teachers);
    }

    public void loadFile(Path path) {
        try {
            List<String> rows = Files.readAllLines(path);
            int counter = 0;
            int step = 0;
            for (int i = 0; i < rows.size() / 4; i++) {
                String[] temp = new String[4];
                while (counter <= 3) {
                    temp[counter] = rows.get(step);
                    counter++;
                    step++;
                }
                teachers.add(new Teacher(temp[0], temp[1], temp[2], Integer.parseInt(temp[3])));
                counter = 0;
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
    }

    public int countHoursByTeacher(Teacher teacher) {
        int sum = 0;
        for (Teacher t: teachers) {
            if (t.equals(teacher)) {
                sum += t.getHours();
            }
        }
        return sum;
    }
}
