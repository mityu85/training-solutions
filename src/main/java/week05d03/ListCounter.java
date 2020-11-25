package week05d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCounter {

    public int aCounter(List<String> words) {

        words = new ArrayList<>(words);
        int counter = 0;
        for (String word: words) {
            if (word.startsWith("a") || word.startsWith("A")) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        ListCounter listCounter = new ListCounter();
        int result = listCounter.aCounter(Arrays.asList("apple", "pear", "Atlantis", "Russia", "anchor"));
        System.out.println(result);
    }
}
