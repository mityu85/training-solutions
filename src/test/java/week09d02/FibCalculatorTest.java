package week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibCalculatorTest {

    FibCalculator fibCalculator = new FibCalculator();

    @Test
    public void testFib() {
        assertEquals(0, fibCalculator.sumEvens(0));
        assertEquals(6, fibCalculator.sumEvens(5));
    }

}
