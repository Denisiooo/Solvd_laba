package countries;

import games.Biathlon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Country {

    static final Logger LOGGER = LogManager.getLogger(Country.class);

    private String countryName;
    private String city;

    public Country(String countryName, String city) {
        this.countryName = countryName;
        this.city = city;
    }

    public Country() {

    }

    static List<Country> countries = new LinkedList<>();

    public static void randomCountry() {
        countries = Arrays.asList(new Country("Belarus", "Minsk"), new Country("Russia", "Moscow"),
                new Country("Poland", "Warsaw"), new Country("Brazil", "Brazilia"), new Country("Germany", "Berlin"));
        Random rand = new Random();
        LOGGER.info(countries.get(rand.nextInt(countries.size())));
    }

    public String getName() {
        return countryName;
    }

    public void setName(String countryName) {
        this.countryName = countryName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "This year the Olympiad will be held in " + countryName + ", city= " + city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName) && Objects.equals(city, country.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, city);
    }
}
