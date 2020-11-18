package algorithmsmax.integers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerMaxCalculatorTest {
    
    @Test
    public void testInteger() {
        
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 3, 10, 150, 4, 32));

        assertEquals(150, new IntegerMaxCalculator().maxCalculator(integerList));
    }
}
