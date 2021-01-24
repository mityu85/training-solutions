package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumNumbersFromFiles {

    public int sumNumbers() {
    int sum = 0;
    Path path = Path.of("src/main/resources/numbers/");
        try {
            for (int i = 0; i < 100; i++) {
                if (i < 10) {
                    if (Files.isRegularFile(path.resolve("number0" + i + ".txt"))) {
                        String numbers = Files.readString(path.resolve("number0" + i + ".txt"));
                        sum += Integer.parseInt(numbers);
                    }
                }
                if (Files.isRegularFile(path.resolve("number" + i + ".txt"))) {
                    String numbers = Files.readString(path.resolve("number" + i + ".txt"));
                    sum += Integer.parseInt(numbers);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
        return sum;
    }
}
