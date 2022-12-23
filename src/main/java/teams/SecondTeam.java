package teams;

import countries.Country;

import java.util.Objects;

public class SecondTeam {
    private Country country;
    private String kindOfSport;
    private String nameOfTeam;
    private String team2;
    private String award;
    private int prizeFund;

    public SecondTeam(Country country, String kindOfSport, String nameOfTeam) {
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

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
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
        return "SecondTeam " +
                "kindOfSport= " + kindOfSport + '\'' +
                ", nameOfTeam= " + nameOfTeam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecondTeam that = (SecondTeam) o;
        return Objects.equals(country, that.country) && Objects.equals(kindOfSport, that.kindOfSport) && Objects.equals(nameOfTeam, that.nameOfTeam) && Objects.equals(team2, that.team2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, kindOfSport, nameOfTeam, team2);
    }
}
