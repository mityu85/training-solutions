package week11d04;

import java.util.ArrayList;
import java.util.List;

public class NameLength {

    public List<Integer> getLengths(List<String> names) {
        List<Integer> lengths = new ArrayList<>();
        for (String name: names) {
            if (name.startsWith("J") && !(lengths.contains(name.length()))) {
                lengths.add(name.length());
            }
        }
        return lengths;
    }
}
