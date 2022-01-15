package Practice.FootballClub;

import Practice.FootballClub.People.Player;
import Practice.FootballClub.People.PlayerType;

import java.util.List;
import java.util.Random;

public class Match {
    private Team hostTeam;
    private Team guestTeam;
    private Field field;
    private MatchResult mathResult;
    private int remainingMinutes;
    private Player ballHolder;
    private Team attackerTeam;
    private int[] score;

    public Match(Team hostTeam, Team guestTeam, Field field) {
        this.hostTeam = hostTeam;
        this.guestTeam = guestTeam;
        this.field = field;
        remainingMinutes = 5;
        score = new int[]{0, 0};
    }

    public String toString() {
        return hostTeam + " Vs " + guestTeam + " " + field;
    }

    public void Start() {

        // select a random attacker from a team and give him the ball
        Random r = new Random();
        attackerTeam = r.nextBoolean() ? hostTeam : guestTeam;
        List<Player> players = attackerTeam.getPlayersByType(PlayerType.ATTACKER);
        ballHolder = players.get(0);

        // until the time is over, the teams keep playing rounds
        // each round take 1 minute
        while (remainingMinutes > 0) {
            int[] roundResult = playRound();
            updateScore(roundResult);
            remainingMinutes--;
        }
        giveResult();
    }

    private void updateScore(int[] roundResult) {
        score[0] += roundResult[0];
        score[1] += roundResult[1];
    }

    private void giveResult() {
        System.out.println("Result of the match is "+mathResult);
    }

    private int[] playRound() {
        /* The ball holder run towards the goal
         for each defender of the opposite team
         he tries to pass them if he fails, then the next attacker
         gets the ball. If all attackers fail, the round ends.
         If an attacker passes all the defenders => try to shoot
         If goal we increase the score
         At the end of the round we give the ball back to the other team */

        Team defenderTeam = attackerTeam == guestTeam ? hostTeam : guestTeam;
        List<Player> remainingDefenders = defenderTeam.getPlayersByType(PlayerType.DEFENDER);
        List<Player> remainingAttackers = attackerTeam.getPlayersByType(PlayerType.ATTACKER);

        // While we run over the field
        while (!remainingAttackers.isEmpty() && !remainingDefenders.isEmpty()) {
            Player nextDefender = remainingDefenders.get(0);
            // does the attacker get through the next defender?
            if (ballHolder.getPastOpponentPlayer(nextDefender)) {
                remainingDefenders.remove(nextDefender);
            } else {
                remainingAttackers.remove(ballHolder);
                // if there is another attacker?
                if (!remainingAttackers.isEmpty()) {
                    ballHolder = remainingAttackers.get(0);
                    System.out.println("New ball holder" + ballHolder.getFirstName());
                }
            }
        }

        // are we in front of goal, or we lost the ball as attacker?
        if (!remainingAttackers.isEmpty()) {
            boolean scoredGoal = ballHolder.scoreGoal();
            if (scoredGoal) {
                return attackerTeam == guestTeam ? new int[]{0, 1} : new int[]{1, 0};
            }
        }

        return new int[]{0, 0};
    }

}
