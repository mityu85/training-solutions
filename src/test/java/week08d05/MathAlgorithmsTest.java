package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {

    @Test
    public void testLNKO() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertEquals(40, mathAlgorithms.greatestCommonDivisor(120, 560));
    }
}
