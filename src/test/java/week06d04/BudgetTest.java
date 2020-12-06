package week06d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {

    @Test
    public void testBudget() {

        List<Item> items = new ArrayList<>(Arrays.asList(
                new Item(1500, 12, "book"),
                new Item(1800, 12, "chair"),
                new Item(300, 10, "paper")));

        Budget budget = new Budget(items);

        assertEquals(2, budget.getItemsByMonth(12).size());
    }
}
