package week06d04.senior;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void testAddExistingItem() {
        shoppingCart.addItem("apple", 10);
        shoppingCart.addItem("apple", 15);
        assertEquals(25, shoppingCart.getItem("apple"));
    }

    @Test void testAddNewItem() {
        shoppingCart.addItem("banana", 12);
        shoppingCart.addItem("apple", 10);
        shoppingCart.addItem("apple", 15);
        assertEquals(2, shoppingCart.getItems().size());
    }
}
