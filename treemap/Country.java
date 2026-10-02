package treemap;

public class Country {
    private int countryCode;
    private String countryName;
    private String population;

    public Country(int countryCode, String countryName, String population) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.population = population;
    }

    public int getCountryCode() {
        return countryCode;
    }

    @Override
    public String toString() {
        return countryCode + " " + countryName + " " + population;
    }
}