package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathAlgorithmsTest {

    @Test
    public void testIsPrime() {
        assertTrue(MathAlgorithms.isPrime(2));
        assertTrue(MathAlgorithms.isPrime(3));
        assertTrue(MathAlgorithms.isPrime(5));
        assertTrue(MathAlgorithms.isPrime(7));
        assertTrue(MathAlgorithms.isPrime(11));
        assertTrue(MathAlgorithms.isPrime(13));

        assertFalse(MathAlgorithms.isPrime(4));
        assertFalse(MathAlgorithms.isPrime(6));
        assertFalse(MathAlgorithms.isPrime(8));
        assertFalse(MathAlgorithms.isPrime(10));
        assertFalse(MathAlgorithms.isPrime(12));
    }

    @Test
    public void throwIllegalArgumentExceptionTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(-1));
        assertEquals("The given number must greater then 0!", ex.getMessage());
    }
}
