package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SultanTest {

    Sultan sultan = new Sultan();

    @Test
    public void testOpenDoor() {

        assertEquals("", sultan.openDoors());
    }
}
