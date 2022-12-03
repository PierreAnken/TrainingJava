package Practice.FootballClub;

public class FootballPlayer extends Person {

    private FieldPosition fieldPosition;

    private int playerId;
    private static int next_playerId = 0;
    private static int salary = 15000;

    public FootballPlayer(String name, Gender gender) {
        super(name, gender);
        this.playerId = next_playerId;
        next_playerId++;
    }

    public FootballPlayer(String name, Gender gender, FieldPosition fieldPosition) {
        super(name, gender);
        this.fieldPosition = fieldPosition;
        this.playerId =next_playerId;
        next_playerId++;
    }

    public static void setSalary(int salary) {
        FootballPlayer.salary = salary;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String toString() {
        return playerId + " " + name + " " + gender + " " + salary;
    }

    public FieldPosition getFieldPosition() {
        return fieldPosition;
    }

    public void setFieldPosition(FieldPosition fieldPosition) {
        this.fieldPosition = fieldPosition;
    }

}
