package persons;

public class Fans extends Person{
    private final static int numberOfFans = 50000;
    private String partOfCompetition;
    private String gameType;

    public Fans(String partOfCompetition, String gameType) {
        this.partOfCompetition = partOfCompetition;
        this.gameType = gameType;
    }

    public int getNumberOfFans() {
        return numberOfFans;
    }

    public String getPartOfCompetition() {
        return partOfCompetition;
    }

    public void setPartOfCompetition(String partOfCompetition) {
        this.partOfCompetition = partOfCompetition;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }



    @Override
    public void gameType() {
        System.out.println("Fan is watching " + getPartOfCompetition() + " of the " + getGameType());
    }
}
