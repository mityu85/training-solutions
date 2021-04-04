package week08d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries = new ArrayList<>();

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }

    public List<Country> readToList(Reader reader) {
        try (BufferedReader br = new BufferedReader(reader)){
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(" ");
                countries.add(new Country(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3])));
            }
            return countries;
        } catch (IOException e) {
            throw new IllegalStateException("File cannot read", e);
        }
    }

    public Country maxPopulation() {
        int max = Integer.MIN_VALUE;
        Country countryResult = null;
        for (Country country: countries) {
            if (country.getPopulation() > max) {
                max = country.getPopulation();
                countryResult = country;
            }
        }
        return countryResult;
    }
}
