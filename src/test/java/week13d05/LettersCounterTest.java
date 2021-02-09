package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LettersCounterTest {

    LettersCounter lettersCounter = new LettersCounter();

    @Test
    public void testLetterCounter() {
        assertEquals(8, lettersCounter.differentLettersCounter("almA kEnyer"));
    }
}
