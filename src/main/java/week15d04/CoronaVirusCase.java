package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CoronaVirusCase {

    public List<Integer> countVirusCases(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            List<Integer> integerList = new ArrayList<>();
            List<Integer> result = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                integerList.add(Integer.parseInt(temp[2]));
            }
            Collections.sort(integerList);
            for (int i = integerList.size()-1; i > integerList.size()-4; i--) {
                result.add(integerList.get(i));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
    }
}
