package week07d01.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testFib() {
        assertEquals(0, fibonacci.fib(0));
        assertEquals(1, fibonacci.fib(1));
        assertEquals(7, fibonacci.fib(5));
    }
}
