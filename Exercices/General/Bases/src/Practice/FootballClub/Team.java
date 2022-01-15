package Practice.FootballClub;

import Practice.FootballClub.People.Person;
import Practice.FootballClub.People.Player;
import Practice.FootballClub.People.PlayerType;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private ArrayList<Person> players;
    private ArrayList<Person> staffMembers;
    private String name;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
        staffMembers = new ArrayList<>();
    }

    public void addPeople(List<Person> people){
        for (Person person: people) {
            addPerson(person);
        }
    }

    public void addPerson(Person person) {
        if (person instanceof Player) {
            players.add(person);
        } else {
            staffMembers.add(person);
        }
    }

    public List<Player> getPlayersByType(PlayerType playerType){
        List<Player> playersByType = new ArrayList<>();
        for (Person player: players) {
            if(((Player)player).getPlayerType() == playerType){
                playersByType.add((Player)player);
            }
        }
        return playersByType;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Team composition:\n");
        List<Person> allMembers = new ArrayList<>(players);
        allMembers.addAll(staffMembers);

        for (Person p: allMembers) {
            sb.append("- ");
            sb.append(p.getClass().getSimpleName());
            sb.append(" ");
            sb.append(p);
            sb.append("\n");

        }
        return sb.toString();
    }

}

