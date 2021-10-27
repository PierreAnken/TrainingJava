package train.wagons;

import train.things.Thing;

import java.util.ArrayList;
import java.util.List;

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

    public List<Integer> getEmptyEmplacement(){
        List<Integer> emptyEmplacements = new ArrayList<>();



        return emptyEmplacements;
    }

    public boolean setContent(Thing something, int emplacement){


        return true;
    }

    public Thing getContent(int emplacement){

        return null;

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
