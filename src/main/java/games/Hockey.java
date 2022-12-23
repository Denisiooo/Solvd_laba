package games;

public class Hockey {
    private String nameOfTheGame;
    private int numberOfPlayers;
    private String season;
    private String fieldDimensions;
    private String country;

    public Hockey(String nameOfTheGame, int numberOfPlayers, String season, String fieldDimensions, String country) {
        this.nameOfTheGame=nameOfTheGame;
        this.numberOfPlayers = numberOfPlayers;
        this.season = season;
        this.fieldDimensions = fieldDimensions;
        this.country = country;
    }

    public String getNameOfTheGame() {
        return nameOfTheGame;
    }

    public void setNameOfTheGame(String nameOfTheGame) {
        this.nameOfTheGame = nameOfTheGame;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getFieldDimensions() {
        return fieldDimensions;
    }

    public void setFieldDimensions(String fieldDimensions) {
        this.fieldDimensions = fieldDimensions;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
