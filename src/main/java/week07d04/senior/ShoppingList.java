package week07d04.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ShoppingList {

    public long calculateSum(String path) {
        long sum = 0;
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(";");
                sum += Integer.parseInt(temp[1]) * Integer.parseInt(temp[2]);
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found", e);
        }
        return sum;
    }
}
