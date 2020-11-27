package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void risePrice(int percent) {
        double result = (percent / 100.0) * price;
        price += (int) result;
    }

    public int comparePricePerCapacity(Pendrive pendrive) {
        int result = 0;
        if (price / capacity > pendrive.price / pendrive.capacity) {
            result = 1;
        }
        if (price / capacity < pendrive.price / pendrive.capacity) {
            result = -1;
        }
        return result;
    }

    public boolean cheaperThan(Pendrive pendrive) {
        return price < pendrive.price;
    }

    public String toString() {
        return name + " (" + capacity + " Gb " + price + " Ft)";
    }
}
