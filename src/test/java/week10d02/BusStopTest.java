package week10d02;

import org.junit.jupiter.api.Test;
import week10d02.BusStop;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusStopTest {

    BusStop busStop = new BusStop();

    @Test
    public void testBusStop() {
        assertEquals(4, busStop.getMaxIndex(List.of(12,12,0,3,4,4,4)));
    }
}
