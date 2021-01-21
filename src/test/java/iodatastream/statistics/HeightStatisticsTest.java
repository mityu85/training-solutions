package iodatastream.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeightStatisticsTest {

    @Test
    public void testSaveHeights() throws IOException {
        Path path = Path.of("src/main/resources/statistics.dat");
        HeightStatistics statistics = new HeightStatistics();

        List<Integer> heights = List.of(198, 201, 211, 195, 214, 208, 203, 198);
        statistics.saveHeights(heights, path);

        byte[] original = this.getClass().getResourceAsStream("/statistics.dat").readAllBytes();
        byte[] saved = Files.readAllBytes(path);

        assertArrayEquals(original, saved);
    }
}
