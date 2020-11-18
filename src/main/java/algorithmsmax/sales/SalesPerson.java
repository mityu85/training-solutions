package algorithmsmax.sales;

public class SalesPerson {

    private String name;
    private int amount;
    private int target;

    public SalesPerson(String name, int amount, int target) {
        this.name = name;
        this.amount = amount;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getTarget() {
        return target;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getDifference() {

        return amount - target;
    }
}
