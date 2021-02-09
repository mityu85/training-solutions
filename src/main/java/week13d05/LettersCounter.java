package week13d05;

import java.util.HashSet;
import java.util.Set;

public class LettersCounter {

    public int differentLettersCounter(String word) {
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ')
            chars.add(word.toLowerCase().charAt(i));
        }
        return chars.size();
    }
}
