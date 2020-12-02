package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListSelectorTest {

    @Test
    public void listSelectorTest() {
        ListSelector listSelector = new ListSelector();
        List<String> resultWords = new ArrayList<>(Arrays.asList("apple", "pear"));
        assertEquals(resultWords, listSelector.evenWordList(Arrays.asList(
                "apple", "pear", "pear", "grape"
        )));
    }
}
