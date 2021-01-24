package ioreaderclasspath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries = new ArrayList<>();

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }

    public void readCountriesFromFileToList() {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(
                CountryStatistics.class.getResourceAsStream("/country.txt")
        ))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] temp = line.split(" ");
                countries.add(new Country(temp[0], Integer.parseInt(temp[1])));
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not found", e);
        }
    }

    public int howManyCountriesHaveBeenRead() {
        readCountriesFromFileToList();
        int sum = 0;
        for (Country country: countries) {
            sum++;
        }
        return sum;
    }

    public Country whichCountryHaveTheMostNeighbor() {
        int num = 0;
        Country c = new Country(" ", 0);
        for (Country country: countries) {
            if (country.getNumber() > num) {
                num = country.getNumber();
            }
        }
        for (Country country: countries) {
            if (country.getNumber() == num) {
                c = country;
            }
        }
        return c;
    }
}
