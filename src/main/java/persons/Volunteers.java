package persons;

public class Volunteers {
    private double numberOfVolunteers;
    private String kindOfActivity;

    public Volunteers(double numberOfVolunteers, String kindOfActivity) {
        this.numberOfVolunteers = numberOfVolunteers;
        this.kindOfActivity = kindOfActivity;
    }

    public double getNumberOfVolunteers() {
        return numberOfVolunteers;
    }

    public void setNumberOfVolunteers(double numberOfVolunteers) {
        this.numberOfVolunteers = numberOfVolunteers;
    }

    public String getKindOfActivity() {
        return kindOfActivity;
    }

    public void setKindOfActivity(String kindOfActivity) {
        this.kindOfActivity = kindOfActivity;
    }
}
