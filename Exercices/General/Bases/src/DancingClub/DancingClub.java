package DancingClub;

import java.util.ArrayList;

public class DancingClub {
    private ArrayList<Dancer> members;
    private ArrayList<DancingFloor> floors;
    private String name;

    public DancingClub(String name){
        members = new ArrayList<>();
        floors = new ArrayList<>();
        this.name = name;
    }

    public void registerMember(Dancer dancer){
        members.add(dancer);
    }

    public void buildFloor(DancingFloor floor){
        floors.add(floor);

    }
    public ArrayList<DancingFloor> getFloors(){
        return floors;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Dancing Club '"+name+"' ");
        sb.append("Member List:");
        for (Dancer member: members) {
            sb.append("\n- ");
            sb.append(member);
        }
        sb.append("\nFloor List:");
        for (DancingFloor floor: floors) {
            sb.append("\n- ");
            sb.append(floor);
        }
        return sb.toString();
    }






}
