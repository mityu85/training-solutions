package week06d05.senior;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BottleTest {

    Bottle petBottle = new Bottle(BottleType.PET_BOTTLE);
    Bottle glassBottle = new Bottle(BottleType.GLASS_BOTTLE);

    @Test
    public void testFill() {
        petBottle.fill(15);
        assertEquals(15, petBottle.getFilledUntil());
        glassBottle.fill(42);
        assertEquals(42, glassBottle.getFilledUntil());
    }

}
