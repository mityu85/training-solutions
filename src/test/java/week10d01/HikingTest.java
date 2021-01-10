package week10d01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HikingTest {

    Hiking hiking = new Hiking();

    @Test
    public void testHiking() {
        assertEquals(13, hiking.getPlusElevation(List.of(10.0,20.0,15.0,18.0)));
    }
}
