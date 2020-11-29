package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    public void testUser() {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("John", "Doe", "alma.hu"));
        assertEquals("Wrong email!", ex.getMessage());
    }

    @Test
    public void testFullName() {
        assertEquals("John Doe", new User("John", "Doe", "@."));
    }
}
