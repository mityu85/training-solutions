package introinheritance.basket;

import java.util.List;

public class Basket {

    private List<Item> items;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String barcode) {
        for (Item item: items) {
            if (item.getBarcode().equals(barcode)) {
                items.remove(item);
            }
        }
    }

    public void clearBasket() {
        List<Item> itemList = items;
        items.removeAll(itemList);
    } //a Basket ürítése

    public List<Item> getItems() {
        return items;
    }  // az Item lista másolatát adja vissza!
}
