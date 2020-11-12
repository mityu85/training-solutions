package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public void addItem(String word, List<String> translations) {
        for (DictionaryItem item: dictionaryItems) {
            if (item.getWord().equals(word)) {
                item.addTranslations(translations);
            } else {
                dictionaryItems.add(new DictionaryItem(word, translations));
            }
        }
    }

    public List<String> findTranslations(String word) {
        for (DictionaryItem wordItem: dictionaryItems) {
            if (wordItem.getWord().equals(word)) {
                return wordItem.getTranslations();
            }
        }
        return new ArrayList<>();
    }
}
