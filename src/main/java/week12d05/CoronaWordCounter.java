package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CoronaWordCounter {

    private int counter;

    public int coronaVirusWordCounter(InputStream is) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringSearchInLine("koronavírus", " ", line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
        return counter;
    }

    private void stringSearchInLine(String str, String delimiter, String line) {
        String[] temp = line.split(delimiter);
        for (String t: temp) {
            if (t.toLowerCase().contains(str)) {
                counter++;
            }
        }
    }
}
