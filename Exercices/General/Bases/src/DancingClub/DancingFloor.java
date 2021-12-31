package DancingClub;

public class DancingFloor {
    private int maxPeople;
    private MaterialType floorType;
    private boolean soundMaterial;
    private String name;

    public DancingFloor(int maxPeople, MaterialType floorType, boolean soundMaterial, String name){
        this.maxPeople = maxPeople;
        this.floorType = floorType;
        this.soundMaterial = soundMaterial;
        this.name = name;
    }

    public String toString(){

        String sound = soundMaterial ? "Yes":"No" ;
        return "Name: "+name+" Floor Type: "+floorType+" Sound Material?: "+sound+" max People: "+maxPeople;
    }


    public int getMaxPeople() {
        return maxPeople;
    }

    public MaterialType getFloorType() {
        return floorType;
    }

    public boolean isSoundMaterial() {
        return soundMaterial;
    }

    public String getName() {
        return name;
    }
}
