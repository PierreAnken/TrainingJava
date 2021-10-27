package train;

import train.things.Person;
import train.wagons.*;

import java.util.List;

public class Train {
    private final Locomotive locomotive;
    private AWagon lastWagon;

    public Train() {
        

    }

    public void addWagonAtStart(AWagon wagon) {


    }

    public int getRemainingSeat(){

        return 0;
    }

    public List<Person> loadPassengers(List<Person> passengers) {




        return passengers;
    }

    public void addWagonAtEnd(AWagon wagon) {


    }

    public int countWagon() {

        return 0;
    }

    public String getComposition() {

        return "";
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public AWagon getLastWagon() {
        return lastWagon;
    }

    public void add10Wagons() {
        // We add 6 PersonWagon and 3 MerchandiseWagon
        for (int i = 0; i < 10; i++) {
            if (i > 2) {
                PassengerWagon personWagon = new PassengerWagon();
                addWagonAtEnd(personWagon);
            } else {
                MerchandiseWagon merchandiseWagon = new MerchandiseWagon();
                addWagonAtEnd(merchandiseWagon);
            }
        }
    }

}
