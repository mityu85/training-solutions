package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public Map<String, Integer> countWords(Path path,String... words) {
        Map<String, Integer> counter = new HashMap<>();
        Integer i = 0;
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(" ");
                for (String w: words) {
                    for (String t: temp) {
                        if (w.equals(t)) {
                            if (counter.get(w) != null) {
                                i = counter.get(w);
                            }
                            counter.put(w, ++i);
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
        return counter;
    }

    private Integer increaseNumbers(Integer i) {
        if (i != 0) {
            i++;
        }
        return i;
    }
}
