package salary;

import ioprintwriter.salary.SalaryWriter;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryWriterTest {

    private SalaryWriter sw = new SalaryWriter(List.of("Dr. John Doe", "Mrs. Jane Doe", "Dr. Julie Smith", "Jack Doe"));

    @Test
    public void testWriteNamesAndSalaries() throws IOException {
        Path file = Path.of("src/main/resources/salary");
        sw.writeNamesAndSalaries(file);
        List<String> writtenLines = Files.readAllLines(file);


        assertEquals("Dr. Julie Smith: 500000", writtenLines.get(2));
        assertEquals("Mrs. Jane Doe: 200000", writtenLines.get(1));
        assertEquals("Jack Doe: 100000", writtenLines.get(3));
    }

}
