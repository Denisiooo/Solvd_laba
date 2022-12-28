import games.*;

import java.util.Scanner;

public class GameStarting {
    public static void main(String[] args) {
        System.out.println("Choose a sport to start the competition: ");
        System.out.println("1 - Biathlon;\n2 - Cycling;\n3 - Hockey;\n4 - Skiing;\n5 - Volleyball.");
        Scanner scanner = new Scanner(System.in);
        int numberOfSport = scanner.nextInt();

        switch (numberOfSport) {
            case 1 -> {
                Biathlon b = new Biathlon();
                System.out.println("You have chosen Biathlon");
                b.addTeam();
                b.oneEightFinal();
                b.oneForthFinal();
                b.semiFinal();
            }
            case 2 -> {
                Cycling c = new Cycling();
                System.out.println("You have chosen Cycling");
                c.addTeam();
                c.oneEightFinal();
                c.oneForthFinal();
                c.semiFinal();
            }
            case 3 -> {
                Hockey h = new Hockey();
                System.out.println("You have chosen Hockey");
                h.addTeam();
                h.oneEightFinal();
                h.oneForthFinal();
                h.semiFinal();
            }
            case 4 -> {
                Skiing s = new Skiing();
                System.out.println("You have chosen Skiing");
                s.addTeam();
                s.oneEightFinal();
                s.oneForthFinal();
                s.semiFinal();
            }
            case 5 -> {
                Volleyball v = new Volleyball();
                System.out.println("You have chosen Volleyball");
                v.addTeam();
                v.oneEightFinal();
                v.oneForthFinal();
                v.semiFinal();
            }
            default -> {
                System.out.println("You entered the wrong number");
            }
        }
    }
}
