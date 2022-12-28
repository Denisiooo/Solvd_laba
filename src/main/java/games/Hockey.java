package games;

import java.util.ArrayList;
import java.util.List;

public class Hockey implements GameRounds{
    private String nameOfTheGame;
    private int numberOfPlayers;
    private String season;
    private String fieldDimensions;
    private String country;
    private String winner;

    public Hockey(String nameOfTheGame, int numberOfPlayers, String season, String fieldDimensions, String country) {
        this.nameOfTheGame=nameOfTheGame;
        this.numberOfPlayers = numberOfPlayers;
        this.season = season;
        this.fieldDimensions = fieldDimensions;
        this.country = country;
    }

    public Hockey() {

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
    public void oneEightFinal() {
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
        System.out.println("Winners of the one-eighth final");
        for (String s : fourTeams) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------");
    }

    @Override
    public void oneForthFinal() {
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
        System.out.println("Winners of the one-forth final");
        for (String s : twoTeams) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------");
    }

    @Override
    public void semiFinal() {
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
                winner = firstTeam;
            } else {
                winner = firstTeam;
            }
        }
        System.out.println("Competition winner is: " + winner);
    }
}
