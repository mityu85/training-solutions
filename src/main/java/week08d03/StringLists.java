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
}
