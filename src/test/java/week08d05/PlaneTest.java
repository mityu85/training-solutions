package week08d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaneTest {

    @Test
    public void getLongestOceanTest() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(PlaneTest.class.getResourceAsStream("/map.txt")))) {
            assertEquals(16, new Plane().getLongestOcean(br));
        }
    }
}
