package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Diary {

    Path path;

    public void newMark(String studentName, int mark) {
        path = Path.of("src/main/resources/",studentName + ".txt");
        try {
            if (Files.exists(path)) {
                Files.writeString(path, Integer.toString(mark) + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(path, Integer.toString(mark));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot be written", ioe);
        }
    }

    public void average(Path path) {
        List<String> marks = new ArrayList<>();
        double sum = 0;
        try {
            marks = Files.readAllLines(path);
            for (String mark: marks) {
                sum += Double.parseDouble(mark);
            }
            Files.writeString(path, "average: " + sum/marks.size(), StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot be written", ioe);
        }
    }
}
