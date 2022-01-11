package Practice.DancingClub;

import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        DancingFloor df1 = new DancingFloor(20, MaterialType.WOOD, true, "BlackBox");
        DancingFloor df2 = new DancingFloor(15, MaterialType.PLASTIC, false, "RedBox");
        DancingFloor df3 = new DancingFloor(10, MaterialType.CARPET, true, "BlueBox");

        List<Dancer> dancers = Dancer.dancerGenerator(50);

        DancingClub dc1 = new DancingClub("PinkBox");
        dc1.buildFloor(df1);
        dc1.buildFloor(df2);
        dc1.buildFloor(df3);

        Random r = new Random();

        //Member registration
        for (Dancer dancer: dancers) {
            if(r.nextInt(10) > 0){
                dc1.registerMember(dancer);
            }else{
                System.out.println("Sorry, club is full (for you): "+dancer.getId());
            }
        }

        System.out.println(dc1);
    }
}
