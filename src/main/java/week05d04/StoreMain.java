package week05d04;

import java.util.Arrays;

import static java.util.Arrays.*;

public class StoreMain {

    public static void main(String[] args) {

        Store store = new Store();
        store.addProduct(new Product("Bounty chocolate", 2020, 12,10));
        store.addProduct(new Product("KitKat chocolate", 2020, 11,10));
        store.addProduct(new Product("M&Ms chocolate", 2020, 10,10));

        int result = store.getNumberOfExpired();

        System.out.println(result);
    }
}
