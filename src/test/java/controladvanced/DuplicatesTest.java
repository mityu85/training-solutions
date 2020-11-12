package controladvanced;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicatesTest {

    @Test
    public void createTest() {

        assertEquals(new ArrayList<>(), new Duplicates().findDuplicates(Arrays.asList()));
        assertEquals(new ArrayList<>(), new Duplicates().findDuplicates(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(2), new Duplicates().findDuplicates(Arrays.asList(1, 2, 2, 3)));
        assertEquals(Arrays.asList(3, 3), new Duplicates().findDuplicates(Arrays.asList(1, 2, 3, 3, 3, 4)));
        assertEquals(Arrays.asList(2, 3, 3), new Duplicates().findDuplicates(Arrays.asList(1, 2, 2, 3, 3, 3, 4)));
    }
}
