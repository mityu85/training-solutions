package week14d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    Student student = new Student("Arnold");
    ClassNoteBook classNoteBook = new ClassNoteBook();

    @Test
    public void testStudents() {
        student.addSubjectGrades("Matek", 5);
        student.addSubjectGrades("Matek", 2, 3, 4);
        student.addSubjectGrades("Töri", 4, 3);

        assertEquals(2, student.getSubjects().entrySet().size());
        assertEquals(4, student.getSubjects().get("Matek").size());
        assertEquals(2, student.getSubjects().get("Töri").size());
    }

    @Test
    public void testSortCollection() {
        classNoteBook.addStudents(new Student("Arnold"));
        classNoteBook.addStudents(new Student("Mike"));
        classNoteBook.addStudents(new Student("Evelin"));

        assertEquals("Arnold", classNoteBook.sortNoteBook().get(0).getName());
        assertEquals("Evelin", classNoteBook.sortNoteBook().get(1).getName());
        assertEquals("Mike", classNoteBook.sortNoteBook().get(2).getName());
    }
}
