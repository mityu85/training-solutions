package stringscanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringScannerTest {

    @Test
    public void testStringScanner() {

        assertEquals(11, new StringScanner().readAndSumValues("4 3 2 2", null));
    }

    @Test
    public void filterLinesWithWordOccurrences() {
        assertEquals("first word\nnext word", new StringScanner().filterLinesWithWordOccurrences("first word\napple\nnext word", "word"));
        assertEquals("", new StringScanner().filterLinesWithWordOccurrences("first\napple\nnext", "word"));
        assertEquals("", new StringScanner().filterLinesWithWordOccurrences("first\napple\nnext", " "));
    }
}
