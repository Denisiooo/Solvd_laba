import exceptions.WrongAmountException;
import games.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persons.Fans;
import results.Award;
import tickets.Ticket;
import tickets.TicketRate;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Scanner;

public class GameStarting {
    private static final Logger LOGGER = LogManager.getLogger(GameStarting.class);

    private static void printData(Object fans){
        try{
            Method method = fans.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(fans);
        }catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Fans fans = new Fans("second", "biathlon");
        Fans fans1 = null;
        fans.setGameType("qqq");
        String name = "";
//        fans.setName("Pavel");

          //1
//        try {
//            Field field = fans.getClass().getDeclaredField("name");
//            field.setAccessible(true);
//            name = (String) field.get(fans);
//        }catch (NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(name);

          //2
//        printData(fans);
//        try {
//            Field field = fans.getClass().getDeclaredField("name");
//            field.setAccessible(true);
//            field.set(fans, (String)"Pashka");
//            name = (String) field.get(fans);
//        }catch (NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        printData(fans);

        //3
        try {
            Class clazz = Class.forName(Fans.class.getName());
            Class[] params = {String.class, String.class};
            fans1 = (Fans) clazz.getConstructor(params).newInstance("hey", "how");
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(fans1.toString());

        //4
        try {
            Class clazz = Class.forName(Fans.class.getName());
            fans1 = (Fans) clazz.newInstance();
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(fans1);

        //5
        Class clazz = Class.forName(Fans.class.getName());
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor co : constructors) {
            Class[] paramType = co.getParameterTypes();
            for (Class param: paramType) {
                System.out.println(param.getName() + " ");
            }
            System.out.println();
        }







//        Scanner scanner = new Scanner(System.in);
//
//        LOGGER.info("What ticket will you bye: Vip, Usual");
//        TicketRate ticketRate = TicketRate.valueOf(scanner.nextLine().toUpperCase());
//        Map<TicketRate, Ticket> map = Ticket.addTicketClass();
//        Ticket ticket = map.get(ticketRate);
//        LOGGER.info(ticket.toString());
//
//        LOGGER.info("Choose a sport to start the competition: ");
//        LOGGER.info("\n1 - Biathlon;\n2 - Cycling;\n3 - Hockey;\n4 - Skiing;\n5 - Volleyball.");
//        int numberOfSport = 0;
//        try {
//            numberOfSport = scanner.nextInt();
//            if (numberOfSport < 1 || numberOfSport > 5) {
//                throw new WrongAmountException("You should enter numbers only between 1 and 5");
//            }
//        } catch (NumberFormatException ignored) {
//        }
//        switch (numberOfSport) {
//            case 1 -> {
//                LOGGER.info("And now the game will start. You have chosen Biathlon");
//                Biathlon b = new Biathlon("biathlon", "winter", 5, 10);
//                LOGGER.info(b.toString());
//                b.addTeam();
//                LOGGER.info("All teams that participate in the Olympiad:" + b.getAllTeams());
//                b.oneEightFinal();
//                b.oneForthFinal();
//                b.semiFinal();
//                Award.prizeDistribution(b);
//            }
//            case 2 -> {
//                LOGGER.info("And now the game will start. You have chosen Cycling");
//                Cycling c = new Cycling("cycling", "summer", "highway", 5, "asphalt");
//                LOGGER.info(c.toString());
//                c.addTeam();
//                c.oneEightFinal();
//                c.oneForthFinal();
//                c.semiFinal();
//                Award.prizeDistribution(c);
//            }
//            case 3 -> {
//                LOGGER.info("And now the game will start. You have chosen Hockey");
//                Hockey h = new Hockey("hockey", 20, "winter");
//                LOGGER.info(h.toString());
//                h.addTeam();
//                h.oneEightFinal();
//                h.oneForthFinal();
//                h.semiFinal();
//                Award.prizeDistribution(h);
//            }
//            case 4 -> {
//                LOGGER.info("And now the game will start. You have chosen Skiing");
//                Skiing s = new Skiing("skiing", "freestyle", "winter");
//                LOGGER.info(s.toString());
//                s.addTeam();
//                s.oneEightFinal();
//                s.oneForthFinal();
//                s.semiFinal();
//                Award.prizeDistribution(s);
//            }
//            case 5 -> {
//                LOGGER.info("And now the game will start. You have chosen Volleyball");
//                Volleyball v = new Volleyball("volleyball", "summer", 6,  "girls");
//                LOGGER.info(v.toString());
//                v.addTeam();
//                v.oneEightFinal();
//                v.oneForthFinal();
//                v.semiFinal();
//                Award.prizeDistribution(v);
//            }
//        }
    }
}

