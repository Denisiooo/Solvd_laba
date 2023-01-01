import games.*;
import results.Award;

import java.util.Scanner;

public class GameStarting {
    public static void main(String[] args) throws Exception {
        System.out.println("Choose a sport to start the competition: ");
        System.out.println("1 - Biathlon;\n2 - Cycling;\n3 - Hockey;\n4 - Skiing;\n5 - Volleyball.");
        Scanner scanner = new Scanner(System.in);
        int numberOfSport = scanner.nextInt();

        switch (numberOfSport) {
            case 1 -> {
                Biathlon b = new Biathlon("Biathlon", "winter", 12, 3, "Belarus");
                System.out.println("You have chosen Biathlon");
                b.addTeam();
                b.oneForthFinal();
                b.semiFinal();
                Award.prizeDistribution(b);
            }
            case 2 -> {
                Cycling c = new Cycling("Cycling", "summer", "highway", 300, "asphalt", "USA");
                System.out.println("You have chosen Cycling");
                c.addTeam();
                c.oneEightFinal();
                c.oneForthFinal();
                c.semiFinal();
                Award.prizeDistribution(c);
            }
            case 3 -> {
                Hockey h = new Hockey("Hockey", 25, "winter", "Russia");
                System.out.println("You have chosen Hockey");
                h.addTeam();
                h.oneEightFinal();
                h.oneForthFinal();
                h.semiFinal();
                Award.prizeDistribution(h);
            }
            case 4 -> {
                Skiing s = new Skiing("Skiing", "ski race", "winter", " Finland");
                System.out.println("You have chosen Skiing");
                s.addTeam();
                s.oneEightFinal();
                s.oneForthFinal();
                s.semiFinal();
                Award.prizeDistribution(s);
            }
            case 5 -> {
                Volleyball v = new Volleyball("Volleyball", "summer", 6, "male", "Brazil");
                System.out.println("You have chosen Volleyball");
                v.addTeam();
                v.oneEightFinal();
                v.oneForthFinal();
                v.semiFinal();
                Award.prizeDistribution(v);
            }
            default -> {
                System.out.println("You entered the wrong number");
            }
        }

    }
}

