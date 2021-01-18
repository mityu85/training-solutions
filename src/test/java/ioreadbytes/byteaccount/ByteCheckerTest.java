package ioreadbytes.byteaccount;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ByteCheckerTest {

    ByteChecker byteChecker = new ByteChecker();

    @Test
    public void testByteChecker() {
        assertEquals(5500, byteChecker.byteCounter(Path.of("data.dat")));
    }
}
