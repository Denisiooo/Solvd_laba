package countries;

import java.util.Objects;

public class Country {
    private String countryName;
    private String city;

    public Country(String countryName, String city) {
        this.countryName = countryName;
        this.city = city;
    }


//    public Country() {
//
//    }

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
        return "Country" +
                "name='" + countryName + '\'' +
                ", city='" + city;
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
