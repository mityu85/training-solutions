package week11d04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumNumbersFromFilesTest {

    @TempDir
    Path folder = Path.of("src/main/resources/numbers/");

    SumNumbersFromFiles sumNumbersFromFiles = new SumNumbersFromFiles();

    @Test
    public void testSumNumbers() {

        assertEquals(23, sumNumbersFromFiles.sumNumbers());
    }
}
