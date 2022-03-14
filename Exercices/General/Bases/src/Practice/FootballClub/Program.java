package Practice.FootballClub;

public class Program {

    public static void main(String[] args) {

        FootballPlayer p1 = new FootballPlayer("Francis", Gender.MALE);
        FootballPlayer p2 = new FootballPlayer("Laurent", Gender.MALE);
        FootballPlayer p3 = new FootballPlayer("Laurie", Gender.FEMALE);
        FootballPlayer p4 = new FootballPlayer("Marcel", Gender.MALE);
        FootballPlayer p5 = new FootballPlayer("Floria", Gender.FEMALE);
        FootballPlayer p6 = new FootballPlayer("Nancis", Gender.OTHER);

        Team t1 = new Team("Swiss League", "Bern U20");

        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);
        t1.addPlayer(p4);
        t1.addPlayer(p5);
        t1.addPlayer(p6);

        System.out.println(t1);

        Manager m1 = new Manager("James Bond", Gender.MALE);
        m1.addTeam(t1);

        System.out.println(m1);

    }
}
