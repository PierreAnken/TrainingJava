package Practice.FootballClub.People;

import java.util.Random;

public class Player extends Person {
    private PlayerType playerType;
    private int valueCHF;


    public boolean getPastOpponentPlayer(Player defender){
        // Attackers have 80% change to get trough
        Random r = new Random();
        boolean wentTrough = r.nextInt(5) > 0;

        if(wentTrough){
            System.out.println(firstName + " passed " + defender.firstName);
        }else{
            System.out.println(firstName + " was blocked by " + defender.firstName);
        }


        return wentTrough;
    }

    public boolean scoreGoal(){
        Random r = new Random();
        return r.nextBoolean();
    }

    public Player(PlayerType playerType, int valueCHF, String firstName, String lastName, int age) {

        super(firstName, lastName, age);
        this.playerType = playerType;
        this.valueCHF = valueCHF;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public String toString(){
        return super.toString() +" "+playerType+ " "+valueCHF+ "CHF" ;
    }

}
