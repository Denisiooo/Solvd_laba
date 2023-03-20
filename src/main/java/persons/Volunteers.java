package persons;

import countries.Country;
import games.Biathlon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Volunteers extends Country {

    VoluntActivity volActivity;

    public Volunteers(VoluntActivity activity) {
        volActivity = activity;
    }

    public VoluntActivity getVolActivity() {
        return volActivity;
    }

}
