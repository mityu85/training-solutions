package week05d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    public void testACounter() {
        assertEquals(3, new ListCounter().aCounter(Arrays.asList("apple", "pear", "Atlantis", "Russia", "anchor")));
    }
}
