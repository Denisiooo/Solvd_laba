package results;

import games.*;

public class Award {
    Biathlon b = new Biathlon();
    Cycling c = new Cycling();
    Hockey h = new Hockey();
    Skiing s = new Skiing();
    Volleyball v = new Volleyball();
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
        b.gameName();
        if(b.getNameOfTheGame().equals("Biathlon")){
            System.out.println("Team " + b.getWinner() + " are rewarded with a trophy and $100,000");
        }else if(c.getNameOfTheGame().equals("Cycling")){
            System.out.println("Team " + c.getWinner() + " are rewarded with a trophy and $100,000");
        }else if(h.getNameOfTheGame().equals("Hockey")){
            System.out.println("Team " + h.getWinner() + " are rewarded with a trophy and $100,000");
        }else if(s.getNameOfTheGame().equals("Skiing")){
            System.out.println("Team " + s.getWinner() + " are rewarded with a trophy and $100,000");
        }else {
            System.out.println("Team " + v.getWinner() + " are rewarded with a trophy and $100,000");
        }
    }

}