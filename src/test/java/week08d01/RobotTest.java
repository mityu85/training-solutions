package week08d01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RobotTest {

    Robot robot = new Robot(new Position(0, 0));

    @Test
    public void testRobotMove() {
        assertEquals("Robot position: (" + 3 + " " + -3 + ")", robot.move("FFLLLLLBBBBJJJJJJJ"));
    }

    @Test
    public void testIllegalArgumentException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> robot.move("FFFLLLA"));
        assertEquals("Please choose from the following letters: (F = up, L = down, B = left, J = right)", ex.getMessage());
    }
}
