package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
    public void testWordEraser() {
        String words = "apple pear banana mushroom eggplant grape ";
        String word = "banana";
        WordEraser wordEraser = new WordEraser();

        assertEquals("apple pear mushroom eggplant grape", wordEraser.eraseWord(words, word));
    }
}
