package week06d05.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BottleTest {

    Bottle petBottle = Bottle.of(BottleType.PET_BOTTLE);
    Bottle glassBottle = Bottle.of(BottleType.GLASS_BOTTLE);

    @Test
    public void testFill() {
        petBottle.fill(15);
        assertEquals(15, petBottle.getFilledUntil());
        Exception ex = assertThrows(IllegalArgumentException.class, () -> petBottle.fill(100));
        assertEquals("The Bottle is full", ex.getMessage());
        glassBottle.fill(42);
        assertEquals(42, glassBottle.getFilledUntil());
        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> glassBottle.fill(100));
        assertEquals("The Bottle is full", ex2.getMessage());
    }

}
