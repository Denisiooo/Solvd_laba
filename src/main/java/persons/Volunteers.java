package persons;

import countries.Country;

public class Volunteers extends Country {
    private final static int numberOfVolunteers = 5000;
    VoluntActivity volActivity;
    Country country;

    public Volunteers(String countryName, String city, VoluntActivity activity) {
        super(countryName, city);
        volActivity = activity;
    }

    public VoluntActivity getVolActivity() {
        return volActivity;
    }

    public Country getCountry() {
        return country;
    }
}
