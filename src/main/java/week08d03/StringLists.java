package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> unionList = new ArrayList<>();
        for (String firstItem: first) {
            unionList.add(firstItem);
        }
        for (String secondItem: second) {
            unionList.add(secondItem);
        }
        for (int i = 0; i < unionList.size()-2; i++) {
            for (int j = 1; j < unionList.size(); j++) {
                if (unionList.get(i).equals(unionList.get(j))) {
                    unionList.remove(unionList.get(j));
                }
            }
        }
        return unionList;
    }

    public List<String> shortestWord(List<String> words) {
        List<String> shortestWords = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (String word: words) {
            if (word.length() < min) {
                min = word.length();
            }
        }
        return getShortestWords(words, shortestWords, min);
    }

    private List<String> getShortestWords(List<String> words, List<String> shortestWords, int min) {
        for (String word: words) {
            if (word.length() == min) {
                shortestWords.add(word);
            }
        }
        return shortestWords;
    }
}
