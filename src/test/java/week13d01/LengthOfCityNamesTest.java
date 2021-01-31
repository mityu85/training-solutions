package week13d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfCityNamesTest {

    LengthOfCityNames locm = new LengthOfCityNames();

    @Test
    public void testCityNameCount() {
        assertEquals("Jászfelsőszentgyörgy", locm.theMostLengthNameOfCity(LengthOfCityNamesTest.class.getResourceAsStream("/iranyitoszamok-varosok-2021.csv")));
    }
}
