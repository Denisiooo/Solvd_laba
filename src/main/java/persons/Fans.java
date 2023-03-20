package persons;

public class Fans extends Person{
    private final static int numberOfFans = 50000;
    private String partOfCompetition;
    private String gameType;
    private String name;

    public Fans(String partOfCompetition, String gameType) {
        this.partOfCompetition = partOfCompetition;
        this.gameType = gameType;
    }

    public Fans() {
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

    public void setName(String name) {
        this.name = name;
    }

    private void printData(){
        System.out.println(gameType + " " + name);
    }

    @Override
    public void gameType() {
        System.out.println("Fan is watching " + getPartOfCompetition() + " of the " + getGameType());
    }
}
