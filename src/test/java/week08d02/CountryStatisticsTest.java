package week08d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryStatisticsTest {

    private CountryStatistics countryStatistics = new CountryStatistics();

    @BeforeEach
    public void init() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(CountryStatisticsTest.class.getResourceAsStream("/countries.txt")))) {
            countryStatistics.readToList(br);
        } catch (IOException e) {
            throw new IllegalStateException("File cannot read", e);
        }
    }

    @Test
    public void readTest() {
        assertEquals(11, countryStatistics.getCountries().size());
    }

    @Test
    public void listImmutableTest() {
        countryStatistics.getCountries().add(new Country("Albania", 45, 2, 3));
        assertEquals(11, countryStatistics.getCountries().size());
    }

    @Test
    public void maxPopulationTest() { 
        assertEquals(countryStatistics.getCountries().get(2), countryStatistics.maxPopulation());
    }
}
