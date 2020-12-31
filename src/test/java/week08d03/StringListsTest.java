package week08d03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    @Test
    public void testStringLists() {
        StringLists stringLists = new StringLists();
        assertEquals(Arrays.asList("körte", "banán", "alma", "eper"), stringLists.stringListsUnion(Arrays.asList(
                "alma", "körte"
        ), Arrays.asList(
                "körte", "banán", "alma", "eper"
        )));
    }
}
