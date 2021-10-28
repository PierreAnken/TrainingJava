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

        for (int i = 0; i < storage.length; i++) {
            if(storage[i] == null){
                emptyEmplacements.add(i);
            }
        }
        return emptyEmplacements;
    }

    public boolean setContent(Thing something, int emplacement){
        if(emplacement > storage.length-1 || emplacement < 0){
            System.out.println("The emplacement "+emplacement+ " does not exit.");
            return false;
        }
        else{
            storage[emplacement] = something;
            return true;
        }
    }

    public Thing getContent(int emplacement){
        if(emplacement > storage.length-1 || emplacement < 0){
            System.out.println("The emplacement "+emplacement+ " does not exit.");
            return null;
        }
        else{
            return storage[emplacement];
        }

    }

    public int getStorageunitWeight() {
        int weight = 0;
        for (Thing t: storage) {
            if(t != null){
                weight += t.getUnitWeight() * t.getQuantity();
            }
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
