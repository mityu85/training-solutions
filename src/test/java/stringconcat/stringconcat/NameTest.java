package stringconcat.stringconcat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NameTest {

    @Test
    public void testCreateWesterStyle() {
        //Given
        Name nameW = new Name("Doe", "", "John", Title.DR);

        //Then
        assertEquals("DRJohnDoe", nameW.concatNameWesternStyle());
    }

    @Test
    public void testCreateHungarianStyle() {
        //Given
        Name nameH = new Name("Tóth", "", "Mihály");

        //Then
        assertEquals("Tóth Mihály", nameH.concatNameHungarianStyle());
    }

    @Test
    public void invalidParametersShouldThrowExceptionNullFamilyName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Name("", "G", "John", Title.MR));
        assertEquals("isEmpty!", ex.getMessage());
    }

}
