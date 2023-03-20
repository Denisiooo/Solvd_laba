package results;

import games.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Award {
    static final Logger LOGGER = LogManager.getLogger(Award.class);

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
            case "Biathlon" -> LOGGER.info("Team " + sport.getWinner() + " are rewarded with a trophy and $100,000");
            case "Cycling" -> LOGGER.info("Team " + sport.getWinner() + " are rewarded with a trophy and $100,000");
            case "Hockey" -> LOGGER.info("Team " + sport.getWinner() + " are rewarded with a trophy and $100,000");
            case "Skiing" -> LOGGER.info("Team " + sport.getWinner() + " are rewarded with a trophy and $100,000");
            default -> LOGGER.info("Team " + sport.getWinner() + " are rewarded with a trophy and $100,000");
        }
    }
}
