package csgo;

public class Game {

    private final Team terrorists;
    private final Team antiterrorists;

    public Game(){
        terrorists = new Team();
        antiterrorists = new Team();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Team Terrorists: \n");
        sb.append(terrorists);
        sb.append("\n");
        sb.append("Team Anti-Terrorist: \n");
        sb.append(antiterrorists);
        return sb.toString();
    }
}