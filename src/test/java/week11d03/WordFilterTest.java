package week11d03;

import org.junit.jupiter.api.Test;
import week11d03.WordFilter;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WordFilterTest {

    WordFilter wf = new WordFilter();

    @Test
    public void testWordFilter() {
        List<String> testWords = List.of("apple", "pear", "grape", "banana");
        assertEquals(1, wf.wordsWithChar(testWords, 'n').size());
        assertEquals(4, wf.wordsWithChar(testWords, 'a').size());
    }
}
