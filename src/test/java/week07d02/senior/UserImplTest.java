package week07d02.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserImplTest {

    UserImpl user = new UserImpl("doejohn", "john", "Doe");
    User user2 = User.of("doejack", "Jack", "Doe");

    @Test
    public void testUserImp() {
        assertEquals("doejohn", user.getUserName());
    }

    @Test
    public void testUser() {
        assertEquals("Jack", user2.getFirstName());
    }
}
