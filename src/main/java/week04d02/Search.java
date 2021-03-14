package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String word, char c) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if(word.substring(i, i+1).equals(String.valueOf(c))) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
