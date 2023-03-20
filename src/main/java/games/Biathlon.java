package games;

import countries.Country;
import exceptions.TeamsNullException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persons.Referee;
import persons.VoluntActivity;
import persons.Volunteers;

import java.util.*;

public final class Biathlon extends Sport implements GameRounds {
    static final Logger LOGGER = LogManager.getLogger(Biathlon.class);

    private String nameOfTheGame;
    private String season;
    private int skiPolesLength;
    private int minRifleWeight;

    public Biathlon(String nameOfTheGame, String season, int skiPolesLength, int minRifleWeight) {
        super(nameOfTheGame);
        this.nameOfTheGame = nameOfTheGame;
        this.season = season;
        this.skiPolesLength = skiPolesLength;
        this.minRifleWeight = minRifleWeight;
    }

    public Biathlon() {
        super("Biathlon");
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

    public Map<Integer, String> getAllTeams() {
        return allTeams;
    }

    public Map<Integer, String> getFourTeams() {
        return fourTeams;
    }

    public Map<Integer, String> getTwoTeams() {
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
        Volunteers vol = new Volunteers(VoluntActivity.LOGISTICS);
        LOGGER.info("We also ask you to clap our volunteers from the department that deals with " + vol.getVolActivity() + ". A total of " + VoluntActivity.generateRandomCount() + " people were involved for volunteering");
        Country.randomCountry();
    }

    Map<Integer, String> allTeams = new HashMap<>();
    Map<Integer, String> fourTeams = new HashMap<>();
    Map<Integer, String> twoTeams = new HashMap<>();

    public void addTeam() {
        allTeams.put(1, "Kassiopea");
        allTeams.put(2, "Dragon");
        allTeams.put(3, "Lion");
        allTeams.put(4, "Centavr");
        allTeams.put(5, "Vodoley");
        allTeams.put(6, "Pegas");
        allTeams.put(7, "Orion");
        allTeams.put(8, "Bear");
    }

    @Override
    public void oneEightFinal() throws TeamsNullException {
        if (getAllTeams().size() < 8) {
            throw new TeamsNullException("Numbers of teams should be eight");
        }
        int count1 = 1;
        int count2 = 2;
        String firstTeam;
        String secondTeam;
        int numberOfPoint_FirstTeam;
        int numberOfPoint_SecondTeam;

        for (int i = 1; i <= 4; i++) {
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
                fourTeams.put(i, firstTeam);
            } else {
                fourTeams.put(i, secondTeam);
            }
        }
        LOGGER.info("Winners of the one-eighth final");
        LOGGER.info(fourTeams);
        System.out.println();
        System.out.println("---------------------------------------------------------------");

    }

    @Override
    public void oneForthFinal() throws TeamsNullException {
        if (getFourTeams().size() < 4) {
            throw new TeamsNullException("Numbers of teams should be four");
        }
        int count1 = 1;
        int count2 = 2;
        String firstTeam;
        String secondTeam;
        int numberOfPoint_FirstTeam;
        int numberOfPoint_SecondTeam;

        for (int i = 1; i <= 2; i++) {
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
                twoTeams.put(i, firstTeam);
            } else {
                twoTeams.put(i, secondTeam);
            }
        }
        LOGGER.info("Winners of the one-forth final");
        LOGGER.info(twoTeams);
        System.out.println();
        System.out.println("---------------------------------------------------------------");
    }

    @Override
    public void semiFinal() throws TeamsNullException {
        if (getTwoTeams().size() < 2) {
            throw new TeamsNullException("Numbers of teams should be two");
        }
        int count1 = 1;
        int count2 = 2;
        String firstTeam;
        String secondTeam;
        int numberOfPoint_FirstTeam;
        int numberOfPoint_SecondTeam;

        for (int i = 1; i <= 1; i++) {
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
        return  "\nSeason of this sport: " + season  +
                "\nskiPolesLength=" + skiPolesLength +
                "\nminRifleWeight=" + minRifleWeight ;
    }
}
