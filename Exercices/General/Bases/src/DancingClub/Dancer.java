package DancingClub;

public class Dancer extends Person {

    private MaterialType favouriteFloorType;
    private GenderType favouriteGenderPartner;

    public Dancer(GenderType genderType, String firstName, String lastName, MaterialType favouriteFloorType, GenderType favouriteGenderPartner) {
        super(genderType, firstName, lastName);
        this.favouriteFloorType = favouriteFloorType;
        this.favouriteGenderPartner = favouriteGenderPartner;

    }

    @Override
    void describeMyself() {
        System.out.println("I'm a dancer. "+super.toString());
    }

}
