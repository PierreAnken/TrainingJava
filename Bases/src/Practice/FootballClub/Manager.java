package Practice.FootballClub;

import java.util.ArrayList;

public class Manager extends Person {

    private ArrayList<Team> managedTeams;

    public Manager(String name, Gender gender) {
        super(name, gender);
        this.managedTeams = new ArrayList<>();
    }

    public void addTeam(Team newTeam) {
        managedTeams.add(newTeam);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(name + " " + gender + " :\n");
        for (Team currentTeam : managedTeams) {
            sb.append(" - ");
            sb.append(currentTeam.getName());
            sb.append("\n");
        }

        return sb.toString();
    }
}
