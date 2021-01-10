package week09d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SantaClausTest {

    Person john = new Person("John Doe", 14);
    Person jane = new Person("Jane Doe", 13);
    Person jack = new Person("Jack Doe", 15);

    SantaClaus santaClaus = new SantaClaus(List.of(
            john, jane, jack
    ));

    @Test
    public void testSanta() {
        santaClaus.getThroughChimneys();
        assertNotEquals(Present.TOY, jack.getPresent());
    }
}
