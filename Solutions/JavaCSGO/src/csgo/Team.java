package csgo;

import java.util.Random;

public class Team {

    private final Player[] players;

    public Team(){
        Random rn = new Random();

        players = new Player[5];

        for (int i = 0; i < 5; i++) {
            int randomInt = rn.nextInt(3);
            PlayerLevel levelSelected =  PlayerLevel.values()[randomInt];
            Player newPlayer = new Player(levelSelected);
            players[i] = newPlayer;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Player player: players) {
            sb.append(player).append("\n");
        }
        return sb.toString();
    }
}