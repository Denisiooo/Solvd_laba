package games;

import countries.Country;
import exceptions.TeamsNullException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persons.Referee;
import persons.VoluntActivity;
import persons.Volunteers;

import javax.sql.rowset.spi.SyncResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public final class Cycling extends Sport implements GameRounds {
    static final Logger LOGGER = LogManager.getLogger(Cycling.class);

    private String nameOfTheGame;
    private String season;
    private String raceType;
    private int distance;
    private String trackType;

    public Cycling(String nameOfTheGame, String season, String raceType, int distance, String trackType) {
        super(nameOfTheGame);
        this.nameOfTheGame = nameOfTheGame;
        this.season = season;
        this.raceType = raceType;
        this.distance = distance;
        this.trackType = trackType;
    }

    public Cycling() {
        super("Cycling");
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

    public List<String> getAllTeams() {
        return allTeams;
    }

    public List<String> getFourTeams() {
        return fourTeams;
    }

    public List<String> getTwoTeams() {
        return twoTeams;
    }

    static {
        LOGGER.info("We are glad to welcome you to the Olympic Games.");
        LOGGER.info("Judge for one-eighth will be: ");
        Referee.randomName();
        LOGGER.info("Judge for one-forth will be: ");
        Referee.randomName();
        LOGGER.info("Judge for semi-final will be: ");
        Referee.randomName();
        Volunteers vol = new Volunteers(VoluntActivity.MARKETING);
        LOGGER.info("We also ask you to clap our volunteers from the department that deals with " + vol.getVolActivity() + ". A total of " + VoluntActivity.generateRandomCount() + " people were involved for volunteering");
        Country.randomCountry();
    }

    List<String> allTeams = new ArrayList<>();
    List<String> fourTeams = new ArrayList<>();
    List<String> twoTeams = new ArrayList<>();

    public void addTeam() {
        allTeams.add("Bandits");
        allTeams.add("Chaos");
        allTeams.add("Conquerors");
        allTeams.add("Aces");
        allTeams.add("Assassins");
        allTeams.add("Armada");
        allTeams.add("Amigos");
        allTeams.add("Crew");
        Collections.sort(allTeams);
    }

    @Override
    public void oneEightFinal() throws TeamsNullException {
        if (getAllTeams().size() < 8) {
            throw new TeamsNullException("Numbers of teams should be eight");
        }
        allTeams.stream().sorted().forEach(System.out::print);
        LOGGER.info("All teams that participate in the Olympiad:" + allTeams);
        int count1 = 0;
        int count2 = 1;
        String firstTeam = "";
        String secondTeam = "";
        int numberOfPoint_FirstTeam = 0;
        int numberOfPoint_SecondTeam = 0;

        for (int i = 0; i < 4; i++) {
            numberOfPoint_FirstTeam = (int) (Math.random() * 3);
            numberOfPoint_SecondTeam = (int) (Math.random() * 3);
            while (numberOfPoint_FirstTeam == numberOfPoint_SecondTeam) {
                numberOfPoint_FirstTeam = (int) (Math.random() * 3);
                numberOfPoint_SecondTeam = (int) (Math.random() * 3);
            }
            firstTeam = allTeams.get(count1);
            secondTeam = allTeams.get(count2);
            count1 += 2;
            count2 += 2;
            if (numberOfPoint_FirstTeam > numberOfPoint_SecondTeam) {
                fourTeams.add(firstTeam);
            } else {
                fourTeams.add(secondTeam);
            }
        }
        LOGGER.info("Winners of the one-eighth final");
        fourTeams.forEach(LOGGER::info);
        System.out.println();
        System.out.println("---------------------------------------------------------------");
    }

    @Override
    public void oneForthFinal() throws TeamsNullException {
        if (getFourTeams().size() < 4) {
            throw new TeamsNullException("Numbers of teams should be four");
        }
        int count1 = 0;
        int count2 = 1;
        String firstTeam = "";
        String secondTeam = "";
        int numberOfPoint_FirstTeam = 0;
        int numberOfPoint_SecondTeam = 0;

        for (int i = 0; i < 2; i++) {
            numberOfPoint_FirstTeam = (int) (Math.random() * 3);
            numberOfPoint_SecondTeam = (int) (Math.random() * 3);
            while (numberOfPoint_FirstTeam == numberOfPoint_SecondTeam) {
                numberOfPoint_FirstTeam = (int) (Math.random() * 3);
                numberOfPoint_SecondTeam = (int) (Math.random() * 3);
            }
            firstTeam = fourTeams.get(count1);
            secondTeam = fourTeams.get(count2);
            count1 += 2;
            count2 += 2;
            if (numberOfPoint_FirstTeam > numberOfPoint_SecondTeam) {
                twoTeams.add(firstTeam);
            } else {
                twoTeams.add(secondTeam);
            }
        }
        LOGGER.info("Winners of the one-forth final");
        twoTeams.forEach(LOGGER::info);
        System.out.println();
        System.out.println("---------------------------------------------------------------");
    }


    @Override
    public void semiFinal() throws TeamsNullException {
        if (getTwoTeams().size() < 2) {
            throw new TeamsNullException("Numbers of teams should be two");
        }
        int count1 = 0;
        int count2 = 1;
        String firstTeam = "";
        String secondTeam = "";
        int numberOfPoint_FirstTeam = 0;
        int numberOfPoint_SecondTeam = 0;

        for (int i = 0; i < 1; i++) {
            numberOfPoint_FirstTeam = (int) (Math.random() * 3);
            numberOfPoint_SecondTeam = (int) (Math.random() * 3);
            while (numberOfPoint_FirstTeam == numberOfPoint_SecondTeam) {
                numberOfPoint_FirstTeam = (int) (Math.random() * 3);
                numberOfPoint_SecondTeam = (int) (Math.random() * 3);
            }
            firstTeam = twoTeams.get(count1);
            secondTeam = twoTeams.get(count2);
            count1 += 2;
            count2 += 2;
            if (numberOfPoint_FirstTeam > numberOfPoint_SecondTeam) {
                setWinner(firstTeam);
            } else {
                setWinner(secondTeam);
            }
        }
        LOGGER.info("Competition winner is: " + getWinner());
    }

    @Override
    public String toString() {
        return  "\nSeason of this sport: " + season + "\n" +
                "raceType will be: " + raceType + "\n" +
                "distance: " + distance + "\n" +
                "trackType: " + trackType;
    }
}
