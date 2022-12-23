package games;

public class Volleyball {
    private String nameOfTheGame;
    private String season;
    private String numberOfPlayers;
    private String gender;
    private String country;

    public Volleyball(String nameOfTheGame, String season, String numberOfPlayers, String gender, String country) {
        this.nameOfTheGame = nameOfTheGame;
        this.season = season;
        this.numberOfPlayers = numberOfPlayers;
        this.gender = gender;
        this.country = country;
    }

    public String getNameOfTheGame() {
        return nameOfTheGame;
    }

    public void setNameOfTheGame(String nameOfTheGame) {
        this.nameOfTheGame = nameOfTheGame;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(String numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
