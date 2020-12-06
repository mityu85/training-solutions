package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Item> items;

    public Budget(List<Item> items) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Empty itemList!");
        }
        this.items = items;
    }

    public List<Item> getItemsByMonth(int month) {
        if (month == 0) {
            throw new IllegalArgumentException("Month is 0!");
        }
        List<Item> itemList = new ArrayList<>();
        for (Item item: items) {
            if (item.getMonth() == month) {
                itemList.add(item);
            }
        }
        return itemList;
    }
}
