package DancingClub;

public class main {
    public static void main(String[] args) {

        DancingFloor df1 = new DancingFloor(20, MaterialType.WOOD, true, "BlackBox");
        DancingFloor df2 = new DancingFloor(15, MaterialType.PLASTIC, false, "RedBox");
        DancingFloor df3 = new DancingFloor(10, MaterialType.CONCRETE, true, "BlueBox");
        System.out.println(df1);
        System.out.println(df2);
        System.out.println(df3);

        Dancer d1 = new Dancer(GenderType.MAN, "Paul", "Bettany", MaterialType.WOOD, null);
        d1.describeMyself();

    }
}
