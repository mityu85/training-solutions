package ioreaderclasspath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryStatisticsTest {

    private CountryStatistics countryStatistics = new CountryStatistics();


    @Test
    public void createListTest() {
        assertEquals(0, countryStatistics.getCountries().size());

        countryStatistics.getCountries().add(new Country("Test", 3));

        assertEquals(0, countryStatistics.getCountries().size());
    }


    @Test
    public void readFromFileTest() {
        assertEquals(countryStatistics.getCountries().size(), 0);
        countryStatistics.readCountriesFromFileToList();

        assertEquals(8, countryStatistics.getCountries().size());

        assertEquals("Austria", countryStatistics.getCountries().get(1).getName());
        assertEquals(1, countryStatistics.getCountries().get(5).getNumber());
    }

    @Test
    public void numberOfCountriesTest() {
    //    assertEquals(0, countryStatistics.howManyCountriesHaveBeenRead());
    //    countryStatistics.readCountriesFromFileToList();

        assertEquals(8, countryStatistics.howManyCountriesHaveBeenRead());
    }


    @Test
    public void mostBorderCountriesTest() {
        countryStatistics.readCountriesFromFileToList();

        assertEquals("Germany", countryStatistics.whichCountryHaveTheMostNeighbor().getName());
        assertEquals(8, countryStatistics.whichCountryHaveTheMostNeighbor().getNumber());

    }
}
