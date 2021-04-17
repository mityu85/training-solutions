package week10d01;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HikingFileTest {

    @Test
    public void getPlusElevationTest() throws IOException {
        try (InputStream is = new FileInputStream("src/main/resources/gps.txt")) {
            assertEquals("descend: -199.614445", new HikingFile().getPlusElevation(is));
        }
    }
}
