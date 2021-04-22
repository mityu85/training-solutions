package week11d04;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameLengthTest {

    @Test
    public void getLengthsTest() {
        assertEquals(List.of(3, 4), new NameLength().getLengths(List.of("Joe", "Jack", "Jane", "Jake", "George", "William")));
    }
}
