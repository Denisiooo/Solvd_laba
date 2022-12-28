package persons;

public class Referee extends Person{
    private String qualification;
    private double age;
    private String nationality;
    private String nameOfSport;

    public Referee(String nameOfPerson, String surnameOfPerson, String qualification, double age, String nationality) {
        super(nameOfPerson, surnameOfPerson);
        this.qualification = qualification;
        this.age = age;
        this.nationality = nationality;
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

    @Override
    public void gameType() {
        System.out.println("Referee is following the game " + getNameOfSport());
    }
}
