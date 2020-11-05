package finalmodifier;

public class TaxCalculator {

    public static final double VAT = 0.27;

    public double tax(double price) {
        return price * VAT;
    }

    public double priceWithTax(double price) {
        return price + price * VAT;
    }

    public static void main(String[] args) {

        double price = new TaxCalculator().tax(5000);
        double priceWithTax = new TaxCalculator().priceWithTax(5000);
        System.out.println(price);
        System.out.println(priceWithTax);
    }
}
