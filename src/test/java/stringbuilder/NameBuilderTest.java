package stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameBuilderTest {

    @Test
    public void westernStyleNameConcatenation() {

        assertEquals("Mr. John G Smith", new NameBuilder().concatNameWesternStyle("Smith", "G", "John", Title.MR));
        assertEquals("John G Smith", new NameBuilder().concatNameWesternStyle("Smith", "G", "John", null));
        assertEquals("Mr. John Smith", new NameBuilder().concatNameWesternStyle("Smith", "", "John", Title.MR));
        assertEquals("Mr. John Smith", new NameBuilder().concatNameWesternStyle("Smith", null, "John", Title.MR));
    }
}
