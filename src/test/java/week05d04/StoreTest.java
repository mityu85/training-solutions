package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void testStore() {
        Store store = new Store();
        store.addProduct(new Product("Bounty chocolate", 2020, 12,10));
        store.addProduct(new Product("KitKat chocolate", 2020, 11,10));
        store.addProduct(new Product("M&Ms chocolate", 2020, 10,10));
        assertEquals(2, store.getNumberOfExpired());
    }
}
