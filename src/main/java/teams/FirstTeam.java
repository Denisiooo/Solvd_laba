package teams;

import countries.Country;

public class FirstTeam {
    private Country country;
    private String kindOfSport;
    private String nameOfTeam;
    private String team1;
    private String award;
    private int prizeFund;

    public FirstTeam(Country country, String kindOfSport, String nameOfTeam) {
        this.country = country;
        this.kindOfSport = kindOfSport;
        this.nameOfTeam = nameOfTeam;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public String getNameOfTeam() {
        return nameOfTeam;
    }

    public void setNameOfTeam(String nameOfTeam) {
        this.nameOfTeam = nameOfTeam;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getPrizeFund() {
        return prizeFund;
    }

    public void setPrizeFund(int prizeFund) {
        this.prizeFund = prizeFund;
    }

    @Override
    public String toString() {
        return "FirstTeam " +
                "kindOfSport= " + kindOfSport + '\'' +
                ", nameOfTeam= " + nameOfTeam;
    }
}
