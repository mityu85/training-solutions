package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotalPrice() {
        List<Double> price = new ArrayList<>();
        for (Item i: items) {
            double mul = i.getPrice() * i.getQuantity();
            price.add(mul);
        }
        double sum = 0;
        for (double p: price) {
            sum += p;
        }
        return sum;
    }
}
