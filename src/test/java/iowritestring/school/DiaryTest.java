package iowritestring.school;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {

    private Diary register = new Diary();

    @Test
    public void newMarkTestIfNotExists() throws IOException {
        register.newMark("John Doe", 5);
        List<String> testList = Files.readAllLines(Path.of("src/main/resources/","John Doe.txt"));

        assertEquals(1, testList.size());
        assertEquals("5", testList.get(0));
    }

    @Test
    public void newMarkTestIfExists() throws IOException {
        register.newMark("John Doe", 4);
        register.newMark("John Doe", 2);


        register.newMark("John Doe", 3);
        List<String> testList = Files.readAllLines(Path.of("src/main/resources/","John Doe.txt"));

        assertEquals(3, testList.size());
    }

    @Test
    public void averageTest() throws IOException {
        Files.writeString(Path.of("src/main/resources/","John Doe.txt"), "5\n");
        Files.writeString(Path.of("src/main/resources/","John Doe.txt"), "3\n", StandardOpenOption.APPEND);
        Files.writeString(Path.of("src/main/resources/","John Doe.txt"), "4\n", StandardOpenOption.APPEND);

        register.average(Path.of("src/main/resources/","John Doe.txt"));

        List<String> avgTestList = Files.readAllLines(Path.of("src/main/resources/","John Doe.txt"));
        assertEquals(4, avgTestList.size());
        assertEquals("average: 4.0", avgTestList.get(avgTestList.size() - 1));

    }
}
