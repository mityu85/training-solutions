package week12d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberStatTest {

    NumberStat numberStat = new NumberStat();

    @Test
    public void testNumberStat() {
        assertEquals(3, numberStat.numberStat());
    }
}
