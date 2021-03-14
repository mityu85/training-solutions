package week02d03;

public class Product {

    private String name;
    private int price;

    public Product (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice(int num) {
        price += num;
    }

    public void decreasePrice(int num) {
        price -= num;
    }
}
