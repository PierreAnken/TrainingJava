package Practice.FootballClub;

public class FootballPlayer {


    private String name;
    private Gender gender;

    public FootballPlayer(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String toString(){
        return name + " " + gender;
    }

    public String getName(){
        return name;
    }

    public Gender getGender() {
        return gender;
    }

}
