package games;

public class Skiing {
    private String nameOfTheGame;
    private String nameOfSkiing;
    private String country;
    private String season;

    public Skiing(String nameOfTheGame, String nameOfSkiing, String country, String season) {
        this.nameOfTheGame=nameOfTheGame;
        this.nameOfSkiing = nameOfSkiing;
        this.country = country;
        this.season = season;
    }

    public String getNameOfTheGame() {
        return nameOfTheGame;
    }

    public void setNameOfTheGame(String nameOfTheGame) {
        this.nameOfTheGame = nameOfTheGame;
    }

    public String getNameOfSkiing() {
        return nameOfSkiing;
    }

    public void setNameOfSkiing(String nameOfSkiing) {
        this.nameOfSkiing = nameOfSkiing;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
