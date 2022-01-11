package Practice.FootballClub;
import Practice.People.Player;
import Practice.People.PlayerType;

public class main {
    public static void main(String[] args) {
        Field f1 = new Field(45, 90);
        System.out.println(f1);
        f1.doMaintenance();
        System.out.println(f1);

        Player p1 = new Player(PlayerType.GOALKEEPER, 399000, "Rolph", "Steiner", 45);
        System.out.println(p1);

    }
}
