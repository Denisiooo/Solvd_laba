package results;

import competition.Competitors;
import teams.FirstTeam;
import teams.SecondTeam;

public class Award {
    private FirstTeam firstTeam;
    private SecondTeam secondTeam;
    private Competitors competitors;
    private String kindOfAward;
    private int prizeFund;

    public Award(String kindOfAward, int prizeFund) {
        this.kindOfAward = kindOfAward;
        this.prizeFund = prizeFund;
    }

    public String getKindOfAward() {
        return kindOfAward;
    }

    public void setKindOfAward(String kindOfAward) {
        this.kindOfAward = kindOfAward;
    }

    public int getPrizeFund() {
        return prizeFund;
    }

    public void setPrizeFund(int prizeFund) {
        this.prizeFund = prizeFund;
    }

    public void prizeDistribution(){
        if (firstTeam.getTeam1().equals("Win")){
            firstTeam.setAward("You won the cup and your prize fund is ");
            firstTeam.setPrizeFund(100);
            System.out.println(firstTeam.getAward() + firstTeam.getPrizeFund());
        }else if(secondTeam.getTeam2().equals("Win")){
            secondTeam.setAward("You won the cup and your prize fund is ");
            secondTeam.setPrizeFund(100);
            System.out.println(secondTeam.getAward() + secondTeam.getPrizeFund());
        }else {
            System.out.println("Teams tied");
        }
    }

}