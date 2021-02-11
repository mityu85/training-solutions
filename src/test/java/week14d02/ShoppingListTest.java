package week14d02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingListTest {

    ShoppingList shoppingList = new ShoppingList();

    @Test
    public void testUpLoad() {
        shoppingList.upLoad(Path.of("src/main/resources/shopping.txt"));
        assertEquals(9, shoppingList.getShopping().entrySet().size());
    }
}
