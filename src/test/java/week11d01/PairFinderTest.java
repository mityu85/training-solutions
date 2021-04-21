package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairFinderTest {

    @Test
    public void findPairsTest() {
        assertEquals(3, new PairFinder().findPairs(new int[]{7, 1, 5, 7, 3, 3, 5, 7, 6, 7}));
    }
}
