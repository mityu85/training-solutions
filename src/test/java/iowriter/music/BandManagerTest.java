package iowriter.music;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BandManagerTest {


    private BandManager bandManager = new BandManager();

    @Test
    public void createOlderThanFile() throws IOException {
        Path inputFile = Path.of("src/main/resources/bands_and_years.txt");
        bandManager.addBandsToListFromFile(inputFile);

        Path outputFile = Path.of("src/main/resources/bandsOlderThan.txt");
        bandManager.writeListOfBandsWhichBeforThan(outputFile, 1990);

        List<String> lines = Files.readAllLines(outputFile);

        assertEquals(5, lines.size());
    }
}
