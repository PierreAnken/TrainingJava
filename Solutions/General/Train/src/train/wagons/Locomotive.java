package train.wagons;

import train.things.Coal;

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
        return storage[0].getQuantity();
    }

    public boolean consume(int coalQuantity){

        if(storage[0] == null){
            System.out.println("No coal in locomotive");
            return false;

        }else if(storage[0].getQuantity() < coalQuantity ){
            System.out.println("Locomotive is out of coal");
            return false;

        }else{

            ((Coal)storage[0]).add(-coalQuantity);
            return true;
        }
    }

}
