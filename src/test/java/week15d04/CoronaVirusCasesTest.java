package week15d04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoronaVirusCasesTest {

    CoronaVirusCase coronaVirusCase = new CoronaVirusCase();

    @Test
    public void testC() {
        List<Integer> i = coronaVirusCase.countVirusCases(Path.of("src/main/resources/coronadata.csv"));
        assertEquals(List.of(1782792, 1588085, 1515282), i);
    }
}
