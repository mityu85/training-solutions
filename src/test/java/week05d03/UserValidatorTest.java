package week05d03;

import introexception.patient.Patient;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {

    @Test
    public void testValid() {
        assertThrows(IllegalArgumentException.class, () -> new UserValidator().validate(Arrays.asList(
                new User("", 100),
                new User(null, 10),
                new User("John Doe", -1),
                new User("John Doe", 121),
                new User("", 121)
        )));
    }
}
