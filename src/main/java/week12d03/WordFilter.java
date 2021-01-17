package week12d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {
        List<String> filteredWords = new ArrayList<>();
        for (String word: words) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    filteredWords.add(word);
                    break;
                }
            }
        }
        return filteredWords;
    }
}
