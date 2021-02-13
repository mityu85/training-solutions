package week14d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountWordsTest {

    CountWords countWords = new CountWords();

    @Test
    public void testCounter() {
        Map<String, Integer> result = countWords.countWords(Path.of("src/main/resources/hachiko.srt"), "Hachiko", "haza", "pályaudvar", "jó");
        assertEquals("[haza=10, Hachiko=2, jó=12]", result.entrySet().toString());
    }
}
