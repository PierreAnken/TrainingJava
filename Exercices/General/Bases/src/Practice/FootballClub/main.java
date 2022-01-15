package Practice.FootballClub;

import Practice.FootballClub.People.*;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Field f1 = new Field(45, 90);
        System.out.println(f1);
        f1.doMaintenance();
        System.out.println(f1);

        Team t1 = new Team("Alpha");
        Player p1 = new Player(PlayerType.GOALKEEPER, 399000, "Rolph", "Steiner", 45);
        Player p2 = new Player(PlayerType.ATTACKER, 329000, "Adrian", "Rüth", 25);
        Player p3 = new Player(PlayerType.ATTACKER, 359000, "Birmin", "Gerig", 22);
        Player p4 = new Player(PlayerType.DEFENDER, 499000, "Leman", "Strold", 25);
        Player p5 = new Player(PlayerType.DEFENDER, 259000, "Duju", "Bobou", 28);
        Player p6 = new Player(PlayerType.DEFENDER, 169000, "Nari", "Dielu", 25);
        Coach c1 = new Coach("Loris", "Dieno", 33);
        t1.addPeople(List.of(p1, p2, p3, p4, p5, p6, c1));

        Team t2 = new Team("Beta");
        Player p7 = new Player(PlayerType.GOALKEEPER, 399000, "Didie", "Ludwitch", 25);
        Player p8 = new Player(PlayerType.ATTACKER, 329000, "Luc", "Bielo", 35);
        Player p9 = new Player(PlayerType.ATTACKER, 359000, "Marc", "Tchanz", 22);
        Player p10 = new Player(PlayerType.ATTACKER, 499000, "Roger", "Renard", 24);
        Player p11 = new Player(PlayerType.DEFENDER, 259000, "Daniel", "Baly", 23);
        Player p12 = new Player(PlayerType.DEFENDER, 169000, "Max", "Snalo", 24);
        Coach c2 = new Coach("Nada", "Pierrick", 49);
        t2.addPeople(List.of(p7, p8, p9, p10, p11, p12, c2));

        Match m1 = new Match(t1, t2, f1);
        m1.Start();
    }
}
