package train.wagons;

import train.things.Coal;

public class Locomotive extends AWagon {

    public Locomotive(){
        super(WagonType.LOCOMOTIVE);
        storage = new Coal[1];
    }

    public void refuel(int coalQuantity){


    }


    public int getRemainingCoal(){
        return ((Coal) storage[0]).getQuantity();
    }

}
