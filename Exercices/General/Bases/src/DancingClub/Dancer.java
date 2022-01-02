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
        System.out.println(this);
    }

    public String toString(){
         return "I'm a dancer. "+super.toString();
    }



    public void enterClub(DancingClub club){

        boolean floorFound = false;
        for (DancingFloor floor: club.getFloors()) {
            if(favouriteFloorType == floor.getFloorType()){
                floor.allowDancer(this);
                floorFound = true;
                break;
            }
        }

        if(!floorFound){
            for (DancingFloor floor: club.getFloors()){
                for (Dancer dancer: floor.getDancers()) {
                    if(favouriteGenderPartner == dancer.getGenderType()){
                        floor.allowDancer(this);
                        floorFound = true;
                        break;
                    }
                }
            }
        }

        if(!floorFound){
            System.out.println("No interesting floor, leaving.");
        }

    }
}
