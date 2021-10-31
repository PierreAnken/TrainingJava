package train;

import train.things.Person;
import train.wagons.*;

import java.util.List;

public class Train {
    private final Locomotive locomotive;
    private AWagon lastWagon;
    private int kilometers;

    public Train() {
        locomotive = new Locomotive();
        lastWagon = locomotive;
        kilometers = 0;
        System.out.println("We got a brand new train.");
    }

    public void addWagonInFront(AWagon wagon) {

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

        AWagon current = locomotive.getRearWagon();//on commence avec le premier wagon
        int toLoad = passengers.size();
        int seatAvailable = getRemainingSeat();

        while(toLoad>0 && seatAvailable > 0){

            List<Integer> placesLibre = current.getEmptyEmplacement();

            if(current.getType() != WagonType.PASSENGER || placesLibre.isEmpty()){
                current = current.getRearWagon();
                continue;
            }

            Person somePassenger = passengers.get(0);
            current.setContent(somePassenger, placesLibre.get(0));
            passengers.remove(somePassenger);
            toLoad--;
            seatAvailable--;
        }

        return passengers;
    }

    public void addWagonAtEnd(AWagon wagon) {
        wagon.setFrontWagon(lastWagon);
        lastWagon.setRearWagon(wagon);
        lastWagon = wagon;
    }

    public int countWagon() {
        AWagon current = locomotive.getRearWagon();
        int count = 0;
        while (current != null) {
            count += 1;
            current = current.getRearWagon();
        }
        return count;
    }

    public String getComposition() {
        AWagon current = locomotive.getRearWagon();
        StringBuilder composition = new StringBuilder("<[] __]");
        while (current!= null) {
            if (current.getType() == WagonType.PASSENGER) {
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

        AWagon current = locomotive.getRearWagon();
        double totalWeight = 0;

        while (current!= null) {
            if (current.getType() == wagonType || wagonType == null) {
                totalWeight += current.getStorageWeight();
            }
            current = current.getRearWagon();
        }
        return totalWeight;
    }

    public void run(int km) {
        System.out.println("We received the order to run "+km+ " km");
        int consumptionByKM = countWagon() * 2;
        while(locomotive.consume(consumptionByKM) && km > 0){
            kilometers++;
            km--;
        }
        System.out.println("The train stop at kilometer "+kilometers);
    }

    public void addWagonAtPosition(WagonType wagonType, int position) {

        AWagon wagonFront = locomotive;
        int currentPosition = 0;

        // We move one step before the position
        while(wagonFront.getRearWagon() != null && currentPosition < position-1) {
            wagonFront = wagonFront.getRearWagon();
            currentPosition++;
        }

        AWagon wagonRear = wagonFront.getRearWagon();

        AWagon newWagon;
        if(wagonType == WagonType.PASSENGER){
            newWagon = new PassengerWagon();
        }else{
            newWagon = new MerchandiseWagon();
        }

        newWagon.setRearWagon(wagonRear);
        newWagon.setFrontWagon(wagonFront);

        wagonFront.setRearWagon(newWagon);

        if(wagonRear == null){
            lastWagon = newWagon;
        }else{
            wagonRear.setFrontWagon(newWagon);
        }
    }
}
