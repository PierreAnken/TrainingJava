package csgo;

public class Player {

    private static int nextId = 1;

    private final PlayerLevel skill;
    private final int id;

    public Player(PlayerLevel skill){
        id = nextId;
        nextId++;
        this.skill = skill;
    }

    public PlayerLevel getSkill() {
        return skill;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "Player "+id+" : "+skill;
    }
}