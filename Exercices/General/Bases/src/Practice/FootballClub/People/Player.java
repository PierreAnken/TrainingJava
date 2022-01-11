package Practice.FootballClub.People;

public class Player extends Person {
    private PlayerType playerType;
    private int valueCHF;


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
