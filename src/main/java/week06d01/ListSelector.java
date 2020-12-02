package week06d01;

import java.util.ArrayList;
import java.util.List;

public class ListSelector {

    public List<String> evenWordList(List<String> words) {
        words = new ArrayList<>(words);
        List<String> resultWords = new ArrayList<>();
        for (int i = 0; i < words.size(); i += 2) {
            if (words.get(i) == null) {
                throw new IllegalArgumentException("Null");
            }
            resultWords.add(words.get(i));
        }
        return resultWords;
    }
}
