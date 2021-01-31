package week12d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoronaWordCounterTest {

    CoronaWordCounter cwc = new CoronaWordCounter();

    @Test
    public void testCounter() {
        int result = cwc.coronaVirusWordCounter(CoronaWordCounterTest.class.getResourceAsStream("/index.html"));
        assertEquals(9, result);
    }
}
