package persons;

public class Volunteers {
    private final static int numberOfVolunteers = 5000;
    Volont v = Volont.AWARDING;
    Volont v2 = Volont.LOGISTICS;
    Volont v3 = Volont.MARKETING;
    Volont v4 = Volont.DOPING_CONTROL;
    Volont v5 = Volont.TRANSPORT;

    public void volontAwarding(){
        System.out.println(v.getActivity());
    }

    public void volontLogistic(){
        System.out.println(v2.getActivity());
    }

    public void volontMarketing(){
        System.out.println(v3.getActivity());
    }

    public void volontDopingControl(){
        System.out.println(v4.getActivity());
    }

    public void volontTransport(){
        System.out.println(v5.getActivity());
    }

//    private String kindOfActivity;
//
//    public Volunteers(String kindOfActivity) {
//        this.kindOfActivity = kindOfActivity;
//    }
//
//    public double getNumberOfVolunteers() {
//        return numberOfVolunteers;
//    }
//
//    public String getKindOfActivity() {
//        return kindOfActivity;
//    }
//
//    public void setKindOfActivity(String kindOfActivity) {
//        this.kindOfActivity = kindOfActivity;
//    }
}
