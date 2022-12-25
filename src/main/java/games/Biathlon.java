package games;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Biathlon{
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

    public Biathlon() {

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

    List<String> teams = new ArrayList<>();

    public void addTeam(){
        teams.add("Kassiopea");
        teams.add("Dragon");
        teams.add("Lion");
        teams.add("Centavr");
        teams.add("Vodoley");
        teams.add("Pegas");
        teams.add("Orion");
        teams.add("Bear");
        teams.add("Birds");
        teams.add("Tiger");
    }

    public void gameStart(){
        Random random = new Random();
        int count1 = 0;
        int count2 = 1;
        String firstTeam = "";
        String secondTeam = "";
        int numberOfPoint_FirstTeam = 0;
        int numberOfPoint_SecondTeam = 0;
        List<String> winners = new ArrayList<>();
        List<String> losers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numberOfPoint_FirstTeam = (int)(Math.random()*3);
            numberOfPoint_SecondTeam = (int)(Math.random()*3);

                firstTeam = teams.get(count1);
                secondTeam = teams.get(count2);
                count1+=2;
                count2+=2;



            if (numberOfPoint_FirstTeam > numberOfPoint_SecondTeam){
                winners.add(firstTeam);
                losers.add(secondTeam);
            }else if(numberOfPoint_FirstTeam < numberOfPoint_SecondTeam){
                winners.add(secondTeam);
                losers.add(firstTeam);
            }else {
                losers.add(firstTeam);
                losers.add(secondTeam);
            }
        }
        System.out.println("Winners");
        for (String s: winners) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Losers");
        for (String s1: losers) {
            System.out.print(s1 + " ");

        }
    }
}
