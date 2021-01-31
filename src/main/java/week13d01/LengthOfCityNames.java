package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LengthOfCityNames {

    public String theMostLengthNameOfCity(InputStream is) {
        String name = "";
        int max = Integer.MIN_VALUE;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(";");
                if (temp[1].length() > max) {
                    max = temp[1].length();
                    name = temp[1];
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
        return name;
    }
}
