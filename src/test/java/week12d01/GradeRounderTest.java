package week12d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeRounderTest {

    @Test
    public void testRounder() {

        GradeRounder gradeRounder = new GradeRounder();
        int[] grades = new int[]{40, 84, 98, 25};

        assertEquals(Arrays.toString(new int[]{40, 85, 100, 25}), Arrays.toString(gradeRounder.roundGrades(grades)));
    }
}
