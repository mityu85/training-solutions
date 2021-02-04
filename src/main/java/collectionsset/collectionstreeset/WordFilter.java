package collectionsset.collectionstreeset;

import java.util.Set;
import java.util.TreeSet;

public class WordFilter {

    public Set<String> filterWords(String[] str) {

        Set<String> words = new TreeSet<>();
        for (String s: str) {
            words.add(s);
        }
        return words;
    }
}
