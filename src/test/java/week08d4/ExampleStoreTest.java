package week08d4;

import org.junit.jupiter.api.Test;
import week08d04.ExampleStore;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleStoreTest {

    @Test
    public void getTitlesOfExamplesTest() {
        assertEquals("[Elso feladat, Második feladat]", new ExampleStore().getTitlesOfExamples().toString());
    }
}
