package week07d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberListTest {

    @Test
    public void testIsIncreasing() {
        assertTrue(NumberList.isIncreasing(List.of(1,2,3,3,3,5)));
        assertFalse(NumberList.isIncreasing(List.of(1,2,1,3,2,5)));
    }
}
