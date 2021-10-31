package train;

import train.things.Person;
import train.wagons.*;

import java.util.List;

public class Train {
    private final Locomotive locomotive;
    private AWagon lastWagon;
    private int kilometers;

    public Train() {
        // TODO: Implements
    }

    public void addWagonInFront(AWagon wagon) {

        // TODO: Implements
    }

    public int getRemainingSeat(){
        // TODO: Implements
    }

    public List<Person> loadPassengers(List<Person> passengers) {

        // TODO: Implements
    }

    public void addWagonAtEnd(AWagon wagon) {
        // TODO: Implements
    }

    public int countWagon() {
        // TODO: Implements
    }

    public String getComposition() {
        // TODO: Implements
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public AWagon getLastWagon() {
        return lastWagon;
    }

    public void addWagons(int passengers, int merchandise) {

        for (int i = 0; i < passengers; i++) {
            addWagonAtEnd(new PassengerWagon());
        }

        for (int i = 0; i < merchandise; i++) {
            addWagonAtEnd(new MerchandiseWagon());
        }
    }

    public double getThingsWeight(WagonType wagonType){
        // Return wagons weight by wagonType. If wagonType is null take all.

        // TODO: Implements
    }

    public void run(int km) {
        // TODO: Implements
    }

    public void addWagonAtPosition(WagonType wagonType, int position) {

        // TODO: Implements
    }
}
