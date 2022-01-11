package Practice.DancingClub;

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
       if(dancer.isVaccinated()){
           if(dancer.getId() % 10 == 7){
               System.out.println("I like your number (7), you'll get a free registration "+dancer.getId());

           }
           members.add(dancer);
       }
       else{
           System.out.println("You're are not allowed to enter as you are not vaccinated: "+dancer.getId());
       }

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
