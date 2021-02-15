package exam03;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Histogram {

    public String createHistogram(Reader r) {
        List<String> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(r)) {
            String line;
            while ((line = br.readLine()) != null) {
                rows.add(line);
            }
            return starWriter(rows);
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
    }

    private String starWriter(List<String> strList) {
        String star = "";
        for (String i: strList) {
            int j = Integer.parseInt(i);
            for (int k = 0; k < j; k++) {
                star += "*";
            }
            star += "\n";
        }
        return star;
    }
}
