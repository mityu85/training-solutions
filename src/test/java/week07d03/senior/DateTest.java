package week07d03.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTest {

    Date date = Date.of(1985, 10, 17);

    @Test
    public void testDate() {
        assertEquals(17, date.getDay());
        assertEquals(1978, date.withYear(1978).getYear());
        assertEquals(12, date.withMonth(12).getMonth());
        assertEquals(16, date.withDay(16).getDay());
    }
}
