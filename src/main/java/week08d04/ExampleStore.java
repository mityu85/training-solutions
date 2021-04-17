package week08d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ExampleStore {

    public List<String> getTitlesOfExamples() {
        List<String> titles = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(ExampleStore.class.getResourceAsStream("/examples.md")))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("#")) {
                    titles.add(line.substring(2));
                }
            }
            return titles;
        } catch (IOException e) {
            throw new IllegalStateException("File cannot read", e);
        }
    }
}
