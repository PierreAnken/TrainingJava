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
       
    }

    public int getRemainingCoal(){
        return 0;
    }

}
