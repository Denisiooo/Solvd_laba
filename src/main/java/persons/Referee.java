package persons;

public class Referee {
    private String qualification;
    private double age;
    private String nationality;

    public Referee(String qualification, double age, String nationality) {
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



}
