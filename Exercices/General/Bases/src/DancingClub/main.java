package DancingClub;

public class main {
    public static void main(String[] args) {

        DancingFloor df1 = new DancingFloor(20, MaterialType.WOOD, true, "BlackBox");
        DancingFloor df2 = new DancingFloor(15, MaterialType.PLASTIC, false, "RedBox");
        DancingFloor df3 = new DancingFloor(10, MaterialType.CARPET, true, "BlueBox");

        Dancer d1 = new Dancer(GenderType.MAN, "Paul", "Bettany", MaterialType.WOOD, null);
        Dancer d2 = new Dancer(GenderType.WOMAN, "Pauline", "Tailor", MaterialType.PLASTIC, GenderType.MAN);
        Dancer d3 = new Dancer(GenderType.MAN, "Bernie", "Sanders", MaterialType.CONCRETE, GenderType.WOMAN);
        Dancer d4 = new Dancer(GenderType.UNDEFINED, "Jack", "Sparrow", MaterialType.CARPET, GenderType.UNDEFINED);

        DancingClub dc1 = new DancingClub("PinkBox");
        dc1.buildFloor(df1);
        dc1.buildFloor(df2);
        dc1.buildFloor(df3);

        dc1.registerMember(d1);
        dc1.registerMember(d2);
        dc1.registerMember(d3);

        d1.enterClub(dc1);
        d2.enterClub(dc1);
        d3.enterClub(dc1);

        System.out.println(dc1);
    }
}
