package week06d05.senior;

import immutable.satellite.CelestialCoordinates;
import immutable.satellite.Satellite;
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
        Exception ex = assertThrows(IllegalArgumentException.class, () -> petBottle.fill(100));
        assertEquals("The Bottle is full", ex.getMessage());
        glassBottle.fill(42);
        assertEquals(42, glassBottle.getFilledUntil());
        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> glassBottle.fill(100));
        assertEquals("The Bottle is full", ex2.getMessage());
    }

}
