package week11d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testCalculator() {
        assertEquals("1+3+5+7=16", calculator.findMinSum(new int[] {1, 3, 5, 7, 9}));
    }
}
