package week02d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Languages {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "JavaScript");
        for (String word: words) {
            if (word.length() > 5) {
                System.out.println(word);
            }
        }
    }
}
