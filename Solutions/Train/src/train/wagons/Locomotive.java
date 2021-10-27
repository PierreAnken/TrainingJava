package train.wagons;

import train.WagonType;
import train.things.Coal;
import train.wagons.AWagon;

public class Locomotive extends AWagon {

    public Locomotive(){
        super(WagonType.LOCOMOTIVE);
        storage = new Coal[1];
    }

    public void refuel(int coalQuantity){
        if(storage[0] == null){
            setContent(new Coal(coalQuantity), 0);
        }
        else{
            ((Coal) storage[0]).add(coalQuantity);
        }

    }


    public int getRemainingCoal(){
        return ((Coal) storage[0]).getQuantity();
    }

}
