package week05d04;

public class ProductMain {

    public static void main(String[] args) {

        Product product = new Product(150, Currency.HUF);
        double result = product.convertPrice(Currency.USD);

        System.out.println(result);
    }
}
