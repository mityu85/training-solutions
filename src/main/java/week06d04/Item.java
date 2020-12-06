package week06d04;

public class Item {

    private int price;
    private int month;
    private String name;

    private boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public Item(int price, int month, String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Empty name!");
        }
        this.price = price;
        this.month = month;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}
