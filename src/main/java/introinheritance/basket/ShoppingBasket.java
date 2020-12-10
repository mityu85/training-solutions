package introinheritance.basket;

public class ShoppingBasket {

    Basket basket;

    public void addItem(Item item) {
        basket.addItem(item);
    }

    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }

    public double sumNettoPrice() {
        double sum = 0.0;
        for (Item item: basket.getItems()) {
            sum += item.getNettoPrice();
        }
        return sum;
    }// az összes tételre

    public double sumTaxValue() {
        double sum = 0.0;
        for (Item item: basket.getItems()) {
            sum += item.getTaxAmount();
        }
        return sum;
    }  // az összes tételre

    public double sumBruttoPrice() {
        double sum = 0.0;
        for (Item item: basket.getItems()) {
            sum += item.getNettoPrice() + item.getNettoPrice() * item.getTaxAmount();
        }
        return sum;
    }

    public void checkout() {
        basket.clearBasket();
    }// befejezzük a vásárlást, a kosár ürítése

    public void removeMostExpensiveItem() {
        double theMostExpensiveItem = Double.MIN_VALUE;
        for (Item item: basket.getItems()) {
            if (item.getNettoPrice() > theMostExpensiveItem) {
                theMostExpensiveItem = item.getNettoPrice();
            }
            basket.getItems().remove(theMostExpensiveItem);
        }
    }// kikeresi és eltávolítja a kosárból a legdrágább tételt
}
