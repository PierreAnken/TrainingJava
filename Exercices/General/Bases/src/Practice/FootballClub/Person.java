package Practice.FootballClub;

abstract class Person {

    protected final String name;

    protected final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public Gender getGender() {
        return gender;
    }

}
