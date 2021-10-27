package train.wagons;

import train.WagonType;
import train.things.Thing;

public abstract class AWagon{
    protected Thing[] storage;
    protected AWagon rearWagon, frontWagon;

    protected WagonType type;

    public AWagon(WagonType type){
        this.type = type;
    }

    Thing[] getStorage(){
        return storage;
    }

    boolean setContent(Thing something, int emplacement){
        if(emplacement > storage.length-1 || emplacement < 0){
            System.out.println("The emplacement "+emplacement+ " does not exit.");
            return false;
        }
        else{
            storage[emplacement] = something;
            return true;
        }
    }

    public int getStorageunitWeight() {
        int weight = 0;
        for (Thing t: storage) {
            weight += t.getUnitWeight();
        }
        return weight;
    }

    public void setRearWagon(AWagon AWagon){
        rearWagon = AWagon;
    }
    public void setFrontWagon(AWagon AWagon){
        frontWagon = AWagon;
    }

    public AWagon getRearWagon() {
        return rearWagon;
    }

    public AWagon getFrontWagon() {
        return frontWagon;
    }


    public WagonType getType() {
        return type;
    }

}
