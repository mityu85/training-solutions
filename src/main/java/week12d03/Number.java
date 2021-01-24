package week12d03;

public class Number {

    private int value;
    private int quantity;

    public Number(int value, int quantity) {
        this.value = value;
        this.quantity = quantity;
    }

    public int getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void add() {
        quantity++;
    }
}
