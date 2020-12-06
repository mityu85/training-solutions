package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiscuitTest {

    @Test
    public void testBiscuit() {
        assertEquals("OREO 15", Biscuit.of(BiscuitType.OREO, 15).toString());
    }
}
