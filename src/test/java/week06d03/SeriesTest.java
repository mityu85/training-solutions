package week06d03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SeriesTest {

    @Test
    public void testIncrementalSeries() {
        Series s1 = new Series();
        assertEquals("Incremental Series", s1.calculateSeriesType(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals("Decremental Series", s1.calculateSeriesType(Arrays.asList(5, 4, 3, 2, 1)));
        assertEquals("Mixed Series", s1.calculateSeriesType(Arrays.asList(5, 3, 5, 4, 1)));
    }

}
