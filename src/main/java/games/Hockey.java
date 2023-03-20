package games;

import countries.Country;
import exceptions.TeamsNullException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persons.Referee;
import persons.VoluntActivity;
import persons.Volunteers;

import java.util.*;
import java.util.stream.Collectors;

public final class Hockey extends Sport implements GameRounds {
    static final Logger LOGGER = LogManager.getLogger(Hockey.class);

    private String nameOfTheGame;
    private int numberOfPlayers;
    private String season;

    public Hockey(String nameOfTheGame, int numberOfPlayers, String season) {
        super(nameOfTheGame);
        this.nameOfTheGame = nameOfTheGame;
        this.numberOfPlayers = numberOfPlayers;
        this.season = season;
    }

    public Hockey() {
        super("Hockey");
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

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
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
        Volunteers vol = new Volunteers(VoluntActivity.AWARDING);
        LOGGER.info("We also ask you to clap our volunteers from the department that deals with " + vol.getVolActivity() + ". A total of " + VoluntActivity.generateRandomCount() + " people were involved for volunteering");
        Country.randomCountry();
    }

    List<String> allTeams = new LinkedList<>();
    List<String> fourTeams = new LinkedList<>();
    List<String> twoTeams = new LinkedList<>();

    public void addTeam() {
        allTeams.add("Dominators");
        allTeams.add("Elite");
        allTeams.add("Force");
        allTeams.add("Hustle");
        allTeams.add("Icons");
        allTeams.add("Legends");
        allTeams.add("Lightning");
        allTeams.add("Masters");
    }

    @Override
    public void oneEightFinal() throws TeamsNullException {
        if (getAllTeams().size() < 8) {
            throw new TeamsNullException("Numbers of teams should be eight");
        }
        List<String> list = allTeams.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());
        LOGGER.info("All teams that participate in the Olympiad:" + list + ":\nTotal count - " + list.stream().count());

        int count1 = 0;
        int count2 = 1;
        String firstTeam;
        String secondTeam;
        int numberOfPoint_FirstTeam;
        int numberOfPoint_SecondTeam;

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
        LOGGER.info(fourTeams);
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
        String firstTeam;
        String secondTeam;
        int numberOfPoint_FirstTeam;
        int numberOfPoint_SecondTeam;

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
        LOGGER.info(twoTeams);
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
        String firstTeam;
        String secondTeam;
        int numberOfPoint_FirstTeam;
        int numberOfPoint_SecondTeam;

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
        return  "\nnumberOfPlayers: " + numberOfPlayers +
                "\nseason of the sport: " + season;
    }
}
