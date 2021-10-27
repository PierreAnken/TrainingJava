package train;

import train.things.Person;
import train.wagons.*;

import java.util.List;

public class Train {
    private final Locomotive locomotive;
    private AWagon lastWagon;

    public Train() {
        locomotive = new Locomotive();
        lastWagon = locomotive;
        System.out.println("We got a brand new train.");
    }

    public void addWagonAtStart(AWagon wagon) {

        // If we already have wagon
        if (locomotive.getRearWagon() != null) {
            locomotive.getRearWagon().setFrontWagon(wagon);
            wagon.setRearWagon(locomotive.getRearWagon());
        } else {
            // we are the last one
            lastWagon = wagon;
        }

        wagon.setFrontWagon(locomotive);
        locomotive.setRearWagon(wagon);
    }

    public int getRemainingSeat(){
        int remainingSeatAmount = 0;

        AWagon current = locomotive.getRearWagon();

        while (current != null) {
            if(current.getType() == WagonType.PASSENGER){
                remainingSeatAmount += current.getEmptyEmplacement().size();
            }
            current = current.getRearWagon();
        }
        return remainingSeatAmount;
    }

    public List<Person> loadPassengers(List<Person> passengers) {

        AWagon wagon = locomotive.getRearWagon();

        //we move from wagon to wagon and fill them
        while (wagon != null && passengers.size() > 0) {

            if (wagon.getType() == WagonType.PASSENGER) {

                //we move from free seat to free seat and fill them
                while (wagon.getEmptyEmplacement().size() > 0 && passengers.size() > 0) {
                    List<Integer> remainingSeats = wagon.getEmptyEmplacement();

                    //we put the passenger in seat
                    while (remainingSeats.size() > 0 && passengers.size() > 0) {
                        Person passenger = passengers.get(0);
                        passengers.remove(passenger);

                        int freeSeatNbr = remainingSeats.get(0);
                        remainingSeats.remove(0);
                        if(wagon.getContent(freeSeatNbr) != null)
                            System.out.println("not empty seat!");
                        wagon.setContent(passenger, freeSeatNbr);
                    }
                }
            }
            wagon = wagon.getRearWagon();
        }
        // we return the passengers which were not able to get a seat
        if(passengers.size() > 0){
            System.out.println("Sorry, the train is full you have to wait the next one.");
        }
        return passengers;
    }

    public void addWagonAtEnd(AWagon wagon) {
        wagon.setFrontWagon(lastWagon);
        lastWagon.setRearWagon(wagon);
        lastWagon = wagon;
    }

    public int countWagon() {
        AWagon current = locomotive;
        int count = 0;
        while (current.getRearWagon() != null) {
            count += 1;
            current = current.getRearWagon();
        }
        return count;
    }

    public String getComposition() {
        AWagon current = locomotive;
        StringBuilder composition = new StringBuilder();
        while (current!= null) {
            if (current.getType() == WagonType.LOCOMOTIVE) {
                composition.append("<[]__]");
            } else if (current.getType() == WagonType.PASSENGER) {
                composition.append("-[ p ]");
            } else {
                composition.append("-[ m ]");
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
