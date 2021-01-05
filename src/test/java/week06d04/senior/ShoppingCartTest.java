package week06d04.senior;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    List<Item> items = Arrays.asList(
            new Item("apple", 10),
            new Item("pear", 5),
            new Item("grape", 18)
    );
    ShoppingCart shoppingCart = new ShoppingCart(items);

    @Test
    public void testAddExistingItem() {
        shoppingCart.addItem("apple", 15);
        assertEquals(25, shoppingCart.getItem("apple"));
    }

    @Test void testAddNewItem() {
        shoppingCart.addItem("banana", 10);
        assertEquals(4, shoppingCart.getItems().size());
    }
}
