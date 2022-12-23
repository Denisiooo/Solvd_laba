package persons;

public class Fans extends Person{
    private int numberOfFans;
    private String partOfCompetition;
    private String gameType;

    public Fans(String nameOfPerson,String surnameOfPerson, int numberOfFans, String partOfCompetition, String gameType) {
        super(nameOfPerson, surnameOfPerson);
        this.numberOfFans = numberOfFans;
        this.partOfCompetition = partOfCompetition;
        this.gameType = gameType;
    }

    public int getNumberOfFans() {
        return numberOfFans;
    }

    public void setNumberOfFans(int numberOfFans) {
        this.numberOfFans = numberOfFans;
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
