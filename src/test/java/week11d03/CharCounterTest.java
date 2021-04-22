package week11d03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharCounterTest {

    @Test
    public void countCharsTest() {
        assertEquals(2, new CharCounter().countChars(new String[]{"abc", "cba", "ab"}));
    }
}
