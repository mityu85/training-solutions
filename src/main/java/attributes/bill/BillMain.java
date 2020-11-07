package attributes.bill;

public class BillMain {

    public static void main(String[] args) {

        Item apple = new Item("apple", 10, 490);
        Item pear = new Item("pear", 5, 390);
        Item grape = new Item("grape", 8, 690);

        Bill bill = new Bill();

        bill.addItem(apple);
        bill.addItem(pear);
        bill.addItem(grape);

        double sum = bill.calculateTotalPrice();
        System.out.println(sum);
    }
}
