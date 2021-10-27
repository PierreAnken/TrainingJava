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
        
    }

    public void addWagonAtEnd(AWagon wagon){
       
    }

    public int countWagon(){
        return 0;
    }

    public void add10Wagons(){
        // We add 6 PersonWagon and 3 MerchandiseWagon
        
    }

    public String getComposition(){
        return "";
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public AWagon getLastWagon() {
        return lastWagon;
    }

}
