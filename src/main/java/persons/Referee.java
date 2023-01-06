package persons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Referee extends Person {
    private static final Logger LOGGER = LogManager.getLogger(Person.class);

    private String qualification;
    private double age;
    private String nationality;
    private String nameOfSport;
    private static final List<String> refereeNames = List.of("Алексеев Артём", "Алехин Матвей", "Андреева Елизавета", "Анисимов Глеб", "Баранова София",
            "Белова Дарья", "Беляев Фёдор", "Богданов Лев", "Быкова София", "Васильев Ярослав", "Васильева Виктория", "Васильева Екатерина",
            "Вешнякова София", "Винокурова София ", "Власов Даниил", "Власова Вероника", "Волкова Ирина", "Воробьев Лев", "Воробьева Полина",
            "Воробьева Екатерина", "Воронов Роман", "Гаврилов Вадим", "Галкин Семён", "Герасимова София", "Гончарова Вера", "Грачев Дмитрий",
            "Григорьева Анастасия", "Гусев Илья", "Гусев Максим", "Гусева Ева", "Дмитриев Сергей", "Дорофеев Богдан", "Дружинин Герман",
            "Егорова Алина", "Елисеев Кирилл", "Жилина Дарья", "Захарова Анна", "Захарова Анастасия", "Иванова Мирослава", "Иванова Анна");

    public Referee(String nameOfPerson, String surnameOfPerson, String qualification, double age, String nationality) {
        super(nameOfPerson, surnameOfPerson);
        this.qualification = qualification;
        this.age = age;
        this.nationality = nationality;
    }

    public Referee() {

    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNameOfSport() {
        return nameOfSport;
    }

    public void setNameOfSport(String nameOfSport) {
        this.nameOfSport = nameOfSport;
    }

    public static void randomName() {
        String name = refereeNames.get((int) (Math.random() * 41));
        System.out.println(name);
    }

    @Override
    public void gameType() {
        System.out.println("Referee is following the game " + getNameOfSport());
    }


    public static void main(String[] args) {
        System.out.println(refereeNames.size());
//        LOGGER.info(); можно ли реализовать через логгер
        randomName();
    }
}
