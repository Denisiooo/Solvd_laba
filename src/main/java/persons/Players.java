package persons;

public class Players extends Person{
    private String country;
    private double avgPlayersAge;
    private String sportswearColor;
    private String kindOfSport;

    public Players(String nameOfPerson,String surnameOfPerson, String country, double avgPlayersAge, String sportswearColor, String kindOfSport) {
        super(nameOfPerson, surnameOfPerson);
        this.country = country;
        this.avgPlayersAge = avgPlayersAge;
        this.sportswearColor = sportswearColor;
        this.kindOfSport = kindOfSport;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getAvgPlayersAge() {
        return avgPlayersAge;
    }

    public void setAvgPlayersAge(double avgPlayersAge) {
        this.avgPlayersAge = avgPlayersAge;
    }

    public String getSportswearColor() {
        return sportswearColor;
    }

    public void setSportswearColor(String sportswearColor) {
        this.sportswearColor = sportswearColor;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    @Override
    public void gameType() {
        System.out.println("The player " + getNameOfPerson() + " " + getSurnameOfPerson() + " is playing " + getKindOfSport());
    }
}
