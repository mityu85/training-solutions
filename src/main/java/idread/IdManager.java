package idread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {

    private List<String> ids = new ArrayList<>();

    public void readIdsFromFile() {
        Path path = Path.of("src/main/resources/idnumbers.txt");
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                ids.add(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("File cannot be opened", e);
        }
    }

    public List<String> getIds() {
        return new ArrayList<>(ids);
    }
}
