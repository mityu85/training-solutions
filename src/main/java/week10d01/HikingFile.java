package week10d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HikingFile {

    public String getPlusElevation(InputStream is) {
        String str = null;
        double longitude = 0.0;
        double latitude = 0.0;
        double result = 0.0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(", ");
                longitude -= Double.parseDouble(temp[0]);
                latitude -= Double.parseDouble(temp[1]);
                result = longitude + latitude;
            }
            if (latitude >= 0) {
                str = "ascend: " + result;
            }
            if (latitude < 0) {
                str = "descend: " + result;
            }
            return str;
        } catch (IOException e) {
            throw new IllegalStateException("File cannot read", e);
        }
    }
}
