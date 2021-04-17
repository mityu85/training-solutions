package week08d03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    StringLists stringLists = new StringLists();

    @Test
    public void testStringLists() {
        assertEquals(Arrays.asList("körte", "banán", "alma", "eper"), stringLists.stringListsUnion(Arrays.asList(
                "alma", "körte"
        ), Arrays.asList(
                "körte", "banán", "alma", "eper"
        )));
    }

    @Test
    public void shortestWordTest() {
        assertEquals("[aa, bb, dd]", stringLists.shortestWord(List.of("aaa", "aa", "bb", "cccc", "dd")).toString());
    }
}
