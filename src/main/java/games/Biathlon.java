package games;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public final class Biathlon extends Sport implements GameRounds {
    static final Logger LOGGER = LogManager.getLogger(Biathlon.class);

    private String nameOfTheGame;
    private String season;
    private int skiPolesLength;
    private int minRifleWeight;
    private String country;

    public Biathlon(String nameOfTheGame, String season, int skiPolesLength, int minRifleWeight, String country) {
        super(nameOfTheGame);
        this.nameOfTheGame = nameOfTheGame;
        this.season = season;
        this.skiPolesLength = skiPolesLength;
        this.minRifleWeight = minRifleWeight;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    List<String> allTeams = new ArrayList<>();
    List<String> fourTeams = new ArrayList<>();
    List<String> twoTeams = new ArrayList<>();

    public void addTeam() {
        allTeams.add("Kassiopea");
        allTeams.add("Dragon");
        allTeams.add("Lion");
        allTeams.add("Centavr");
        allTeams.add("Vodoley");
        allTeams.add("Pegas");
        allTeams.add("Orion");
        allTeams.add("Bear");
    }

    @Override
    public void oneEightFinal(){
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
//        for (String s : fourTeams) {
//            System.out.print(s + " ");
//        }
        System.out.println();
        System.out.println("---------------------------------------------------------------");

    }

    @Override
    public void oneForthFinal() {
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
//        for (String s : twoTeams) {
//            System.out.print(s + " ");
//        }
        System.out.println();
        System.out.println("---------------------------------------------------------------");
    }

    @Override
    public void semiFinal() {
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
}
