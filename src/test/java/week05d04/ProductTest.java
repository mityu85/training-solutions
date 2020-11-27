package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testProduct() {
        Product product = new Product(150, Currency.HUF);
        assertEquals(0.5, product.convertPrice(Currency.USD));
    }
}
