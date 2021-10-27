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
        return false;
    }

    public int getStorageunitWeight() {
        return 0;
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
