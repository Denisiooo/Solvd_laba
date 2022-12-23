package games;

import javax.sql.rowset.spi.SyncResolver;

public class Cycling {
    private String nameOfTheGame;
    private String season;
    private String raceType;
    private int distance;
    private String trackType;
    private String country;

    public Cycling(String nameOfTheGame, String season, String raceType, int distance, String trackType, String country) {
        this.nameOfTheGame=nameOfTheGame;
        this.season=season;
        this.raceType = raceType;
        this.distance = distance;
        this.trackType = trackType;
        this.country=country;
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

    public String getRaceType() {
        return raceType;
    }

    public void setRaceType(String raceType) {
        this.raceType = raceType;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getTrackType() {
        return trackType;
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
