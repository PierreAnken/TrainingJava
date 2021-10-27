package train;

import train.wagons.AWagon;
import train.wagons.Locomotive;
import train.wagons.MerchandiseWagon;
import train.wagons.PersonWagon;

public class Train {
    private final Locomotive locomotive;
    private AWagon lastWagon;

    public Train(){
        locomotive = new Locomotive();
        lastWagon = locomotive;
        System.out.println("We got a brand new train.");
    }

    public void addWagonAtStart(AWagon wagon){
        wagon.setFrontWagon(locomotive);

        // If we already have wagon
        if (locomotive.getRearWagon() != null) {
            locomotive.getRearWagon().setFrontWagon(wagon);
        }
        else{
            // we are the last one
            lastWagon = wagon;
        }
        locomotive.setRearWagon(wagon);
    }

    public void addWagonAtEnd(AWagon wagon){
        wagon.setFrontWagon(lastWagon);
        lastWagon.setRearWagon(wagon);
        lastWagon = wagon;
    }

    public int countWagon(){
        AWagon current = locomotive;
        int count = 0;
        while(current.getRearWagon() != null){
            count += 1;
            current = current.getRearWagon();
        }
        return count;
    }

    public void add10Wagons(){
        // We add 6 PersonWagon and 3 MerchandiseWagon
        for (int i = 0; i < 10; i++) {
            if (i < 6) {
                PersonWagon personWagon = new PersonWagon();
                addWagonAtEnd(personWagon);

            } else {
                MerchandiseWagon merchandiseWagon = new MerchandiseWagon();
                addWagonAtEnd(merchandiseWagon);
            }
        }
    }

    public String getComposition(){
        AWagon current = locomotive;
        StringBuilder composition = new StringBuilder();
        while(current.getRearWagon() != null){
            if(current.getType() == WagonType.LOCOMOTIVE){
                composition.append("<[]__]");
            }
            else if(current.getType() == WagonType.PEOPLE){
                composition.append("-[o o o]");
            }else{
                composition.append("-[x x]");
            }
            current = current.getRearWagon();
        }
        return composition.toString();
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public AWagon getLastWagon() {
        return lastWagon;
    }

}
