package week06d04.senior;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart(List<Item> items) {
        this.items = new ArrayList<>(items);
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(String name, int quantity) {
        List<Item> itemList = new ArrayList<>();
        for (Item item: items) {
            if (name.equals(item.getName())) {
               item.addQuantity(quantity);
               itemList.add(item);
            }
        }
        if (itemList.size() == 0) {
            items.add(new Item(name, quantity));
        }
    }

    public int getItem(String name) {
        int quantity = 0;
        for (Item item: items) {
            if (name.equals(item.getName())) {
               quantity = item.getQuantity();
            }
        }
        return quantity;
    }
}
