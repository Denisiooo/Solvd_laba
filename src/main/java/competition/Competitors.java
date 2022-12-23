package competition;

import countries.Country;
import persons.Players;
import teams.FirstTeam;
import teams.SecondTeam;

import java.util.Objects;

public class Competitors {
    private FirstTeam firstTeam;
    private SecondTeam secondTeam;
    private double score;

    public Competitors(FirstTeam firstTeam, SecondTeam secondTeam) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    public FirstTeam getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(FirstTeam firstTeam) {
        this.firstTeam = firstTeam;
    }

    public SecondTeam getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(SecondTeam secondTeam) {
        this.secondTeam = secondTeam;
    }

    public void scoreTeams(){
        double t1 =Math.random()*10;
        double t2 =Math.random()*10;
        if (t1>t2){
            System.out.println(firstTeam.getNameOfTeam() + " Wins");
            firstTeam.setTeam1("Win");
        }else if(t1<t2){
            System.out.println(secondTeam.getNameOfTeam() + " Wins");
            secondTeam.setTeam2("Win");
        }else {
            System.out.println("Draw");
            firstTeam.setTeam1("Same result");
            secondTeam.setTeam2("Same result");
        }
    }

    @Override
    public String toString() {
        return "Competitors: " +
                "firstTeam= " + firstTeam +
                ", secondTeam= " + secondTeam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Competitors that = (Competitors) o;
        return Double.compare(that.score, score) == 0 && Objects.equals(firstTeam, that.firstTeam) && Objects.equals(secondTeam, that.secondTeam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstTeam, secondTeam, score);
    }
}
