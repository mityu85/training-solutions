package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabTest {

    @Test
    public void testToString() {
        Lab lab1 = new Lab("Geography");
        assertEquals("Lab{title='Geography', completed=false, completedAt=null}", lab1.toString());

        lab1.complete();
        assertEquals("Lab{title='Geography', completed=true, completedAt=" + LocalDate.now() + "}", lab1.toString());

        lab1.complete(LocalDate.of(2019, 10, 17));
        assertEquals("Lab{title='Geography', completed=true, completedAt=2019-10-17}", lab1.toString());

        Lab lab2 = new Lab("Geography", LocalDate.of(2020, 10, 12));
        assertEquals("Lab{title='Geography', completed=true, completedAt=2020-10-12}", lab2.toString());


    }
}
