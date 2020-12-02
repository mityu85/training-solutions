package week06d02;

import java.util.Arrays;

public class StoreMain {

    public static void main(String[] args) {

        Product product1 = new Product("apple", Category.FROZEN, 1500);
        Product product2 = new Product("bread", Category.BAKEDGOODS, 150);
        Product product3 = new Product("pear", Category.FROZEN, 1300);
        Product product4 = new Product("milk", Category.DAIRY, 250);
        Product product5 = new Product("peanuts", Category.OTHER, 1800);
        Product product6 = new Product("seeds", Category.OTHER, 2100);

        Store store = new Store(Arrays.asList(
                product1, product2, product3, product4, product5, product6
        ));

        System.out.println(store.getProductsByCategory());
    }
}
