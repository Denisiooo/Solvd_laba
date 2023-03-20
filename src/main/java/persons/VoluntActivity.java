package persons;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum VoluntActivity {
    LOGISTICS("Logistic"),
    MARKETING("Marketing"),
    AWARDING("Awarding"),
    DOPING_CONTROL("Doping-control"),
    TRANSPORT("Transport");

    private String activity;

    VoluntActivity(String activity) {
        this.activity = activity;
    }

    VoluntActivity() {
    }

    public String getActivity() {
        return activity;
    }

    public static int generateRandomCount(){
        return (int)(Math.random()*10000 + 1000);
    }

//    @Override
//    public String toString() {
//        return "We also ask you to clap our volunteers from the department that deals with \nA total of " + generateRandomCount() + " people were involved for volunteering";
//    }
}
