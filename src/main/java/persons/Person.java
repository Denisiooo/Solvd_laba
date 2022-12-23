package persons;

public abstract class Person {
    private String nameOfPerson;
    private  String surnameOfPerson;

    public Person(String nameOfPerson, String surnameOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.surnameOfPerson = surnameOfPerson;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public String getSurnameOfPerson() {
        return surnameOfPerson;
    }

    public void setSurnameOfPerson(String surnameOfPerson) {
        this.surnameOfPerson = surnameOfPerson;
    }

    public abstract void gameType();
}
