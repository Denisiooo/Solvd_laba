package persons;

public enum Volont {
    LOGISTICS("Logistic"),
    MARKETING("Marketing"),
    AWARDING("Awarding"),
    DOPING_CONTROL("Doping-control"),
    TRANSPORT("Transport");

    private String activity;

    Volont(String activity) {
        this.activity = activity;
    }

    public String getActivity(){
        return activity;
    }
}
