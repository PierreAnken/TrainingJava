package Practice.FootballClub;

import java.util.ArrayList;

public class Team {

    private String divison;
    private String name;
    private ArrayList<FootballPlayer> players;

    public Team(String divison, String name) {
        this.divison = divison;
        this.name = name;
        players = new ArrayList<>();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(divison+" "+ name+" :\n");
        for (FootballPlayer currentPlayer:players) {
            sb.append(" - ");
            sb.append(currentPlayer);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addPlayer(FootballPlayer newPlayer) {
        players.add(newPlayer);
    }


}
