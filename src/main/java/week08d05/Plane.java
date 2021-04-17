package week08d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class Plane {

    public int getLongestOcean(Reader r) {
        int max = Integer.MIN_VALUE;
        int counter = 0;
        try(BufferedReader br = new BufferedReader(r)) {
            int c;
            while ((c = br.read()) != -1) {
                char character = (char) c;
                if (character == '0') {
                    counter++;
                } else {
                    if (counter > max) {
                        max = counter;
                    }
                    counter = 0;
                }
            }
            return max;
        } catch (IOException e) {
            throw new IllegalStateException("File cannot read", e);
        }
    }
}
