package results;

import games.*;

public class Award {
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

    public static void prizeDistribution(Sport sport) {
        switch (sport.getCurrentSport()) {
            case "Biathlon" -> System.out.println("Team " + sport.getWinner() + " are rewarded with a trophy and $100,000");
            case "Cycling" -> System.out.println("Team " + sport.getWinner() + " are rewarded with a trophy and $100,000");
            case "Hockey" -> System.out.println("Team " + sport.getWinner() + " are rewarded with a trophy and $100,000");
            case "Skiing" -> System.out.println("Team " + sport.getWinner() + " are rewarded with a trophy and $100,000");
            default -> System.out.println("Team " + sport.getWinner() + " are rewarded with a trophy and $100,000");
        }
    }
}
