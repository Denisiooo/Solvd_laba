package games;

public class Biathlon implements Rules{
    private String nameOfTheGame;
    private String season;
    private String ski;
    private int skiPolesLength;
    private int minRifleWeight;
    private String country;

    public Biathlon(String nameOfTheGame, String season, String ski, int skiPolesLength, int minRifleWeight, String country) {
        this.nameOfTheGame=nameOfTheGame;
        this.season=season;
        this.ski = ski;
        this.skiPolesLength = skiPolesLength;
        this.minRifleWeight = minRifleWeight;
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

    public String getSki() {
        return ski;
    }

    public void setSki(String ski) {
        this.ski = ski;
    }

    public int getSkiPolesLength() {
        return skiPolesLength;
    }

    public void setSkiPolesLength(int skiPolesLength) {
        this.skiPolesLength = skiPolesLength;
    }

    public int getMinRifleWeight() {
        return minRifleWeight;
    }

    public void setMinRifleWeight(int minRifleWeight) {
        this.minRifleWeight = minRifleWeight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public void rule() {

    }
}
