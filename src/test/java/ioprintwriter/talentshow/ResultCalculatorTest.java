package ioprintwriter.talentshow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ResultCalculatorTest {

    @TempDir
    public File folder;

    private ResultCalculator rc = new ResultCalculator();

    private Path talentsFile;

    private Path votesFile;

   /* @BeforeEach
    public void initFiles() throws IOException {
        talentsFile = new File(folder, "test.txt").toPath();
        Files.copy(ResultCalculatorTest.class.getResourceAsStream("talents.txt"), talentsFile, StandardCopyOption.REPLACE_EXISTING);

        votesFile = new File(folder, "test2.txt").toPath();
        Files.copy(ResultCalculatorTest.class.getResourceAsStream("votes.txt"), votesFile, StandardCopyOption.REPLACE_EXISTING);

    }*/

    @Test
    public void readProductionsTest() {
        rc.readTalents(Path.of("src/main/resources/talents.txt"));

        assertEquals(12, rc.getProductions().size());
        assertEquals(6, rc.getProductions().get(5).getId());
        assertEquals("Magician", rc.getProductions().get(5).getName());
    }


    @Test
    public void calculateVotesTest() {
        rc.readTalents(Path.of("src/main/resources/talents.txt"));
        rc.calculateVotes(Path.of("src/main/resources/votes.txt"));
        int testNum = 0;

        for (Vote v : rc.getVotes()) {
            if (v.getId() == 10) {
                testNum = v.getNumber();
            }
        }

        assertEquals(4, testNum);
    }


    @Test
    public void writeResultToFileTest() throws IOException {
        rc.readTalents(Path.of("src/main/resources/talents.txt"));
        rc.calculateVotes(Path.of("src/main/resources/votes.txt"));

        //Path resultFile = new File(folder, "test3.txt").toPath();

        rc.writeResultToFile(Path.of("src/main/resources/winner.txt"));
        List<String> results = Files.readAllLines(Path.of("src/main/resources/winner.txt"));
        assertTrue(results.contains("9 Singer 6"));

        assertEquals("Winner: Actors_From_Shadow", results.get(results.size() - 1));
    }
}