package Practice.DancingClub;
import java.util.*;

public class Dancer extends Person {

    private MaterialType favouriteFloorType;
    private GenderType favouriteGenderPartner;
    private boolean vaccinated;
    private static int nextId = 1;
    private int id;

    public Dancer(GenderType genderType, MaterialType favouriteFloorType, GenderType favouriteGenderPartner, boolean vaccinated) {
        super(genderType);
        this.favouriteFloorType = favouriteFloorType;
        this.favouriteGenderPartner = favouriteGenderPartner;
        this.vaccinated = vaccinated;

        id = nextId;
        nextId++;
    }


    public String toString(){
         return "I'm a dancer. "+super.toString()+" "+id;
    }

    public boolean isVaccinated(){
        return vaccinated;
    }
    public int getId(){
        return id;
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

    public static ArrayList<Dancer> dancerGenerator(int dancerAmount){

        ArrayList<Dancer> dancers =  new ArrayList();
        Random r = new Random();

        for (int i = 0; i < dancerAmount; i++) {
            boolean vaccinated = r.nextInt(5) > 0;

            List<MaterialType> materialTypes = new ArrayList<>(EnumSet.allOf(MaterialType.class));
            MaterialType favouriteFloorType = materialTypes.get(r.nextInt(materialTypes.size()));

            List<GenderType> genderTypes = new ArrayList<>(EnumSet.allOf(GenderType.class));
            GenderType genderType = genderTypes.get(r.nextInt(genderTypes.size()));
            GenderType favouriteGenderPartner = genderTypes.get(r.nextInt(genderTypes.size()));

            Dancer dancer = new Dancer(genderType,favouriteFloorType, favouriteGenderPartner, vaccinated);
            dancers.add(dancer);
        }

        return dancers;
    }

}
