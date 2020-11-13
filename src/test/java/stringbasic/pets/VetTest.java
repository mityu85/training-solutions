package stringbasic.pets;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VetTest {

    @Test
    public void testCreateDifferent() {
        // Given
        Vet vet = new Vet();
        vet.add(new Pet("Morzsa", LocalDate.of(2019,10,15),
                Gender.MALE, 000001));
        vet.add(new Pet("Foltos", LocalDate.of(2019,10,15),
                Gender.MALE, 000002));

        assertEquals(2, vet.getPets().size());
    }

    @Test
    public void testCreateSame() {
        // Given
        Vet vet = new Vet();
        vet.add(new Pet("Morzsa", LocalDate.of(2019,10,15),
                Gender.MALE, 000001));
        vet.add(new Pet("Foltos", LocalDate.of(2019,10,15),
                Gender.MALE, 000001));

        assertEquals(1, vet.getPets().size());
    }
}
