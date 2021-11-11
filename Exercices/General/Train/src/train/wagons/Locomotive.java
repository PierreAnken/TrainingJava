package train.wagons;

import train.things.Coal;

public class Locomotive extends AWagon {

    public Locomotive(){
        super(WagonType.LOCOMOTIVE);
        storage = new Coal[1];
    }

    public void refuel(int coalQuantity){
        // TODO: Implements

    }


    public int getRemainingCoal(){
        return storage[0].getQuantity();
    }

    public boolean consume(int coalQuantity){

        // TODO: Implements
    }

}
