package FootballClub.People;

import java.util.ArrayList;

public class Team {

    private ArrayList<Person> players;
    private ArrayList<Person> staffMembers;
    private String name;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
        staffMembers = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if (person instanceof Player) {
            players.add(person);
        } else {
            staffMembers.add(person);
        }
    }
}
