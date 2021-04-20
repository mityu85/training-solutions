package exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LottoReader {

    private int[] numbers = new int[90];

    public LottoReader(InputStream is) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(";");
                for (int i = 11; i <= 15; i++) {
                    numbers[Integer.parseInt(temp[i])-1]++;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File cannot read", e);
        }
    }

    public int getNumber(int number) {
        return numbers[number-1];
    }
}
