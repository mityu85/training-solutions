package week07d04.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingListTest {

    ShoppingList shoppingList = new ShoppingList();

    @Test
    public void testCalc() {
        assertEquals(3360, shoppingList.calculateSum("src/main/resources/shoppinglist.txt"));
    }
}
