package exam03retake01;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owls = new HashMap<>();

    public void readFromFile(Reader reader) {
        try (BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split("=");
                owls.put(temp[0], Integer.parseInt(temp[1]));
            }
        } catch (IOException e) {
            throw new IllegalStateException("File cannot read");
        }
    }

    public int getNumberOfOwls(String str) {
        return owls.get(str);
    }
}
