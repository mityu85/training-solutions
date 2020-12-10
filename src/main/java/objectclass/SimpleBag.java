package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private List<Object> items = new ArrayList<>();
    private int cursor = -1;

    public void putItem(Object item) {
        items.add(item);
        cursor++;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return  items.size();
    }

    public void beforeFirst() {
        cursor = -1;
    }

    public boolean hasNext() {
        return cursor < items.size();
    }

    public Object next() {
        Object resultItem = null;
        if (items.indexOf(cursor) < items.size()-1) {
            resultItem = items.get(cursor+1);
        }
        return resultItem;
    }

    public boolean contains(Object item) {
        return items.contains(item);
    }

    public int getCursor() {
        return cursor;
    }
}
