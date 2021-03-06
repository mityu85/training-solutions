package week13d03;


import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubjectsTest {


    Subjects subjects = new Subjects();

    @Test
    public void loadFileTest() {
        subjects.loadFile(Path.of("src/main/resources/beosztas.txt"));
        assertEquals(3, subjects.getTeachers().size());
        assertEquals("Albatrosz Aladin", subjects.getTeachers().get(0).getName());
    }

    @Test
    public void testCountHours() {
        subjects.loadFile(Path.of("src/main/resources/beosztas.txt"));
        assertEquals(3, subjects.countHoursByTeacher(subjects.getTeachers().get(0)));
    }
}
