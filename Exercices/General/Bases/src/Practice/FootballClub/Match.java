package Practice.FootballClub;

import Practice.FootballClub.People.Player;
import Practice.FootballClub.People.Team;

import java.util.Random;

public class Match {
    private Team hostTeam;
    private Team guestTeam;
    private Field field;
    private MatchResult mathResult;
    private int remainingMinutes;
    private Player ballHolder;
    private int[] score;

    public Match(Team hostTeam, Team guestTeam, Field field) {
        this.hostTeam = hostTeam;
        this.guestTeam = guestTeam;
        this.field = field;
        remainingMinutes = 10;
        score = new int[]{0, 0};
    }

    public String toString() {
        return hostTeam + " Vs " + guestTeam + " " + field;
    }

    public void Start() {
        // select a random attacker from a team and give him the ball
        Random r = new Random();
        Team startingTeam = r.nextBoolean() ? hostTeam : guestTeam;


    }

}
