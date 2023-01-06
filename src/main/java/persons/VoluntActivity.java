package persons;

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

    public String getActivity() {
        return activity;
    }

    @Override
    public String toString() {
        return "VoluntActivity{" +
                "activity='" + activity + '\'' +
                '}';
    }
}
