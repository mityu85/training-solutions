package week08d02;

public class Country {

    private String name;
    private int population;
    private int flagColorNumber;
    private int neighbourCountriesNumber;

    public Country(String name, int population, int flagColorNumber, int neighbourCountriesNumber) {
        this.name = name;
        this.population = population;
        this.flagColorNumber = flagColorNumber;
        this.neighbourCountriesNumber = neighbourCountriesNumber;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getFlagColorNumber() {
        return flagColorNumber;
    }

    public int getNeighbourCountriesNumber() {
        return neighbourCountriesNumber;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", flagColorNumber=" + flagColorNumber +
                ", neighbourCountriesNumber=" + neighbourCountriesNumber +
                '}';
    }
}
