package stringbasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringCreatorTest {


    @Test
    public void TestCreate() {
        // Given
        StringCreator sc = new StringCreator();

        // When

        // Then
        assertTrue(sc.createStringForPool() == sc.createStringForPool());
        assertFalse(sc.createStringForPool() == sc.createStringForHeap());
        assertTrue(sc.createStringForHeap().equals(sc.createStringForHeap()));
        assertTrue(sc.createStringForHeap().intern() == sc.createStringForPool().intern());
    }
}
