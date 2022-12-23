package games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//пробный класс

public class AllGames {
    Random random = new Random();
    private Biathlon biathlon;
    private Cycling cycling;
    private Hockey hockey;
    private Skiing skiing;
    private Volleyball volleyball;


    List<Object> list = new ArrayList<>();

    public void addGames(){
        list.add(biathlon);
        list.add(cycling);
        list.add(hockey);
        list.add(skiing);
        list.add(volleyball);
    }

    public void randomGame(){
        int a = (int) list.get(random.nextInt(list.size()));
    }
}
