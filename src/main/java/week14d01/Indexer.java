package week14d01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names) {

        Map<Character, List<String>> values = new HashMap<>();
        for (String name: names) {
            List<String> strList = new ArrayList<>();
            strList.add(name);
            values.put(name.charAt(0), strList);
        }
        return values;
    }
}
